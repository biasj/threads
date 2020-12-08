/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06_maiorVetor;

/**
 *
 * @author beatrizsato
 */
public class MaiorVetor extends Thread{
    int[] vetor;
    int maior;
    
    public MaiorVetor(int[] vetor) {
        this.vetor = vetor;
    }
    
    @Override
    public void run() {
        maior = vetor[0];
        for(int i=1;i<vetor.length;i++) {
            if(vetor[i] > maior) 
                maior = vetor[i];
        }
    }
    
}
