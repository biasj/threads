/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02_somaParalela;

/**
 *
 * @author beatrizsato
 */
public class SomaParalela extends Thread {
    private int[] vetor;
    int soma;
    
    public SomaParalela(int vetor[]) {
        this.vetor = vetor;
        soma = 0;
    }

    public int getSoma() {
        return soma;
    }
    
    @Override
    public void run() {
        for(int i=0;i<vetor.length;i++) {
            soma += vetor[i];
        }
    }
    
}
