/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.util.LinkedList;

/**
 *
 * @author miria
 */
public class ArbolBinario {
    private NodoArbol raiz;
    private int num_nodos;
    private int alt;

    public ArbolBinario() {
        raiz = null;
        num_nodos = 0;
        alt = 0;
    }
    
    //Metodo para insertar un dato en el arbol...no acepta repetidos :)
    public void insertar(int dato){
       if(existe(dato))return;
       NodoArbol nuevo = new NodoArbol(dato);
          if (raiz == null)
              raiz = nuevo;
          else
          {
              NodoArbol anterior = null;
              NodoArbol tmp = raiz;
              while (tmp != null)
              {
                  anterior = tmp;
                  if (dato < tmp.getDato())
                      tmp = tmp.getIzq();
                  else
                      tmp = tmp.getDer();
              }
              if (dato < anterior.getDato())
                  anterior.setIzq(nuevo);
              else
                  anterior.setDer(nuevo);
          }
          num_nodos++;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public int getNumNodos() {
        return num_nodos;
    }
    
    //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void preorden(NodoArbol aux,LinkedList recorrido){
          if (aux != null)
          {
              recorrido.add(aux.getDato());
              preorden (aux.getIzq(),recorrido);
              preorden (aux.getDer(),recorrido);
          }
    }
    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void inorden(NodoArbol aux,LinkedList recorrido){
          if (aux != null)
          {
              inorden (aux.getIzq(),recorrido);
              recorrido.add(aux.getDato());
              inorden (aux.getDer(),recorrido);
          }
    }
    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void postorden(NodoArbol aux,LinkedList recorrido){
          if (aux != null)
          {
              postorden (aux.getIzq(),recorrido);
              postorden (aux.getDer(),recorrido);
              recorrido.add(aux.getDato());
          }
    }
    //Recorrido por nivel, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void porNivel(NodoArbol aux,LinkedList recorrido){
        LinkedList<NodoArbol> cola = new LinkedList<NodoArbol>();
        cola.addLast(aux);
        while(cola.size()> 0){
            NodoArbol tmp = cola.pollFirst();
            recorrido.add(tmp.getDato());
            if(tmp.getIzq()!=null){
                cola.addLast(tmp.getIzq());
            }
            if(tmp.getDer()!=null){
                cola.addLast(tmp.getDer());
            } 
        }
    }
    
    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        NodoArbol aux = raiz;
        while (aux!=null) {
            if (dato==aux.getDato())
                return true;
            else
                if (dato>aux.getDato())
                    aux=aux.getDer();
                else
                    aux=aux.getIzq();
        }
        return false;
    }
    
    
    private void altura (NodoArbol aux,int nivel)  {
        if (aux != null) {    
            altura(aux.getIzq(),nivel+1);
            alt = nivel;
            altura(aux.getDer(),nivel+1);
        }
    }
    //Devuleve la altura del arbol
    public int getAltura(){
        altura(raiz,1);
        return alt;
    }
}
