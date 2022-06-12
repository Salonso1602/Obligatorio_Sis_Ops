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
    
    
    public Planificador(int nroCPUs, int quantum){
        this.quantum = quantum;
        for(int i = 0; i < nroCPUs; i++){
            procesadoresExistentes.add(new CPU());
        }
        for (int i = 0; i < 99; i++){
            listaListos[i] = new LinkedList<>();
        }
    }
    
    public void ejecutarRonda(){
        pasarAEjecutables();
        pasarBloqueadosAListos();
        
        for(CPU cpu : procesadoresExistentes){
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
                    System.out.println("Pase "+procEnCPU.getID()+" a BLOCK");
                }
            }
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
            if(cpu.getProcesoEnCPU()== null)
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
                    System.out.println("Pase "+proceso.getID()+" a CPU");
                    procesadoresUtilizables.remove(procesadoresUtilizables.size()-1);
                }
            }
        }
    }
    public void printBloqueados(){
        System.out.println(this.Bloqueados.printListaConMotivo());
    }
}
