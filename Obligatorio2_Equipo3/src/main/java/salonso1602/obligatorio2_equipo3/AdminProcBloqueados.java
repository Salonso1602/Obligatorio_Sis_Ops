/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonso1602.obligatorio2_equipo3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author gatom
 */
public class AdminProcBloqueados {
    private LinkedList<Proceso> procesosBloqueados;
    private static AdminProcBloqueados instance;
    
    
    public static AdminProcBloqueados getInstance(){
        if (instance == null){
            instance = new AdminProcBloqueados();
            return instance;
        }
        else{
            return instance;
        }
    }
    public AdminProcBloqueados(){
        procesosBloqueados = new LinkedList<>();
    }
    
    public void addBloqueado(Proceso procesoBloqueado){
        this.procesosBloqueados.add(procesoBloqueado);
    }
    
    public LinkedList[] getDesbloqueados(int quantumPasado){
        //primero actualizo los bloqueados con el tiempo que paso en el ultimo
        //ciclo (un quantum), si se desbloquean los saco aparte
        LinkedList<Proceso>[] result = new LinkedList[99];
        for (int i = 0; i < 99; i++){
            result[i] = new LinkedList<>();
        }
        
        LinkedList<Proceso> aux = new LinkedList<>();
        for (int t = 0; t < quantumPasado; t++){
            for (Proceso proc : procesosBloqueados){
                if (proc.getEstadoActual() == Proceso.Estados.BloqueadoES){
                    proc.addTiempoEnES(1);
                    if (proc.updateEstadoActual() != Proceso.Estados.BloqueadoES){
                        result[proc.getPrioridad()-1].add(proc);
                        aux.add(proc);
                    }
                } else{
                    if (proc.getEstadoActual() != Proceso.Estados.Bloqueado){
                        result[proc.getPrioridad()-1].add(proc);
                        aux.add(proc);
                    }
                }
            }
        }
        for (Proceso proc : aux){
            procesosBloqueados.remove(proc);
        }
        return result;
    }
    
    public Proceso getProc(String id){
        for(Proceso proc : procesosBloqueados){
            if (proc.getID().equals(id)){
                return proc;
            }
        }
        return null;
    }
    
    public String printListaConMotivo(){
        String result = "";
        for (Proceso proc : procesosBloqueados){
            result += proc.getNombre() + "("+proc.getID()+")" + ":" + proc.getEstadoActual().toString() + ", ";
        }
        if(result.length() > 3){
            return result.substring(0, result.length()-2);
        }
        return "";
    }
    
    public String[] listaBloqUser(){
        ArrayList<String> res = new ArrayList<>();
        for (Proceso proc : procesosBloqueados){
            if(proc.getEstadoActual() == Proceso.Estados.Bloqueado){
                res.add(proc.getNombre()+":"+proc.getID());
            }
        }
        return res.toArray(new String[0]);
    }
}
