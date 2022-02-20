/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author lenin
 */
public class Lista {
    protected Nodo inicio, fin;

    public Lista() {
    inicio=null;
    fin=null;
    }
    
    public void AgregarInicio(char elemento){
        inicio = new Nodo(elemento, inicio);
        if (fin == null){
            fin = inicio;
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
      
}
