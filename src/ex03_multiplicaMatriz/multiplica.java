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
public class multiplica {
    public static void main(String[] args) {
       int[][] matriz2 = {{2,3},{0,1},{-1,4}};

       int[][] matriz = {{1,2,3}, {-2,0,4}};
       
       int[][] matrizResultado = new int[matriz.length][matriz2[0].length];
       
       // quantidade de linha da matriz1
       for(int i=0;i<matriz.length;i++) {
           int linhaMatriz[] = getLinhaMatriz(matriz, i);
           MultiplicaMatriz t = new MultiplicaMatriz(linhaMatriz, matriz2);
           t.start();
           
           matrizResultado[i] = t.getLinhaMatriz();
       } 

       imprimeMatriz(matrizResultado);

    }
    
    public static int[] getLinhaMatriz(int[][] matriz, int index) {
        int linha[] = new int[matriz[0].length];
        for(int i=0;i<matriz[0].length;i++) {
            linha[i] = matriz[index][i];
        }
        
        return linha;
    }
    
    public static void imprimeMatriz(int[][] matriz) {
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[0].length;j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
    public static void imprimeVetor(int[] vetor) {
        for(int i=0;i<vetor.length;i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
