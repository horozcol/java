/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operar.interfaces;

/**
 *
 * @author hugo.orozco
 */
public class OpMultiplicar implements Operacion {

    @Override
    public long operar(long op1, long op2) {
        return op1 * op2;
    }

    @Override
    public String getOpNombre() {
        return " multiplicar ";
    }
}
