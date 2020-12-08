/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04_primos;

import java.util.List;

/**
 *
 * @author beatrizsato
 */
public class Primos extends Thread{
    int valorInicial;
    int valorFinal;
    final List<Integer> primos;

    public Primos(int valorInicial, int valorFinal, List<Integer> primos) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.primos = primos;
    }

    public List<Integer> getPrimos() {
        return primos;
    }
    
        
    @Override
    public void run() {
        // percorre de 0 a 99999
        for(int i=valorInicial;i<=valorFinal;i++) {
            boolean primo = true;
            
            if(i > 2) {
                // percorre de 2 ao número atual (que deve ser dif de 2) e vai dividindo
                for(int j=2;j<i;j++) {
                    // se resto da divisao por j != 0 e quociente menor
                    // em todos os numeros do laço, é primo
                    if(i%j == 0) {
                        primo = false;
                    }
                }
            }
            
            if(primo && i != 0) {
                // para não dar pau quando as threads forem acessar o mesmo recurso
                synchronized(primos) {
                     primos.add(i);
                     
                }
            }
                
        }
    }

    @Override
    public String toString() {
        return "primos = " + primos;
    }

}
