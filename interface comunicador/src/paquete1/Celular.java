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
public class Celular implements Comunicador     {
    
    @Override
    public void enviarMensaje(String mensaje){
        
        System.out.println("celular enviando mensaje: "+mensaje);
    }
    
}

