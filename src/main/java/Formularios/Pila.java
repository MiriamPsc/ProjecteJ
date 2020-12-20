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
public class Pila {
    private Nodo top;
    public Nodo getTop(){return top;}
    public void setTop(Nodo n){top = n;}
    
    
    public int getCount(){
    int c = 0;
    Nodo t = top;
    while(t != null){
        c++;
        t = t.getNext();
    }
    return c;
}
    public Pila(){
        top = null;
    }
    
    public void Push(Nodo n){
        n.setNext(top);
        top = n;
    }
    public Nodo Pop(){
        Nodo regreso = top;
        if (top != null){
            top = top.getNext();
        }
        return regreso;
    }
    
    public String ToString(){
        String stringpila = "";
        Nodo t = top;
        if(t != null){
        stringpila += t.ToString();
        t = t.getNext();
        while( t != null){
            stringpila += "," + t.ToString();
            t = t.getNext();
        }
        return stringpila;   
    }else{
            return "La pila esta vacia";
        }
    }
}
