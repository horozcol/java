/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operar.interfaces;

/**
 *
 * @author hugo.orozco
 */
public class OpSumar implements Operacion {

    public OpSumar() {
    }

    public long operar(long op1, long op2) {
        return op1 + op2;
    }

    public String getOpNombre() {
        return " sumar ";
    }
;
}
