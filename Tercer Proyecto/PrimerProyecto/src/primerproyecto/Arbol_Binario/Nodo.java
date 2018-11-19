/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto.Arbol_Binario;

public class Nodo<T extends Comparable<T>> {
    //Properties
    private T Valor;
    private Nodo<T> Left;
    private Nodo<T> Right;
    
    //Constructores
    public Nodo(){
        this.Valor=null;
        this.Left=null;
        this.Right=null;
    }
    public Nodo(T valor){
        this.Valor=valor;
        this.Left=null;
        this.Right=null;
    }
    
    //Getters & Setters
    public T getValor() {
        return Valor;
    }
    public Nodo getLeft() {
        return Left;
    }
    public Nodo getRight() {
        return Right;
    }
    public void setLeft(Nodo left) {
        this.Left = left;
    }
    public void setRight(Nodo right) {
        this.Right = right;
    }
    public void setValor(T valor) {
        this.Valor = valor;
    }
    public void setLeft(T left) {
        this.Left = new Nodo(left);
    }
    public void setRight(T right) {
        this.Right = new Nodo(right);
    }   
    
}
