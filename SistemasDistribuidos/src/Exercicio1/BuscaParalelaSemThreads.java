/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Luiz Guilherme
 */
public class BuscaParalelaSemThreads {

    String nome;

    BuscaParalelaSemThreads(String nome, int valor, int[] elementos) {
        this.nome = nome;
        buscaVetor(elementos, valor);
    }

    boolean buscaVetor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                System.out.println(this.nome + " encontrou elemento na posição: " + i);
                return true;
            }
        }
        System.out.println(this.nome + " nao encontrou elemento no vetor");
        return false;
    }
}
