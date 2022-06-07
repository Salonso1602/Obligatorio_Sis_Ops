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
}
