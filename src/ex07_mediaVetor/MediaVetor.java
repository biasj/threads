/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_mediaVetor;

/**
 * Grupo do PI: 
 * 
 * Beatriz Sato
 * Gabriel Friedmann
 * Marcelo Frost Marchesan
 * 
 */


/* 

Nesse exercício de média a gente não conseguiu pensar em como deixar ele de 
forma paralela? não conseguimos pensar em uma maneira que utilizaria mais de uma thread
e até chegamos a rever as aulas e os slides, mas ainda assim não conseguimos mudar a 
maneira que pensamos, então apenas resolvemos o exercício e colocamos em uma única thread
separada para executar.

*/


public class MediaVetor extends Thread{
    int[] vetor;
    double media;
    
    public MediaVetor(int[] vetor) {
        this.vetor = vetor;
    }
    
    @Override
    public void run() {
        double soma = 0;
        for(int i=0;i<vetor.length;i++) {
            soma += vetor[i];
        }
        
        media =  soma/vetor.length;
    }
}
