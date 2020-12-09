/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_Corrida;

import java.util.Random;

/**
 *
 * @author beatrizsato
 */
public class Corrida extends Thread {
    private String carro;
    private int tempoTotal;
    
    public Corrida(String carro) {
        this.carro = carro;
        tempoTotal = 0;
    }

    public String getCarro() {
        return carro;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    
    @Override
    public void run() {
        int tempoVolta;
        
        Random minutoAleatorio = new Random(); 
        
        for(int i=1;i<=5;i++) {
            tempoVolta = 6000 + minutoAleatorio.nextInt(6000);
            tempoTotal += tempoVolta;
            
            try {
                Thread.sleep(tempoVolta);
            } catch(InterruptedException ex) {
                ex.printStackTrace();    
            }
            
            System.out.println(i + "ª Volta:");
            System.out.println("Tempo: " + tempoVolta/1000 + "s" +  "\nCarro: " + carro);
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Carro: " + carro + "\nTempo total: " + tempoTotal/1000 + "s";
    }
    
    
}
