/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_vetorConstante;

import static ex02_somaParalela.Soma.*;
import static ex03_multiplicaMatriz.multiplica.imprimeVetor;

/**
 *
 * @author beatrizsato
 */
public class testeVetor {
    public static void main(String[] args) {
        int vetor[] = leVetor();
        int constante = 3;
        
        MultiplicaVetor multiplica = new MultiplicaVetor(vetor, constante);
        
        multiplica.start();
        
        try {
           multiplica.join();
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        
        imprimeVetor(vetor);
    }
}
