/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu4java.springmvc.concontainer;

import java.util.ArrayList;

/**
 *
 * @author hugo.orozco
 */
public class CustumerRelationOffice {

    public DeliveryServiceInterf deliveryService = (DeliveryServiceInterf) Container.getComponent("deliveryService");
    // DeliveryServiceInterf deliveryService = new MailDeliveryService();
    ArrayList<String> messages = new ArrayList<String>();

    public void sendUrgente(String mensaje) {
        deliveryService.sendUrgente(mensaje);
    }

    public void sendNormal(String mensaje) {
        deliveryService.sendNormal(mensaje);
    }

    public void sendAll(String tMensaje) {
        messages.add(tMensaje);
        System.out.println("tamaño de messages " + messages.size());
        for (String mensaje : messages) {
            deliveryService.sendNormal(mensaje);
        }

    }
}
