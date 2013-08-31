/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu4java.springmvc.concontainer;

/**
 *
 * @author hugo.orozco
 */
public class MailDeliveryService implements DeliveryServiceInterf {

    @Override
    public void sendNormal(String mensaje) {
        System.out.println("Se envía el mensaje: " + mensaje + " con prioridad normal.");
    }

    @Override
    public void sendUrgente(String mensaje) {
        System.out.println("Se envía el mensaje: " + mensaje + " con prioridad URGENTE !!!.");
    }

    @Override
    public void sendAll(String mensaje) {
        System.out.println("Se envía el mensaje: " + mensaje);
    }
}
