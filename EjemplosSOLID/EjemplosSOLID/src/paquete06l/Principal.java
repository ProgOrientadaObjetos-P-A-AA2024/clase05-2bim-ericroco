/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Banco bank = new Banco("Pichincha");

        TarjetaCredito card = new TarjetaCredito("Visa", "1900897917", bank);

        MayorEdad representante = new MayorEdad("José", card);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:\nBanco: %s\nNombre Tarjeta:%s\nNumero:%s\n",
                menor.obtenerNombre(),menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero());

    }
}
