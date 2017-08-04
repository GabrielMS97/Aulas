package br.ufjf.dcc171;

import java.util.Scanner;

public class Aula00Exm03 {
    public static void main(String[] args) {
        String nomeDaPessoa;
        Scanner entrada  = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nomeDaPessoa = entrada.nextLine();
        System.out.println("Olá "+nomeDaPessoa+"!");
    }
}
