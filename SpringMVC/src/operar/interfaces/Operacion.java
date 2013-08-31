/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operar.interfaces;

/**
 *
 * @author hugo.orozco
 */
public interface Operacion {

    long operar(long op1, long op2);

    String getOpNombre();
}
