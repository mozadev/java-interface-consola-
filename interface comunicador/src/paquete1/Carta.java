/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Jose
 */
public class Carta implements Comunicador {
    
       @Override
    public void enviarMensaje(String mensaje) {
         System.out.println("Carta enviando un mensaje: "+mensaje);
    }
    
}
