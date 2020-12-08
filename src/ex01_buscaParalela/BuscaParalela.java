/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01_buscaParalela;

import java.util.ArrayList;

/**
 *
 * @author beatrizsato
 */
public class BuscaParalela implements Runnable {
    private Thread thread = null;
    private int[] vetor;
    private int elemento;
    
    public BuscaParalela(String threadName, int[] vetor, int elemento) {
        this.vetor = vetor;
        this.elemento = elemento;
        
        if (thread == null) {
            thread = new Thread(this, threadName);
        } 
    }
    
    /* Método para iniciar o objeto thread local */
    public void start() { 
        thread.start();
    }

    @Override
    public void run() {
        int posicao = -1;
        for(int i=0; i<vetor.length;i++) {
            if(vetor[i]==elemento)
                posicao = i;
        }
        
        System.out.println("posição: " + posicao);
    }
    
}
