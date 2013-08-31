/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu4java.springmvc.concontainer;



/**
 *
 * @author hugo.orozco
 */
public interface DeliveryServiceInterf {

    void sendNormal(String mensaje);

    void sendUrgente(String mensaje);

    void sendAll(String mensaje);
}
