/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto.Arbol_Binario;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class ArbolBinario<T extends Comparable<T>> {
    
    //Propiedades y variables
    private Nodo<T> Raiz;
    private boolean leftFlag;
    public ArrayList<String> punteros;
    public int iz,der;
        
    //Constructores
    public ArbolBinario(){
        this.Raiz=new Nodo();
        this.leftFlag=true;
    }
    public ArbolBinario(T valor){
        this.Raiz=new Nodo(valor);
        this.leftFlag=true;
    }
    public ArbolBinario(Nodo<T> raiz){
        this.Raiz=raiz;
        this.leftFlag=true;
    }
    public ArbolBinario(boolean right){
        this.Raiz=new Nodo();
        this.leftFlag=false;
    }
    public ArbolBinario(T valor,boolean right){
        this.Raiz=new Nodo(valor);
        this.leftFlag=false;
    }
    
    //Getters & Setters
    public boolean getOrden() {
        return leftFlag;
    }
    
    public void setOrden(boolean LeftFlag) {    
        this.leftFlag = LeftFlag;
    }
    
    public Nodo<T> getRaiz() {
        return Raiz;
        
    }
    public void setRaiz(Nodo<T> Raiz) {
        this.Raiz = Raiz;
    }    
    //Metodos
    public void Insertar(Nodo<T> nodo){
        Nodo<T> actual=this.Raiz;
        T valor=nodo.getValor();
        while(actual!=null){
            if(this.irIzquierda(actual,valor)){
                if(actual.getLeft()==null){
                    break;
                }
                actual=actual.getLeft();
            }else{
                if(actual.getRight()==null){
                    break;
                }
                actual=actual.getRight();
            }
        }
        if(this.irIzquierda(actual, valor)){
            actual.setLeft(nodo);
        }else{
            actual.setRight(nodo);
        }   
    }
    
    public void Insertar(T valor){
        Nodo<T> actual=this.Raiz;
        while(!irUltimo(actual,valor)){
            if(this.irIzquierda(actual,valor)){
                if(actual.getLeft()==null || actual.getLeft().getValor()==null){
                    break;
                }
                actual=actual.getLeft();
            }else{
                if(actual.getRight()==null || actual.getRight().getValor()==null){
                    break;
                }
                actual=actual.getRight();
            }
        }
        if(this.irIzquierda(actual, valor)){
            actual.setLeft(valor);
        }else{
            actual.setRight(valor);
        }   
    }
    
    public void Eliminar(T valor){
        Nodo<T> actual=this.Raiz;
        if(!ArbolBinario.this.ContieneValor(valor)){
            return;
        }
        List<T> lista=this.ListaHojas(valor);
        while(actual.getValor().compareTo(valor)!=0){
            if(this.irIzquierda(actual,valor)){
                if(actual.getLeft()==null || actual.getLeft().getValor().compareTo(valor)==0){
                    break;
                }
                actual=actual.getLeft();
            }else{
                if(actual.getRight()==null || actual.getRight().getValor().compareTo(valor)==0){
                    break;
                }
                actual=actual.getRight();
            }
        }
        if(irIzquierda(actual,valor)){
            actual.setLeft(new Nodo<T>());
        }else{
            actual.setRight(new Nodo<T>());
        }
        for(T items:lista){
            this.Insertar(items);
        }
    }
    public void EliminarRama(T valor){
        Nodo<T> actual=this.Raiz;
        while(actual.getValor().compareTo(valor)!=0){
            if(this.irIzquierda(actual,valor)){
                if(actual.getLeft()==null || actual.getLeft().getValor().compareTo(valor)==0){
                    break;
                }
                actual=actual.getLeft();
            }else{
                if(actual.getRight()==null || actual.getRight().getValor().compareTo(valor)==0){
                    break;
                }
                actual=actual.getRight();
            }
        }
        if(irIzquierda(actual,valor)){
            actual.setLeft(new Nodo<T>());
        }else{
            actual.setRight(new Nodo<T>());
        }
    }
    
    public void Reemplazar(T viejo,T nuevo){
        Nodo<T> actual=this.Raiz;
        if(!this.ContieneValor(viejo)){
            return;
        }
        while(actual.getValor().compareTo(viejo)!=0){
            if(this.irIzquierda(actual,viejo)){
                if(actual.getLeft().getValor().compareTo(viejo)==0){
                    break;
                }
                actual=actual.getLeft();
            }else{
                if(actual.getRight().getValor().compareTo(viejo)==0){
                    break;
                }
                actual=actual.getRight();
            }
        }
        if(irIzquierda(actual,viejo)){
            actual.getLeft().setValor(nuevo);
        }else{
            actual.getRight().setValor(nuevo);
        }
    }
    
    public void ReemplazarTodo(T viejo,T nuevo){
        Nodo<T> actual=this.Raiz;
        Nodo<T> ultimo = actual;
        while(!irUltimo(actual,viejo)){
            if(ultimo .getValor().compareTo(viejo)==0){
                ultimo .setValor(nuevo);
            }
        }
    }
    
    public boolean irIzquierda(Nodo<T> nodo,T valor){
        if(valor.compareTo(nodo.getValor())<=0){
            if(this.leftFlag){     
                return true;
            }else{
                return false;
            }
        }else{
            if(this.leftFlag){     
                return false;
            }else{
                return true;
            }
        }
    }
    
    public boolean irUltimo(Nodo<T> nodo,T valor){
        /*if(nodo.getValor()==null){
            return true;
        }*/
        if(valor.compareTo(nodo.getValor())<=0){
            if(this.leftFlag){
                return nodo.getLeft()==null;
            }else{
                return nodo.getRight()==null;
            }
        }else{
            if(this.leftFlag){
                return nodo.getRight()==null;
            }else{
                return nodo.getLeft()==null;
            }
        }
    }
   
    public boolean ContieneValor(T valor){
        Nodo<T> actual=this.Raiz;
        while(!irUltimo(actual,valor)){
            if(actual.getValor().compareTo(valor)==0){
                return true;
            }
            if(irIzquierda(actual,valor)){
                actual=actual.getLeft();
            }else{
                actual=actual.getRight();
            }
        }
        return false;
    }
       
    public boolean ContieneRama(Nodo<T> rama){
        ArbolBinario<T> n_tree=new ArbolBinario<T>(rama);
        if(!this.ContieneValor(rama.getValor())){
            return false;
        }
        return ListaHojas(rama.getValor()).containsAll(n_tree.ListaHojas(rama.getValor()));
    }
    
    public List<T> ListaHojas(T valor){
        List<T> resultado=new ArrayList<T>();
        List<Nodo<T>> ultima_profundidad=new ArrayList<Nodo<T>>();
        List<Nodo<T>> profundidad_actual=new ArrayList<Nodo<T>>();
        Nodo<T> current=this.Raiz;
        while(current.getValor().compareTo(valor)!=0){
            if(this.irIzquierda(current,valor)){
                if(current.getLeft()==null){
                    break;
                }
                current=current.getLeft();
            }else{
                if(current.getRight()==null){
                    break;
                }
                current=current.getRight();
            }
        }
        ultima_profundidad.add(current);
        while(!ultima_profundidad.isEmpty()){
            for(Nodo<T> node:ultima_profundidad){
                if(node.getLeft()!=null){
                    profundidad_actual.add(node.getLeft());
                }
                if(node.getRight()!=null){
                    profundidad_actual.add(node.getRight());
                }
            }
            while(profundidad_actual.contains(null)){
                profundidad_actual.remove(null);
            }
            ultima_profundidad.clear();
            ultima_profundidad.addAll(profundidad_actual);
            profundidad_actual.clear();
            for(Nodo<T> node:ultima_profundidad){
                if(node.getValor()!=null){
                    resultado.add(node.getValor());
                }
            }
        }
        return resultado;
    }

     public String valores(String s)
    {
        String usuarios="";
        List<T> resultado=new ArrayList<T>();
        ArrayList<String> l=new ArrayList<String>();
        resultado.add(this.Raiz.getValor());
        resultado.addAll(ListaHojas(this.Raiz.getValor()));
        TreeMap<String,String> mensajes = new TreeMap<String,String>();                
        
        for (int i = 0; i < resultado.size(); i++) 
        {
           l.add(resultado.get(i).toString());
        }
        l.remove(s);
        for (int i = 0; i < l.size(); i++) 
        {
            mensajes.put(l.get(i).toString(),(i+1)+"" );
        }
        
        usuarios = mensajes.toString();
        return usuarios;
    }
    
    public Nodo<T> getRama(T valor){
        Nodo<T> current=this.Raiz;
        if(!ArbolBinario.this.ContieneValor(valor)){
            return null;
        }
        while(!irUltimo(current,valor)){
            if(current.getValor().compareTo(valor)==0){
                return current;
            }
            if(irIzquierda(current,valor)){
                current=current.getLeft();
            }else{
                current=current.getRight();
            }
        }
        return null;
    }
    
    public Nodo<T> getRama(Nodo<T> rama){
        Nodo<T> actual=this.Raiz;
        ArbolBinario<T> tree=new ArbolBinario(rama);
        if(!ContieneRama(rama)){
            return null;
        }
        while(!irUltimo(actual,rama.getValor())){
            if(ListaHojas(rama.getValor()).containsAll(tree.ListaHojas(rama.getValor()))){
                return actual;
            }
            if(irIzquierda(actual,rama.getValor())){
                actual=actual.getLeft();
            }else{
                actual=actual.getRight();
            }
        }
        return null;
    }
    
    public int profundoDe(T valor){
        int resultado=0;
        Nodo<T> actual=this.Raiz;
        if(!ArbolBinario.this.ContieneValor(valor)){
            return -1;
        }
        while(!irUltimo(actual,valor)){
            if(actual.getValor().compareTo(valor)==0){
                return resultado;
            }
            if(irIzquierda(actual,valor)){
                actual=actual.getLeft();
            }else{
                actual=actual.getRight();
            }
            resultado++;
        }
        return resultado==0?-1:resultado;
    }
    
    public int maxProfundidad(){
        int resultado=0;
        List<Nodo<T>> ultima_profundidad=new ArrayList<Nodo<T>>();
        List<Nodo<T>> profundidad_actual=new ArrayList<Nodo<T>>();
        ultima_profundidad.add(this.Raiz);
        while(!ultima_profundidad.isEmpty()){
            resultado++;
            for(Nodo<T> node:ultima_profundidad){
                if(node.getLeft()!=null){
                    if(node.getLeft().getValor()!=null){
                        profundidad_actual.add(node.getLeft());
                    }
                }
                if(node.getRight()!=null){
                    if(node.getRight().getValor()!=null){
                        profundidad_actual.add(node.getRight());
                    }
                }
            }
            ultima_profundidad.clear();
            ultima_profundidad.addAll(profundidad_actual);
            profundidad_actual.clear();
        }
        return resultado;
    }
    
    public int minProfundidad(){
        int resultado=0;
        List<Nodo<T>> ultima_profundidad=new ArrayList<Nodo<T>>();
        List<Nodo<T>> profundidad_actual=new ArrayList<Nodo<T>>();
        ultima_profundidad.add(this.Raiz);
        while(!ultima_profundidad.isEmpty()){
            resultado++;
            for(Nodo<T> node:ultima_profundidad){
                if(node.getLeft()!=null){
                    if(node.getLeft().getValor()!=null){
                        profundidad_actual.add(node.getLeft());
                    }else{
                        return resultado;
                    }
                }else{
                    return resultado;
                }
                if(node.getRight()!=null){
                    if(node.getRight().getValor()!=null){
                        profundidad_actual.add(node.getRight());
                    }else{
                        return resultado;
                    }
                }else{
                    return resultado;
                }
            }
            ultima_profundidad.clear();
            ultima_profundidad.addAll(profundidad_actual);
            profundidad_actual.clear();
        }       
        return resultado;
    }
    
    public int profundidadPromedio(){
        int resultado=0;
        return resultado;
    }
    
    public Nodo<T> getParent(T valor){
        Nodo<T> ultimo=this.Raiz;
        Nodo<T> actual=this.Raiz;
        if(!ArbolBinario.this.ContieneValor(valor)){
            return null;
        }
        while(actual.getValor().compareTo(valor)!=0){
            ultimo=actual;
            if(irIzquierda(actual,valor)){
                actual=actual.getLeft();
            }else{
                actual=actual.getRight();
            }
        }
        return ultimo;
    }
    
    public Nodo<T> getParent(Nodo<T> valor){
        Nodo<T> ultimo=this.Raiz;
        Nodo<T> actual=this.Raiz;
        if(!ContieneRama(valor)){
            return null;
        }
        while(!irUltimo(actual,valor.getValor())){
            if(actual.getValor().compareTo(valor.getValor())==0){
                return ultimo;
            }
            ultimo=actual;
            if(irIzquierda(actual,valor.getValor())){
                actual=actual.getLeft();
            }else{
                actual=actual.getRight();
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        String resultado="";
        List<Nodo<T>> ultima_profundidad=new ArrayList<Nodo<T>>();
        List<Nodo<T>> profundidad_actual=new ArrayList<Nodo<T>>();
        int profundidad=0;
        ultima_profundidad.add(this.Raiz);
        while(!ultima_profundidad.isEmpty()){
            resultado+="\n";
            for(Nodo<T> nodo:ultima_profundidad){
                resultado+=nodo.getValor()+"\t";
            }
            for(Nodo<T> nodo:ultima_profundidad){
                if(nodo.getLeft()!=null){
                    if(nodo.getLeft().getValor()!=null){
                        profundidad_actual.add(nodo.getLeft());
                    }
                }
                if(nodo.getRight()!=null){
                    if(nodo.getRight().getValor()!=null){
                        profundidad_actual.add(nodo.getRight());
                    }
                }
            }
            ultima_profundidad.clear();
            ultima_profundidad.addAll(profundidad_actual);
            profundidad_actual.clear();
        }
        return resultado;
    }
}