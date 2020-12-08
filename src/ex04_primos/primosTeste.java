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
public class primosTeste {
    public static void main(String[] args) {
        List<Integer> primos = new ArrayList<>();
        int valorInicial = 0;
        int valorFinal = 999;
        
        Primos primo = new Primos(valorInicial, valorFinal, primos);
        
        primo.start();
        
        try {
            primo.join();
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println(primo);
    }
}
