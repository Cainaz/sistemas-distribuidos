/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Random;

/**
 *
 * @author Luiz Guilherme
 */
public class Main {

    public static void main(String[] args) {
        
        int tamanho_vetor = 1000000;
        int numero_threads = 15;
        int extensao = tamanho_vetor / numero_threads;
        int[] elementos = new int[tamanho_vetor];;
        
        Random gerador = new Random();

        for (int i = 0; i < elementos.length; i++) 
            elementos[i] = gerador.nextInt(99999);
                
        /*for (int i = 0; i < elementos.length; i++) 
            System.out.print(elementos[i] + ",");*/
               
        int teste = gerador.nextInt(99999);
        
        BuscaPararela thread;
        for (int i = 0; i < numero_threads; i++) {
            thread = new BuscaPararela("thread"+i, teste, elementos, extensao*i,((extensao*i) + extensao-1));
        }

    }
}
