/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salonso1602.obligatorio2_equipo3;

/**
 *
 * @author Néstor
 */
public final class SingletonPlanificador {
    private static SingletonPlanificador instance;
    public Planificador value;
    
    private SingletonPlanificador(Planificador value)
    {
        this.value = value;
    }
    
    public static SingletonPlanificador getInstance(Planificador value) {
        if (instance == null) {
            instance = new SingletonPlanificador(value);
        }
        return instance;
    }
    
    public Planificador getPlanner(){
        return this.value;
    }
}
