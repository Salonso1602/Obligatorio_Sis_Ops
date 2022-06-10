/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package salonso1602.obligatorio2_equipo3;

/**
 *
 * @author gatom
 */
public class Obligatorio2_Equipo3 {

    public static void main(String[] args) {
        SingletonPlanificador.getInstance(new Planificador());
        SingletonPlanificador.getInstance(new Planificador()).value.pasarAEjecutables();
    }
}
