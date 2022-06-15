/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonso1602.obligatorio2_equipo3;
import java.util.*;
/**
 *
 * @author gatom
 */
public class Proceso {
    public static enum Estados{
        Listo,
        Bloqueado,
        BloqueadoES,
        Finalizado
    }
    private Estados estadoActual;
    private static int NivelesPrioridad = 50;
    private int prioridad;
    private int tiempoEjecucion;
    private int tiempoEjecutado;
    private int periodoInterrupcionES;
    private int largoInterrupcionES;
    private int tiempoEnES;
    private String nombre;
    private boolean UserOrSO; //SO = True, User = False
    private String id;
    
    public Proceso(String nombreProceso, int Prioridad, int tiempoDeCPU, int periodoIntES, int largoIntEs, String ID, boolean EsUserOEsSO){
        nombre = nombreProceso;
        if(EsUserOEsSO)
        {
           prioridad = Prioridad; 
        }
        else
        {
            if(Prioridad>49)
            {
                prioridad = Prioridad;
            }
            else
            {
               prioridad = Prioridad +50; 
            }    
        }
        tiempoEjecucion = tiempoDeCPU;
        periodoInterrupcionES = periodoIntES;
        largoInterrupcionES = largoIntEs;
        tiempoEjecutado = 0;
        tiempoEnES = 0;
        estadoActual = Estados.Listo;
        id = ID;
        UserOrSO = EsUserOEsSO;
    }
    
    public Estados updateEstadoActual(){
        if (estadoActual == Estados.Bloqueado){
            return estadoActual;
        }
        if(tiempoEjecutado >= tiempoEjecucion){
            this.estadoActual = Estados.Finalizado;
            System.out.println(this.id + " Termine!");
            return estadoActual;
        } else if(periodoInterrupcionES > 0 && tiempoEjecutado % periodoInterrupcionES == 0 && estadoActual == Estados.Listo){
            this.estadoActual = Estados.BloqueadoES;
            return estadoActual;
        }else if(tiempoEnES >= largoInterrupcionES && estadoActual == Estados.BloqueadoES){
            this.estadoActual = Estados.Listo;
            tiempoEnES = 0;
            return estadoActual;
        }
        else{
            
            return estadoActual;
        }
    }
    
    public String getData(){
        String res = "";
        res += "Nombre: " + getNombre() + "\n";
        res += "ID: " + getID()+ "\n";
        res += "Estado: " + getEstadoActual().toString()+ "\n";
        res += "Nivel de Prioridad: " + getPrioridad()+ "\n";
        res += "Tiempo Ejecución: " + getTiempoEjecutado() + "/" + getTiempoEjecucion() + "\n";
        res += "Periodo de Interrupción: " + getPeriodoES()+ "\n";
        res += "Largo de Interrupción: " + getLargoES()+ "\n";
        
        if (UserOrSO){
            res += "Es de nivel: SO\n";
        }
        else{
            res += "Es de nivel: USER\n";
        }
        
        return res;
    }
    
    public Estados getEstadoActual(){
            return estadoActual;
    }

    public void BloquearProceso(){
        this.estadoActual = Estados.Bloqueado;
    }
    public Estados DesbloquearProceso(){
        this.estadoActual = Estados.Listo;
        return getEstadoActual();
    }
    
    public int getPrioridad(){
        return this.prioridad;
    }
    public int getTiempoEjecucion(){
        return this.tiempoEjecucion;
    }
    public int getTiempoEjecutado(){
        return this.tiempoEjecutado;
    }
    public int getPeriodoES(){
        return this.periodoInterrupcionES;
    }
    public int getLargoES(){
        return this.largoInterrupcionES;
    }
    public int getTiempoEnES(){
        return this.tiempoEnES;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getID()
    {
        return this.id;
    }
    
    public void setEstadoActual(Estados estado){
        this.estadoActual = estado;
    }
    
    public void setPrioridad(int prioridadNueva){
        if(UserOrSO)
        {
           prioridad = prioridadNueva; 
        }
        else
        {
            if(prioridadNueva>49)
            {
                prioridad = prioridadNueva;
            }
            else
            {
               prioridad = prioridadNueva +50; 
            }    
        }
    }
    
    public void setTiempoEjecucion(int tiempoNuevo){
        this.tiempoEjecucion = tiempoNuevo;
    }
    public void setTiempoEjecutado(int tiempoNuevo){
        this.tiempoEjecutado = tiempoNuevo;
    }
    public void addTiempoEjecutado(int tiempoAgregado){
        this.tiempoEjecutado += tiempoAgregado;
    }
    public void setPeriodoES(int tiempoNuevo){
        this.periodoInterrupcionES = tiempoNuevo;
    }
    public void setLargoES(int tiempoNuevo){
        this.largoInterrupcionES = tiempoNuevo;
    }
    public void setTiempoEnES(int tiempoNuevo){
        this.tiempoEnES = tiempoNuevo;
    }
    public void addTiempoEnES(int tiempoAgregar){
        this.tiempoEnES += tiempoAgregar;
    }
    public void setNombre(String nombreNuevo){
        this.nombre = nombreNuevo;
    }
}
