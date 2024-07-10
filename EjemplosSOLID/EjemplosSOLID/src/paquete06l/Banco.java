/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author StarMedia
 */
public class Banco {

    private String name;

    public Banco(String nombre) {
        name = nombre;
    }

    public void establecerNombre(String x) {
        name = x;
    }

    public String obtenerNombre() {
        return name;
    }
}
