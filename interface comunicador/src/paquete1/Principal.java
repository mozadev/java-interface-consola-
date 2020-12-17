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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Comunicador c1 =new Carta();
        
                 
        Comunicador c2 =new Celular();
        
        c2.enviarMensaje("hola, soy un celular");
        
       
        c1.enviarMensaje("enviando mi mensaje");
        
    }
    
}
