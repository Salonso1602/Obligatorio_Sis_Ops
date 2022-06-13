/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonso1602.obligatorio2_equipo3;

import java.util.LinkedList;

/**
 *
 * @author Néstor
 */
public class Planificador {
    private final AdminProcBloqueados Bloqueados = AdminProcBloqueados.getInstance();
    private LinkedList<Proceso>[] listaListos = new LinkedList[99];
    private LinkedList<CPU> procesadoresExistentes = new LinkedList<>();
    private int quantum;
    private StringBuilder logger;
    private int numRonda;
    
    
    public Planificador(int nroCPUs, int quantum){
        this.quantum = quantum;
        for(int i = 0; i < nroCPUs; i++){
            procesadoresExistentes.add(new CPU());
        }
        for (int i = 0; i < 99; i++){
            listaListos[i] = new LinkedList<>();
        }
        logger = new StringBuilder();
        numRonda = 0;
    }
    
    public void ejecutarRonda(int repeticiones){
        for (int i = 0; i < repeticiones; i++){
            logger.append("------------\n");
            logger.append("Ronda "+numRonda+":\n");
            pasarAEjecutables();
            pasarBloqueadosAListos();

            for (CPU cpu : procesadoresExistentes) {
                Proceso procEnCPU = cpu.getProcesoEnCPU();
                cpu.ejecutarProceso(quantum);
                if (procEnCPU != null) {
                    Proceso.Estados estadoProc = procEnCPU.getEstadoActual();
                    if (estadoProc != Proceso.Estados.Listo) {
                        listaListos[procEnCPU.getPrioridad() - 1].remove(procEnCPU);
                    }
                    if (estadoProc == Proceso.Estados.BloqueadoES
                            || estadoProc == Proceso.Estados.Bloqueado) {
                        Bloqueados.addBloqueado(procEnCPU);
                        logger.append("Pase " + procEnCPU.getID() + " a BLOCK\n");
                    }
                    if (estadoProc == Proceso.Estados.Listo) {
                        listaListos[procEnCPU.getPrioridad() - 1].remove(procEnCPU);
                        listaListos[procEnCPU.getPrioridad() - 1].addLast(procEnCPU);
                    }
                }
            }
            logger.append("------------\n");
            numRonda++;
        }
    }
    
    public void pasarBloqueadosAListos()
    {
        LinkedList<Proceso>[] desbloqueados = Bloqueados.getDesbloqueados(quantum);
        int i = 0;
        for(LinkedList<Proceso> procesos : desbloqueados)
        {
            listaListos[i].addAll(procesos);
            i++;
        }
    }
    
    public void agregarProcesoAListos(Proceso proceso)
    {
        listaListos[proceso.getPrioridad()-1].add(proceso);
    }
    
    public void pasarAEjecutables()
    {
        LinkedList<CPU> procesadoresUtilizables = new LinkedList<>();
        for(CPU cpu : procesadoresExistentes)
        {
            if(cpu.getProcesoEnCPU()== null || cpu.pideCambio)
            {
                procesadoresUtilizables.add(cpu);
            }
        }
        if(procesadoresUtilizables.isEmpty())
        {
            return;
        }
        for(int i = 0; i < 99;i++)
        {
            for(Proceso proceso : listaListos[i])
            {
                if(procesadoresUtilizables.isEmpty())
                {
                    return;
                }
                else
                {
                    procesadoresUtilizables.get(procesadoresUtilizables.size()-1).setProcesoEnCPU(proceso);
                    logger.append("Pase "+proceso.getID()+" a CPU\n");
                    procesadoresUtilizables.remove(procesadoresUtilizables.size()-1);
                }
            }
        }
    }
    public String printBloqueados(){
        return (this.Bloqueados.printListaConMotivo());
    }
    public String printListos(){
        StringBuilder sb = new StringBuilder();
        for (LinkedList<Proceso> lista : listaListos){
            for (Proceso proc : lista){
                sb.append(proc.getNombre()+":"+proc.getID() + "->");
            }
        }
        if (sb.length() > 1){
            return sb.toString().substring(0, sb.length()-2);
        } else {
            return  sb.toString();
        }
        
    } 
    
    public String[] printListaPrioridades(){
        String[] arr = new String [99];
        for (int i = 1; i < 100; i++){
            arr[i-1] = ""+i;
        }
        return arr;
    }
    
    public String[] printProcEnCola(String numCola){
        int index = Integer.parseInt(numCola)-1;
        String[] procs = new String[listaListos[index].size()];
        int i = 0;
        for (Proceso proc : listaListos[index]){
            procs[i] = proc.getNombre() +":"+proc.getID();
            i++;
        }
        return procs;
    }
    
    public String printProcsEnCPU(){
        String res = "";
        int i = 0;
        for (CPU cpu : procesadoresExistentes){
            if(cpu.getProcesoEnCPU() != null){
                res += "CPU "+ i +": "+ cpu.getProcesoEnCPU().getNombre()+":"+cpu.getProcesoEnCPU().getID() + "-";
            }
        }
        return res;
    }
    
    public Proceso getProcEnCola(int prioridad, String id){
        LinkedList<Proceso> lista = listaListos[prioridad-1];
        Proceso[] procs = lista.toArray(new Proceso[0]);
        for (Proceso proc : procs){
            if(proc.getID().equals(id)){
                return proc;
            }
        }
        return null;
    }
    public String getLog(){
        return logger.toString();
    }
}
