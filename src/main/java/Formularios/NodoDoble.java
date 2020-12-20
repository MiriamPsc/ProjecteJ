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
public class NodoDoble {
    private int dato;
    private NodoDoble next;
    private NodoDoble prev;
    
    public NodoDoble(){
        dato = 0;
        next = null;           
        prev = null;
    }
    
    public int getDato(){return dato;}
    public NodoDoble getNext(){return next;}
    public NodoDoble getPrev(){return prev;}
    public void setDato(int d){dato = d;}
    public void setNext(NodoDoble n){next = n;}
    public void setPrev(NodoDoble n){prev = n;}

    public String ToString(){
        return dato + "";
    }
}
