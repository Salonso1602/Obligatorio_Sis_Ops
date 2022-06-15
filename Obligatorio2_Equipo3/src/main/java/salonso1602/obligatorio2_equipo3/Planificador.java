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

    public Planificador(int nroCPUs, int quantum) {
        this.quantum = quantum;
        for (int i = 0; i < nroCPUs; i++) {
            procesadoresExistentes.add(new CPU(i));
        }
        for (int i = 0; i < 99; i++) {
            listaListos[i] = new LinkedList<>();
        }
        logger = new StringBuilder();
        numRonda = 0;
    }
    
    public int getQuantum()
    {
        return this.quantum;
    }
    
    public void setQuantum(int nuevoQuantum)
    {
        this.quantum = nuevoQuantum;
    }

    public void ejecutarRonda(int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            logger.append("------------\n");
            logger.append("Ronda " + numRonda + ":\n");
            pasarAEjecutables();
            LinkedList<Proceso>[] nuevosProcs = pasarBloqueadosAListos();
            for (LinkedList<Proceso> cola : nuevosProcs){
                if (!cola.isEmpty()){
                for (Proceso proc : cola){
                    logger.append(proc.getID() + " se desbloqueó\n");
                }
                }
            }
            
            for (CPU cpu : procesadoresExistentes) {
                Proceso procEnCPU = cpu.getProcesoEnCPU();
                cpu.ejecutarProceso(quantum);
                if (procEnCPU != null) {
                    Proceso.Estados estadoProc = procEnCPU.getEstadoActual();
                    if (estadoProc != Proceso.Estados.Listo) {
                        listaListos[procEnCPU.getPrioridad() - 1].remove(procEnCPU);
                    }
                    if (estadoProc == Proceso.Estados.BloqueadoES ||
                             estadoProc == Proceso.Estados.Bloqueado) {
                        Bloqueados.addBloqueado(procEnCPU);
                        logger.append(procEnCPU.getID() + " se bloqueó\n");
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

    public LinkedList<Proceso>[] pasarBloqueadosAListos()
    {
        LinkedList<Proceso>[] desbloqueados = Bloqueados.getDesbloqueados(quantum);
        int i = 0;
        for (LinkedList<Proceso> procesos : desbloqueados) {
            listaListos[i].addAll(procesos);
            i++;
        }
        return desbloqueados;
    }

    public void agregarProcesoAListos(Proceso proceso) {
        listaListos[proceso.getPrioridad() - 1].add(proceso);
    }

    public void pasarAEjecutables() {
        LinkedList<CPU> procesadoresUtilizables = new LinkedList<>();
        for (CPU cpu : procesadoresExistentes) {
            if (cpu.getProcesoEnCPU() == null || cpu.pideCambio) {
                procesadoresUtilizables.add(cpu);
            }
        }
        if (procesadoresUtilizables.isEmpty()) {
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
                    CPU cpu = procesadoresUtilizables.get(procesadoresUtilizables.size()-1);
                            cpu.setProcesoEnCPU(proceso);
                    logger.append("Pase "+proceso.getID()+" a CPU"+cpu.getID()+"\n");
                    procesadoresUtilizables.remove(procesadoresUtilizables.size()-1);
                }
            }
        }
    }

    public String printBloqueados() {
        return (this.Bloqueados.printListaConMotivo());
    }

    public String printListos() {
        StringBuilder sb = new StringBuilder();
        for (LinkedList<Proceso> lista : listaListos) {
            for (Proceso proc : lista) {
                sb.append(proc.getNombre() + ":" + proc.getID() + "->");
            }
        }
        if (sb.length() > 1) {
            return sb.toString().substring(0, sb.length() - 2);
        } else {
            return sb.toString();
        }

    }

    public String[] printListaPrioridades() {
        String[] arr = new String[99];
        for (int i = 1; i < 100; i++) {
            arr[i - 1] = "" + i;
        }
        return arr;
    }

    public String[] printProcEnCola(String numCola) {
        int index = Integer.parseInt(numCola) - 1;
        String[] procs = new String[listaListos[index].size()];
        int i = 0;
        for (Proceso proc : listaListos[index]) {
            procs[i] = proc.getNombre() + ":" + proc.getID();
            i++;
        }
        return procs;
    }

    public String printProcsEnCPU() {
        String res = "";
        for (CPU cpu : procesadoresExistentes) {
            if (cpu.getProcesoEnCPU() != null) {
                res += "CPU " + cpu.getID() + ": " + cpu.getProcesoEnCPU().getNombre() + ":" + cpu.getProcesoEnCPU().getID() + " - ";
            } else {
                res += "CPU " + cpu.getID() + ": Vacío - ";
            }
        }
        return res.substring(0, res.length() - 2);
    }

    public Proceso getProcEnCola(int prioridad, String id) {
        LinkedList<Proceso> lista = listaListos[prioridad - 1];
        Proceso[] procs = lista.toArray(new Proceso[0]);
        for (Proceso proc : procs) {
            if (proc.getID().equals(id)) {
                return proc;
            }
        }
        return null;
    }

    public Proceso getProc(String id) {
        for (LinkedList<Proceso> lista : listaListos) {
            for (Proceso proc : lista) {
                if (proc.getID().equals(id)) {
                    return proc;
                }
            }
        }
        return null;
    }

    public String getLog() {
        return logger.toString();
    }
}
