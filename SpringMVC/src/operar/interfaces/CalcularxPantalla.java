/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operar.interfaces;

/**
 *
 * @author hugo.orozco
 */
public class CalcularxPantalla {
    
    private Operacion operacion = new OpSumar();
    private Operacion operacionX = new OpMultiplicar();
    private EscribirResultado escribirResultado = new MostrarPorPantalla();
    
    public static void main(String[] s) {
        CalcularxPantalla calxpant = new CalcularxPantalla();
        calxpant.ejecutar(s);
    }
    
    public void ejecutar(String[] s) {
        long op1 = Long.valueOf(s[0]);
        long op2 = Long.parseLong(s[1]);
        escribirResultado.mostrarResultado(
                "El resultado de " + operacion.getOpNombre() + op1 + " y " + op2 + " es " + operacion.operar(op1, op2));
        escribirResultado.mostrarResultado("Si se quiere multiplicar " + op1 +
        " y "+op2 + " el resultado es " + operacionX.operar(op1, op2));



    }
}
