/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06_maiorVetor;

import static ex02_somaParalela.Soma.leVetor;
import static ex03_multiplicaMatriz.multiplica.imprimeVetor;

/**
 *
 * @author beatrizsato
 */
public class testeMaiorVetor {
    public static void main(String[] args) {
        int vetor[] = leVetor();
        
        MaiorVetor maiorVetor = new MaiorVetor(vetor);
        
        maiorVetor.start();
        
        try {
            maiorVetor.join();
            System.out.println(maiorVetor.maior);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }
}
