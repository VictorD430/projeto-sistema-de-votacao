package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Principal.
 */
public class Principal {

  /**
   * main.
   *
   * @param args args.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int option = 0;
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    while (option != 2) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      option = Integer.parseInt(scanner.nextLine());
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }
    }
    option = 0;

    while (option != 2) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      option = Integer.parseInt(scanner.nextLine());
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }
    }
    option = 0;

    while (option != 3) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      System.out.println("Entre com o número correspondente à opção desejada:");
      option = Integer.parseInt(scanner.nextLine());
      if (option == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.votar(cpf, numero);
      } else if (option == 2) {
        gerenciamentoVotacao.mostrarResultado();
      }
    }

    gerenciamentoVotacao.mostrarResultado();
  }
}
