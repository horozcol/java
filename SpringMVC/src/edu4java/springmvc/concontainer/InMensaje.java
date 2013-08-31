/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu4java.springmvc.concontainer;

import java.util.Scanner;

/**
 *
 * @author hugo.orozco
 */
public class InMensaje {

    public static void main(String[] s) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el mensaje que desea enviar\n");
        String mensaje = (String) scanner.nextLine();
        System.out.println("Ingrese la prioridad del mensaje que desea enviar\n");
        String prioridad = (String) scanner.nextLine();
        CustumerRelationOffice custumerRelationOffice = (CustumerRelationOffice) new CustumerRelationOffice();
        if (prioridad.equalsIgnoreCase("normal")) {
            custumerRelationOffice.sendNormal(mensaje);
        }
        if (prioridad.equalsIgnoreCase("urgente")) {
            custumerRelationOffice.sendUrgente(mensaje);
        }
        if(prioridad.equalsIgnoreCase("todo")){
            custumerRelationOffice.sendAll(mensaje);
        }

    }
}
