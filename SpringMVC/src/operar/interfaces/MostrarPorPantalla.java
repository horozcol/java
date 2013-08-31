/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operar.interfaces;

/**
 *
 * @author hugo.orozco
 */
public class MostrarPorPantalla implements EscribirResultado {

    public void mostrarResultado(String resultado) {
        System.out.println(resultado);
    }
}
