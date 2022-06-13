/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonso1602.obligatorio2_equipo3;

/**
 *
 * @author Néstor
 */
public class CPU {
    private Proceso procesoCargado;
    public boolean pideCambio;
    
    public CPU(){
        procesoCargado = null;
        pideCambio = false;
    }
    
    public void ejecutarProceso(int quantum){
        if (this.procesoCargado != null){
            for(int i = 0; i < quantum; i++){
                procesoCargado.addTiempoEjecutado(1);
                if (procesoCargado.updateEstadoActual() != Proceso.Estados.Listo){
                    if (procesoCargado.getEstadoActual() == Proceso.Estados.Finalizado){
                        procesoCargado = null;
                    }
                    pideCambio = true;
                    return;
                }
            }
            pideCambio = true;
        }
    }
    
    public Proceso getProcesoEnCPU(){
        return this.procesoCargado;
    }
    public void setProcesoEnCPU(Proceso otroProceso){
        this.procesoCargado = otroProceso;
        pideCambio = false;
    }
    
}
