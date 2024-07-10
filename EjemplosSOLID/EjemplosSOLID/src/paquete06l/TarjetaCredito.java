/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author StarMedia
 */
public class TarjetaCredito {

    private String nombre;
    private String numero;

    public TarjetaCredito(String name, String number) {
        nombre = name;
        numero = number;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerNumero(String x) {
        numero = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNumero() {
        return numero;
    }
}
