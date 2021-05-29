import java.util.Scanner;

import classes.Arma;
import utils.ArmaUtil;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new java.io.InputStreamReader(System.in));

        int opcaoSelecionada;

        System.out.println("");

        do {
            System.out.println("------------- ESCOLHA A OPÇÃO DESEJADA -------------");
            System.out.println("1 - VER ARQUIVOS CADASTRADOS");
            System.out.println("2 - CADASTRAR NOVA ARMA");
            System.out.println("0 - ENCERRAR");
            System.out.println("");

            System.out.print("OPÇÃO SELECIONADA: ");
            opcaoSelecionada = scanner.nextInt();
            System.out.println("");

            switch (opcaoSelecionada) {
                case 1:
                    break;
                case 2:
                    Arma arma = ArmaUtil.criarNovaArma(scanner);
                    arma.printArma();
            }
        } while (opcaoSelecionada > 0);
    }
}
