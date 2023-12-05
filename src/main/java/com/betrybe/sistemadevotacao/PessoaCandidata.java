package com.betrybe.sistemadevotacao;

/**
 * Classe Candidata.
 */
public class PessoaCandidata extends Pessoa {
  protected int numero;
  protected int votos;

  /**
   * Construtor.
   *
   * @param nome    nome da pessoa candidata.
   * @param numero  numero de voto.
   */
  public PessoaCandidata(String nome, int numero) {
    setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
