/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author LENOVO
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int numero = 2;
    int contador = 4;
    String resultado = "";
    
    while (numero <= 90) {
        resultado = String.format("%s\n%d",resultado,numero);
        numero = numero + contador;
        contador = contador + 2;
        
    }
    System.out.printf("%s\n", resultado);
    
    }
    
}
