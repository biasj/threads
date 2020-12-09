/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_mediaVetor;

/**
 *
 * @author beatrizsato
 */
public class MediaVetor extends Thread{
    int[] vetor;
    double media;
    
    public MediaVetor(int[] vetor) {
        this.vetor = vetor;
    }
    
    @Override
    public void run() {
        double soma = 0;
        for(int i=0;i<vetor.length;i++) {
            soma += vetor[i];
        }
        
        media =  soma/vetor.length;
    }
}
