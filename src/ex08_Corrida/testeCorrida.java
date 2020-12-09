/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_Corrida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author beatrizsato
 */
public class testeCorrida {
    public static void main(String[] args) {
        List<Corrida> carrosInscritos = getInscritos();
        
        System.out.println("\nPOWWWWWW");
        for(Corrida carro: carrosInscritos) {
            carro.start();
        }
        
        for(Corrida carro: carrosInscritos) {
            try {
                carro.join();
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        getClassificacao(carrosInscritos);
        
        System.out.println("===============");
        System.out.println("FIM DA CORRIDA");
        System.out.println("===============");
        
        System.out.println("\nCLASSIFICAÇÃO: ");
        
        for(int i=0;i<carrosInscritos.size();i++) {
            System.out.println(i+1 + "º Lugar: ");
            System.out.println(carrosInscritos.get(i));
            System.out.println("");
        }
        
        
    }
    
    public static List<Corrida> getInscritos() {
        List<Corrida> corrida = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean inscricoesAbertas = true;
        System.out.println("AREA DE INSCRICAO");
        System.out.println("'fim' para sair");
        while(inscricoesAbertas) {
            System.out.print("Nome do carro: ");
            String carro = scanner.next();
            
            if(carro.equals("fim")) {
                inscricoesAbertas = false;
                break;
            }
            
            Corrida carroInscrito = new Corrida(carro);
            corrida.add(carroInscrito);
        }
        
        return corrida;
    }
    
    public static void getClassificacao(List<Corrida> carrosInscritos){
        Comparator<Corrida> comparador = Comparator.comparing(Corrida::getTempoTotal);
        Collections.sort(carrosInscritos,comparador);
    }
}
