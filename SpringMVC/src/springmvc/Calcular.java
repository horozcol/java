/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springmvc;

/**
 *
 * @author hugo.orozco
 */
public class Calcular {

    public Calcular() {
    }

    public static void main(String[] arg) {
        Calcular calcular = new Calcular();
        calcular.ejecutar(arg);

    }

    public void imprimir(String s) {
        System.out.println(s);
    }

    public String getOpNombre() {
        return " mas ";
    }

    public long operar(long op1, long op2) {
        return op1 + op2;
    }

    public void ejecutar(String[] arg) {
        long op1 = Long.valueOf(arg[0]);
        long op2 = Long.parseLong(arg[1]);
        imprimir("El resultado de " + op1 + getOpNombre() + op2 + " es " + operar(op1, op2));


    }
}
