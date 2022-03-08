/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Lista {
    protected Nodo inicio, fin;
    static Scanner sc = new Scanner(System.in);
    public Lista() {
    inicio=null;
    fin=null;
    }
    public boolean estaVacia(){
	if(this.inicio == null){
		return true;
        }
	return false;
    }
    public void AgregarInicio(char elemento){
        inicio = new Nodo(elemento, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    public void AgregarFinal(char elemento){

    if(!estaVacia()){

	this.fin.siguiente = new Nodo(elemento);
	this.fin = this.fin.siguiente;

    } else {

	 inicio = fin = new Nodo(elemento);
        }
}
     public void mostrarLista(){
        Nodo aux = inicio;
        while(aux != null){
            if(aux.siguiente == null){
                System.out.print("[" + aux.dato + "]->Null");
            }else{
                System.out.print("[" + aux.dato + "]->");
            }
            aux = aux.siguiente;
        }
      }
 
    public char borrarInicio(){
    	char elemento = this.inicio.dato;
	if(this.inicio == this.fin){
		this.inicio = this.fin = null;

	}else{
		this.inicio=this.inicio.siguiente;
	}
	return elemento;     
    }
    public char borrarFinal(){

	char elemento = this.fin.dato;
	if (this.inicio==this.fin){
		this.inicio = this.fin = null;
	}else{
		Nodo aux = inicio;
		while(aux.siguiente !=this.fin){
			aux = aux.siguiente;
		}
		this.fin = aux;
		this.fin.siguiente=null;
	}
	
	return elemento;
}
    
    public char borrarSeleccion(){
        char elemento = 0;
        
        
        if(!estaVacia()){
            System.out.println("Escriba el elemento que desea eliminar");
            elemento = sc.next().charAt(elemento);
            if(this.inicio==this.fin && this.inicio.dato == elemento){
                this.inicio=this.fin=null;
            } else if (this.inicio.dato == elemento) {
                this.inicio = this.inicio.siguiente;
            } else{
                Nodo anterior, aux;
                anterior =this.inicio;
                aux = this.inicio.siguiente;
                
                while (aux != null && aux.dato != elemento){
                    anterior = anterior.siguiente;
                    aux = aux.siguiente;
                }
                if (aux !=null){
                    anterior.siguiente = aux.siguiente;
                    if (aux == this.fin){
                        this.fin = anterior;
                    }
                }
                
            }
        }else{
            System.out.println("No se eliminó nada");
        }
        return elemento;
    }
    
    public char buscarElemento(){
        char elemento = 0;
	System.out.println("Escriba el elemento que desea buscar");
        elemento = sc.next().charAt(elemento);
        
        boolean encontrado = false;	
	Nodo aux = inicio;
	while (aux !=null){
		if(aux.dato == elemento){
                    System.out.println("Dato encontrado: [" + aux.dato + "]");
			encontrado = true;
			break;
		}
	aux=aux.siguiente;
	}
	
	if(encontrado==false){
	System.out.println("No se encontró el elemento: [" + elemento + "]");
        }
        return elemento;
    }
}
