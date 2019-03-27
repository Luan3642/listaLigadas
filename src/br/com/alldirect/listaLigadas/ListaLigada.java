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
public class ListaLigada<T> {

    private No<T> primeiroNo;
    private int tamanho;
    private No<T> ultimoNo;

    public ListaLigada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }
    
    public void inserir(T elemento){
        No<T> novoNo = new No<>(elemento);
        if(estaVazia()){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        }else {
            this.ultimoNo.setProximo(novoNo);
            this.ultimoNo = novoNo;
        }
        this.tamanho++;
    }
    
    public boolean estaVazia(){
        return this.tamanho == 0;
    }
    
    public int tamanhoLista(){
        return this.tamanho;
    }
}
