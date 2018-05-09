/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luiz Guilherme
 */
public class Main {

    public static void main(String[] args) {
        int tamanho_vetor;
        int[] elementos;
        
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        
        tamanho_vetor =  100;//scan.nextInt();
        elementos = new int[tamanho_vetor];
        
        for(int i = 0; i < elementos.length; i++)
            elementos[i] = gerador.nextInt(99);
        
        BuscaPararela thread;
        for(int i = 0; i<5; i++)
           thread = new BuscaPararela("thread" + i, gerador.nextInt(99), elementos);
            


        
        

    }
}
