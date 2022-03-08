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
            System.out.println("\n1. Añadir al inicio");
            System.out.println("2. Añadir al final");
            System.out.println("3. Mostrar");
            System.out.println("4. Eliminar el primer elemento");
            System.out.println("5. Eliminar el último elemento");
            System.out.println("6. Eliminar elemento seleccionado");
            System.out.println("7. Buscar");
            System.out.println("8. Salir");
            eleccion  = sc.nextInt();
            
            switch (eleccion){
                case 1: añadir();
                        break;
                case 2: añadirFinal();
                        break;
                case 3: lista.mostrarLista();
                        break;
                case 4: System.out.println("elemento eliminado: [" + lista.borrarInicio() + "]");
                        break;
                case 5: System.out.println("elemento eliminado: [" + lista.borrarFinal() + "]");
                        break;
                case 6: System.out.println("elemento eliminado: [" + lista.borrarSeleccion() + "]");
                        break;
                case 7: System.out.println("Elemento encontrado: [" + lista.buscarElemento() + "]");
                        break;
                case 8: salir = true;
                        break;
                case 9: default: System.out.println("La opción que seleccionó no"
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
    
    public static void añadirFinal(){
        char elemento = 0;
        System.out.println("Ingrese el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        lista.AgregarFinal(elemento);
    }
}
