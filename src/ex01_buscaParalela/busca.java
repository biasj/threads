/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01_buscaParalela;

import java.util.ArrayList;

/**
 *
 * @author beatrizsato
 */
public class busca {
    public static void main(String[] args) {
        int[] vetor = {1,4,20,3,10,45};
        
        BuscaParalela busca = new BuscaParalela("thread", vetor, 10);
        
        busca.start();
    }
}
