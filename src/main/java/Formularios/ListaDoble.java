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
public class ListaDoble {
    private NodoDoble head;
    
    public NodoDoble getHead(){return head;}
    public void setHead(NodoDoble n){head = n;}
    
    public ListaDoble(){
        head = null;
    }
    
    public void Agregar(NodoDoble n){
        if(head == null){
            head = n;
            return;
        }
        if(n.getDato() < head.getDato()){
            n.setNext(head);
            head.setPrev(n);
            head = n;
            return;
        }
        
        NodoDoble h = head;
        
        while(h.getNext() != null){
            if(h.getNext().getDato() > n.getDato()){
                break;
            }
            h = h.getNext();
        }
        
        n.setNext(h.getNext());
        n.setPrev(h);
        
        if(h.getNext() != null){
            h.getNext().setPrev(n);
        }
        h.setNext(n);   
    }
    
    public void Borrar(int dato){
        if(head != null){
            if(head.getDato() == dato){
                head = head.getNext();
                head.setPrev(null);
                return;
            }
            NodoDoble h = head;
            
            while(h.getNext() != null){
                if(h.getNext().getDato() == dato){
                    break;
                }
                h = h.getNext();
            }
            
            if(h.getNext().getNext() == null){
                h.setNext(null);
            }else{
                h.setNext(h.getNext().getNext());
                h.getNext().setPrev(h);  
            }
        }
    }
    
    public boolean Buscar(int dato){
        NodoDoble h = head;
        if(h != null){
            while( h != null){
                if(h.getDato() == dato){
                    return true;
                }
                h = h.getNext();
            }
        }
        return false;
    }
    
    public int ContarNodos(){
        int contador = 0;
        NodoDoble h = head;
        while(h != null){
            contador++;
            h = h.getNext();
        }
        return contador;
    }
    
    public String ToString(){
        String lista = "";
        NodoDoble h = head;
        if(h != null){
            lista += h.ToString();
            h = h.getNext();
           while(h != null){
               lista += "," + h.ToString();
               h = h.getNext();
           }
           return lista;
        }else{
            return "La lista esta vacia";
        }
    }
}