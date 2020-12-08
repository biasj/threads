/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02_somaParalela;

import java.util.Scanner;

/**
 *
 * @author beatrizsato
 */
public class Soma {
    public static void main(String[] args){
        int[] vetor1 = leVetor();
        int[] vetor2 = leVetor();
        
        SomaParalela t1 = new SomaParalela(vetor1);
        SomaParalela t2 = new SomaParalela(vetor2);

        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Soma vetor1: " + t1.getSoma());
        System.out.println("Soma vetor2: " + t2.getSoma());
        System.out.println("Soma dos dois: "+ (t1.getSoma() + t2.getSoma()));

    }
    
    public static int[] leVetor() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sequencia do vetor: ");
        String stringVetor = entrada.nextLine();
        String vetorString[] = stringVetor.split(" ");
        int vetor[] = new int[vetorString.length];
        for(int i = 0; i<vetorString.length;i++) {
            vetor[i] = Integer.parseInt(vetorString[i]);
        }
        
        return vetor;
    }
}
