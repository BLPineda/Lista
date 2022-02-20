/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author lenin
 */
public class Nodo {
    public char dato;
    public Nodo siguiente;

    public Nodo(char dato) {
        this.dato = dato;
    }

    public Nodo(char dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
}
