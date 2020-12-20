/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author miria
 */
public class ListaEnlazada {
    private Nodo head;
    
    public Nodo getHead(){return head;}
    public void setHead(Nodo n){head = n;}
    
    public ListaEnlazada(){
        head = null;
    }
    
    public void Borrar(int dato){
        if(head != null){
            if(head.getDato() == dato){
                head = head.getNext();
                return;
            }
            Nodo h = head;
            while(h.getNext() != null){
                if(h.getNext().getDato() == dato){
                    h.setNext(h.getNext().getNext());
                    return;
                }
                h = h.getNext();    
            }
            JOptionPane.showMessageDialog(null, "No se encontro el dato a eliminar");
        }
    }
    
    public void Agregar(Nodo n){
        if(head == null){
            head = n;
            return;
        }
        if(n.getDato() < head.getDato()){
            n.setNext(head);
            head = n;
            return;
        }
        Nodo h = head;
        while(h.getNext() != null){
            if(h.getNext().getDato() > n.getDato()){
                break;
            }
            h = h.getNext();
        }
        if(h.getNext() != null){
            n.setNext(h.getNext());
            h.setNext(n);
            return;
        }
        h.setNext(n);
    }
    
    public boolean Buscar(int dato){
        Nodo h = head;
        if(h != null){
            while(h != null){
                if(h.getDato() == dato){
                    return true;
                }
                h = h.getNext();
            }
           
        } return false;
    }
    
    public int ContarNodos(){
        int contador = 0;
        Nodo h = head;
        while ( h != null){
            contador++;
            h = h.getNext();
        }
        return contador;
    }
    
    public String ToString(){
        String lista = "";
        Nodo h = head;
        if (h != null){
            lista += h.ToString();
            h = h.getNext();
            while( h != null){
                lista += "," + h.ToString();
                h = h.getNext();
            }
            return lista;
        } return "La lista esta vacia";
    }
}
