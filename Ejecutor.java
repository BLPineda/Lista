/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static Lista lista = new Lista();
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        boolean salir = false;
        int eleccion;
        
        while (!salir){
            System.out.println("\n\n---------------------------");
            System.out.println("\nSeleccione qué desea hacer");
            System.out.println("\n1. Añadir");
            System.out.println("2. Mostrar");
            System.out.println("3. salir");
            eleccion  = sc.nextInt();
            
            switch (eleccion){
                case 1: añadir();
                        break;
                case 2: lista.mostrarLista();
                        break;
                case 3: salir = true;
                        break;
                case 4: default: System.out.println("La opción que seleccionó no"
                        + " existe, seleccione otra");
                        break;
            }
        }
    }
    
    public static void añadir(){
        char elemento=0;
        System.out.println("Ingrese el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        lista.AgregarInicio(elemento);
    }
}
