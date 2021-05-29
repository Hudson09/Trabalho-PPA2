package utils;

import java.util.Scanner;

import classes.ArmaProxy;

public class ArmaUtil {

  public static ArmaProxy criarNovaArma(Scanner scanner) {
    scanner.nextLine();

    System.out.println("Qual o tipo da arma? ");
    String tipo = scanner.nextLine();

    System.out.println("Qual o nome da arma? ");
    String nome = scanner.nextLine();

    System.out.println("Qual a cor da arma? ");
    String cor = scanner.nextLine();

    System.out.println("Qual o tamanho do pente? ");
    Integer tamanhoPente = scanner.nextInt();

    System.out.println("Qual a quantidade de munição da arma? ");
    Integer municao = scanner.nextInt();

    ArmaProxy novaArma = new ArmaProxy(tipo, nome, cor, tamanhoPente, municao);

    return novaArma;
  }
}
