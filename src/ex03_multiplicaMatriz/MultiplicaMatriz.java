/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03_multiplicaMatriz;

/**
 * Grupo do PI: 
 * 
 * Beatriz Sato
 * Gabriel Friedmann
 * Marcelo Frost Marchesan
 * 
 */

/* 

Para tentar resolver esse exercício de forma paralela, tentamos separar a 
multiplicação da matriz

Pegamos linha por linha da primeira matriz, de forma separada, e multiplicamos por 
todas as colunas da segunda

Na classe de teste a gente cria uma thread para cada linha da primeira matriz
e quando elas acabam, a gente junta na matriz resultante, linha por linha
considerando que a matriz é só um vetor de vetores

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
        for(int i=0;i<matriz2[0].length;i++) {
            for(int j=0;j<matriz2.length;j++) {
                linhaMatriz[i] += matriz2[j][i] * vetor1[j];
            }
        }
    }
    
    
}
