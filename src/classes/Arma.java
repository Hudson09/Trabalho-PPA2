package classes;

public class Arma {
  private String tipo;
  private String nome;
  private String cor;
  private Integer tamanhoPente;
  private Integer municao;

  public Arma(String tipo, String nome, String cor, Integer tamanhoPente, Integer municao) {
    this.tipo = tipo;
    this.nome = nome;
    this.cor = cor;
    this.tamanhoPente = tamanhoPente;
    this.municao = municao;
  }

  @Override
  public void finalize() throws Throwable {
    System.out.println(this.nome + " destruida!");
  }

  public void printArma() {
    System.out.println("");
    System.out.println(this.nome + " criada!");
    System.out.println("");
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Integer getTamanhoPente() {
    return tamanhoPente;
  }

  public void setTamanhoPente(Integer tamanhoPente) {
    this.tamanhoPente = tamanhoPente;
  }

  public Integer getMunicao() {
    return municao;
  }

  public void setMunicao(Integer municao) {
    this.municao = municao;
  }
}