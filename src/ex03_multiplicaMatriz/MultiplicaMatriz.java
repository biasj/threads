/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03_multiplicaMatriz;

/**
 *
 * @author beatrizsato
 */
public class MultiplicaMatriz extends Thread {
    private int[] vetor1;
    private int[][] matriz2;
    private int[] linhaMatriz;
    
    public MultiplicaMatriz(int vetor[], int matriz[][]) {
        this.vetor1 = vetor;
        this.matriz2 = matriz;
        linhaMatriz = new int[matriz2[0].length];
    }

    public int[] getLinhaMatriz() {
        return linhaMatriz;
    }
    
    @Override
    public void run() {
//        System.out.println("começou");
        for(int i=0;i<matriz2[0].length;i++) {
            for(int j=0;j<matriz2.length;j++) {
                linhaMatriz[i] += matriz2[j][i] * vetor1[j];
            }
        }
    }
    
    
}
