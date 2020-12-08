/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04_primos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author beatrizsato
 */
public class primosThreads {
    public static void main(String[] args) {
        List<Integer> primos = new ArrayList<>();
        int valorInicial = 0;
        int valorFinal = 99999;
        
        int quantidadeThreads = Runtime.getRuntime().availableProcessors();
        List<Primos> threads = new ArrayList<>();
        
        int trabalho = valorFinal/(valorInicial+1);

        //cria threads conforme a quantidade de nucleos
        for (int i=1; i<=quantidadeThreads; i++) {
            //trab é a quantidade de valores que cada thread irá calcular
            int trab = Math.round(trabalho / quantidadeThreads);

            //calcula o valor inicial e final do intervalo de cada thread
            int fim = trab * i;
            int ini = (fim - trab) + 1;

            //cria a thread com a classe CalculaPrimos que estende da classe Thread
            Primos thread = new Primos(ini, fim, primos);
            
            //define um nome para a thread
            thread.setName("Thread "+i);
            threads.add(thread);
        }
        
        // começa todas
        for(Primos thread: threads) {
            thread.start();
        }
        
        for(Primos thread: threads) {
            try {
                thread.join();
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println(primos);
    }
}
