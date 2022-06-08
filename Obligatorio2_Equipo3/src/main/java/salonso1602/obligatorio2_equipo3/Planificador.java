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
    private LinkedList<Proceso> listaBloqueados = new LinkedList<>();
    private LinkedList<Proceso> colaDeEjecutables = new LinkedList<>();
    private LinkedList<Proceso>[] listaListos = new LinkedList[99];
    private LinkedList<CPU> procesadoresExistentes = new LinkedList<>();
    
    public void pasarBloqueadosAListos()
    {
        for(Proceso proceso : listaBloqueados)
        {
            if(proceso.getEstadoActual().toString().equals("Listo"))
            {
                agregarProcesoAListos(proceso);
                System.out.println("Pasé el proceso "+ proceso.getNombre()+" a listos.");
            }
        }
    }
    
    public void agregarProcesoAListos(Proceso proceso)
    {
        listaListos[proceso.getPrioridad()].add(proceso);
    }
    
    public void pasarAEjecutables()
    {
        LinkedList<CPU> procesadoresUtilizables = new LinkedList<>();
        for(CPU cpu : procesadoresExistentes)
        {
            if(cpu.getProcesoCargado() != null)
            {
                procesadoresUtilizables.add(cpu);
            }
        }
        if(procesadoresUtilizables.isEmpty())
        {
            return;
        }
        for(int i = 0; i<=99;i++)
        {
            for(Proceso proceso : listaListos[i])
            {
                if(procesadoresUtilizables.isEmpty())
                {
                    return;
                }
                else
                {
                    procesadoresUtilizables.get(procesadoresUtilizables.size()-1).setProcesoCargado(proceso);
                    colaDeEjecutables.add(proceso);
                    System.out.println("Pasé "+proceso.getNombre()+"a CPU");
                    procesadoresUtilizables.remove(procesadoresUtilizables.size()-1);
                }
            }
        }
    }
}
