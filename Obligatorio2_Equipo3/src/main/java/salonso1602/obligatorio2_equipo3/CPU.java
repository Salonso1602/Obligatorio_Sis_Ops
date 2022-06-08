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
    public CPU()
    {
        this.procesoCargado = null;
    }
    
    public Proceso getProcesoCargado()
    {
        return this.procesoCargado;
    }
    
    public void setProcesoCargado(Proceso procesoACargar)
    {
        this.procesoCargado = procesoACargar;
    }
    
    //public void ejecutarProceso()
}
