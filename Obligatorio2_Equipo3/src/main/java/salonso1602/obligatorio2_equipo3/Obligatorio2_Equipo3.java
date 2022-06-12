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
        Planificador planner = SingletonPlanificador.getInstance(new Planificador(1,3)).value;
        Proceso p1 = new Proceso("p1", 1, 55, 5, 10);
        Proceso p2 = new Proceso("p2", 8, 9, 6, 20);
        Proceso p3 = new Proceso("p3", 77, 184, 0, 0);
        
        planner.agregarProcesoAListos(p1);
        planner.agregarProcesoAListos(p2);
        planner.agregarProcesoAListos(p3);
        
        int i = 0;
        while (i < 90){
            System.out.println("Ronda" + i);
            planner.ejecutarRonda();
            planner.printBloqueados();
            System.out.println("-----------");
            i++;
        }
    }
}
