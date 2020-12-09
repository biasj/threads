/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_mediaVetor;

import static ex02_somaParalela.Soma.leVetor;

/**
 *
 * @author beatrizsato
 */
public class testeMediaVetor {
    public static void main(String[] args) {
        int[] vetor = leVetor();
        
        MediaVetor media = new MediaVetor(vetor);
        
        media.start();
        
        try {
            media.join();
            System.out.println(media.media);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
               
    }
}
