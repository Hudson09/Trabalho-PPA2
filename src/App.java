import java.util.Scanner;

import classes.ArmaProxy;
import utils.ArmaUtil;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new java.io.InputStreamReader(System.in));

        int opcaoSelecionada;
        ArmaProxy arma;

        System.out.println("");

        do {
            System.out.println("------------- ESCOLHA A OPÇÃO DESEJADA -------------");
            System.out.println("1 - VER ARQUIVOS CADASTRADOS");
            System.out.println("2 - CADASTRAR NOVA ARMA");
            System.out.println("3 - EXCLUÍR ARMA");
            System.out.println("0 - ENCERRAR");
            System.out.println("");

            System.out.print("OPÇÃO SELECIONADA: ");
            opcaoSelecionada = scanner.nextInt();
            System.out.println("");

            switch (opcaoSelecionada) {
                case 1:
                    break;
                case 2:
                    arma = ArmaUtil.criarNovaArma(scanner);
                    arma.printArma();
                    break;
                case 3:
                    arma = null;
                    System.out.println("");
                    System.out.println("Arma excluída!");
                    System.out.println("");
                    break;
            }
        } while (opcaoSelecionada > 0);
    }
}
