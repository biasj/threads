/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_vetorConstante;

/**
 *
 * @author beatrizsato
 */
public class MultiplicaVetor extends Thread{
    int[] vetor;
    int constante;
    
    public MultiplicaVetor(int[] vetor, int constante) {
        this.vetor = vetor;
        this.constante = constante;
    }
    
    @Override
    public void run() {
        for(int i=0;i<vetor.length;i++) {
            vetor[i] *= constante;
        }
    }
}
