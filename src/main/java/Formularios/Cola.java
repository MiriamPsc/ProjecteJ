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
public class Cola {
    private Nodo head;
     private Nodo tail;
     
     public Nodo getHead(){return head;}
    public void setHead(Nodo n){head = n;}
    
    public Nodo getTail(){return tail;}
    public void setTail(Nodo n){tail = n;}
    
    public Cola(){
        head = null;
        tail = null;
    }
    
    public void Encolar(Nodo n){
        if ( head == null){
            head = n;
            tail = n;
        }else{
            tail.setNext(n);
            tail = n;     
        }
    }
    
    public void Desencolar(){
        if (head == tail){
        head = null;
        tail = null;
  return;
      }
        head = head.getNext();
    }
    
    public int Frente(){
        return head.getDato();
    }
    
    public String ToString(){
        String stringcola = "";
        Nodo h = head;
        if(h != null){
            stringcola += h.ToString();
            h = h.getNext();
            while ( h != null){
                stringcola += "," + h.ToString();
                h = h.getNext();
            }
            return stringcola;
            
        }else{
            return "La cola esta vacia";
        }
        
    }
}
