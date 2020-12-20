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
public class Nodo {
    private int dato;
    private Nodo next;
    
    public Nodo(){
        dato = 0;
        next = null;           
    }
    
    public int getDato(){return dato;}
    public Nodo getNext(){return next;}
    public void setDato(int d){dato = d;}
    public void setNext(Nodo n){next = n;}

    public String ToString(){
        return dato + "";
    }
}