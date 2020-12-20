/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author miria
 */
public class ListaCircularDoble {
     private NodoDoble head;
    
    public NodoDoble getHead(){return head;}
    public void setHead(NodoDoble n){head = n;}
    
    public ListaCircularDoble(){
        head = null;
    }
    
    public void Agregar(NodoDoble n){
        NodoDoble h = head;
        if(head == null){
            head = n;
            head.setPrev(head);
            head.setNext(head);
            return;
        }
        
        if(n.getDato() < head.getDato()){
            head.getPrev().setNext(n);
            n.setPrev(head.getPrev());
            n.setNext(head);
            head.setPrev(n);
            head = n;
            return;
        }
        
        do{
            if( n.getDato() < h.getNext().getDato()){
                break;
            }
            h = h.getNext();
        }while( h != head);
        
        if(n.getDato() < h.getNext().getDato()){
            h.getNext().setPrev(n);
            n.setPrev(h);
            n.setNext(h.getNext());
            h.setNext(n);
        }else{
            n.setNext(h);
            n.setPrev(h.getPrev());
            h.getPrev().setNext(n);
            h.setPrev(n);      
        }
    }
    
    public boolean Buscar(int dato){
        NodoDoble h = head;
        if( h != null){
            do{
                if(h.getDato() == dato){
                    return true;
                }
                h = h.getNext();
            }while( h != head);
        }
        return false;
    }
    
    
    public int ContarNodos(){
        int contador = 0;
        if ( head != null){
            NodoDoble h = head;
            do{
                contador++;
                h = h.getNext();
            }while(h != head);
        }
        return contador;
    }
    
    public void Borrar(int dato){
        NodoDoble h = head;
        while(h.getNext() != head){
            if(h.getDato() == dato){
                break;
            }
            h = h.getNext();
        }
        h.getPrev().setNext(h.getNext());
        h.getNext().setPrev(h.getPrev());
        if(h == head){
            head = head.getNext();
        }
    }
    
    public String ToString(){
       String lista = "";
        NodoDoble h = head;
        if( h != null){
            lista += h.ToString();
            h = h.getNext();
            while(h != head){
             lista += "," + h.ToString();
             h = h.getNext();   
            }
            return lista;
        }else{
            return "La lista esta vacia";
        }
      
    }
}
