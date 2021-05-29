package classes;

public class ArmaProxy {
  private Arma arma;

  public ArmaProxy(String tipo, String nome, String cor, Integer tamanhoPente, Integer municao) {
    this.arma = new Arma(tipo, nome, cor, tamanhoPente, municao);
  }

  public void printArma() {
    arma.printArma();
  }
}
