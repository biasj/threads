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
public class OutraSoma extends Thread {
    private final int[] vetorUm;
    private final int[] vetorDois;
    private int[] soma;

    //construtor
    public OutraSoma(int[] vetorUm, int[] vetorDois) {
        this.vetorUm = vetorUm;
        this.vetorDois = vetorDois;

        this.soma = new int[vetorUm.length];
    }

    //método que retorna a soma dos dois vetores
    public int[] getSoma() {
      return soma;
    }

    /* este método se faz necessário para que possamos dar start() na Thread e iniciar a tarefa em paralelo */
    @Override
    public void run() {
      System.out.println("Execução do Exercício Um!");

      for(int i=0; i < vetorUm.length; i++) {
        soma[i] = vetorUm[i] + vetorDois[i];
      }
    }
}
