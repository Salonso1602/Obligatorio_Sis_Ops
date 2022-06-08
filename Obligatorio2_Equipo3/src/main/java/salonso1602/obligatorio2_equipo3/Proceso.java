/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonso1602.obligatorio2_equipo3;

/**
 *
 * @author gatom
 */
public class Proceso {
    public static enum Estados{
        Listo,
        Bloqueado,
        Finalizado
    }
    private Estados estadoActual;
    
    private int prioridad;
    private int tiempoEjecucion;
    private int tiempoEjecutado;
    private int periodoInterrupcionES;
    private int largoInterrupcionES;
    private String id;
    
    public Proceso(String nombreProceso, int Prioridad, int tiempoDeCPU, int periodoIntES, int largoIntEs){
        id = nombreProceso;
        prioridad = Prioridad;
        tiempoEjecucion = tiempoDeCPU;
        periodoInterrupcionES = periodoIntES;
        largoInterrupcionES = largoIntEs;
        tiempoEjecutado = 0;
        estadoActual = Estados.Listo;
    }
    
    public Estados getEstadoActual(){
        if(tiempoEjecutado > tiempoEjecucion){
            this.estadoActual = Estados.Finalizado;
            return estadoActual;
        } else if(tiempoEjecutado % periodoInterrupcionES == 0){
            this.estadoActual = Estados.Bloqueado;
            return estadoActual;
        } else{
            this.estadoActual = Estados.Listo;
            return estadoActual;
        }
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
    public int getLargoES(int tiempoNuevo){
        return this.largoInterrupcionES;
    }
    public void getID(String nombreNuevo){
        this.id = nombreNuevo;
    }
    
    public void setEstadoActual(Estados estado){
        this.estadoActual = estado;
    }
    public void setPrioridad(int prioridadNueva){
        this.prioridad = prioridadNueva;
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
    public void setID(String nombreNuevo){
        this.id = nombreNuevo;
    }
}
