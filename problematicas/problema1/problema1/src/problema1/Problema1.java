/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombredeljugador;
        String posicionenlacancha;
        String informacionapresentar = "Informacion de los jugadores\n";
        String salir;
        String listadeedades = "Lista de edades\n";
        int edad;
        double estatura;
        double promedioestatura = 0;
        double promedioedad = 0;
        boolean bandera = true;
        int contador = 0;
        int contador1 = 1;
        
        do {
            System.out.println("Ingrese su nombre y apellido del jugador "
            + contador);
            nombredeljugador = entrada.nextLine();
            System.out.println("Ingrese su edad del jugador ");
            edad = entrada.nextInt();
            System.out.println("Ingrese posicion en la cancha ");
            entrada.nextLine();
            posicionenlacancha = entrada.nextLine();
            System.out.println("Ingrese su estatura en metros ");
            estatura = entrada.nextDouble();
            System.out.println("Si desea salir ingrese (1) caso contrario "
            + "Ingrese otro numero ");
            entrada.nextLine();
            salir = entrada.nextLine();
            
            contador++;
            
            if (salir.equals("1")) {
                bandera = false;
            }
            informacionapresentar = String.format("%s"
                    + "%s.%s-%s-,edad %s,estructura %\n", 
                    informacionapresentar,
                    contador1,nombredeljugador,
                    posicionenlacancha,edad,estatura);
            listadeedades = String.format("%s%s\n",listadeedades,
                    edad);
            promedioedad = promedioedad + edad;
            promedioestatura = promedioestatura + estatura;
            
            contador1++;
            
        } while (bandera);
        promedioedad = promedioedad / contador;
        promedioestatura = promedioestatura / contador;
        System.out.printf(informacionapresentar);
        System.out.printf(listadeedades);
        System.out.print("Promedio de las edades:");
        System.out.println(promedioedad);
        System.out.print("Promedio de la estatura:");
        System.out.println(promedioestatura);
        }
    }
    

