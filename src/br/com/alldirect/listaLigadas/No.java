/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.listaLigadas;

/**
 *
 * @author luanmagalhaes
 */
public class No <T> {
    
    private T elemento;
    private No<T> proximo;
    
    public No(){
        this.proximo = null;
    }
    
    public No(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }
    
    public No(T elemento, No<T> proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    
    public void setElemento(T elemento){
        this.elemento = elemento;
    }
    public T getElemento(){
        return this.elemento;
    }
    
    public void setProximo(No<T> proximo){
        this.proximo = proximo;
    }

    public No<T> getProximo() {
        return proximo;
    }
    
    
}
