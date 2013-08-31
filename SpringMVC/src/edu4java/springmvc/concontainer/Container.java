/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Esta clase es la encargada de entregar objetos de las clases y retornarlos
 * a traves del metodo getComponent(String componetName)
 */
package edu4java.springmvc.concontainer;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hugo.orozco
 */
public class Container {
    //mapa con <nombre_objeto, objeto>

    static Map<String, Object> components = initMap();

    private static Map<String, Object> initMap() {
        components = new HashMap<String, Object>();
        CustumerRelationOffice custumerRelationOffice = new CustumerRelationOffice();
        components.put("custumerRelationOffice", custumerRelationOffice);
        DeliveryServiceInterf deliveryService = new MailDeliveryService();
        components.put("deliveryService", deliveryService);
        System.out.println("Se inicia el contenedor");
        return components;

    }

    public static Object getComponent(String componetName) {
        return components.get(componetName);
    }
}
