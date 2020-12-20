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
public class ListaCircular {
   private Nodo head;
    
    public Nodo getHead(){return head;}
    public void setHead(Nodo n){head = n;}
    
    public ListaCircular(){
        head = null;
    }
    
    public void Agregar(Nodo n){
        if(head == null){
            head = n;
            n.setNext(n);
            return;
        }
        Nodo h = head;
        if(n.getDato() < head.getDato()){
            while( h.getNext() != head){
                h = h.getNext();
            }
            h.setNext(n);
            n.setNext(head);
            head = n;
            return;
        }
        
        while( h.getNext() != head){
            if(n.getDato() < h.getNext().getDato()){
                break;
            }
            h = h.getNext();
        }
        
        n.setNext(h.getNext());
        h.setNext(n);
    }
    
    public void Borrar(int dato){
        Nodo h = head;
        if(head != null){
            if(head.getDato() == dato){
                while(h.getNext() != head){
                    h = h.getNext();
                }
                head = head.getNext();
                h.setNext(head);
                return;
            }
            
            while(h.getNext().getDato() != dato){
                h = h.getNext();
            }
            h.setNext(h.getNext().getNext());
            
        }
    }
    
    public Boolean Buscar(int dato){
        Nodo h = head;
        if(h != null){
            do{
                if(h.getDato() == dato){
                    return true;    
                }
                h = h.getNext();
            }while (h != head);
        }return false;
    }
    
    public int ContarNodos(){
        int contador = 0;
        Nodo h = head;
        do{
            contador++;
            h = h.getNext();
        }while(h != head);
        return contador;
    }
    
    public String ToString(){
        String lista = "";
        Nodo h = head;
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
