package com.trybe.acc.java.planejamentodeviagem;

/**Classe Viagem. */
public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   * 
   */
  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return voo.retornarTempoVoo(distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());

    String infoVoo = voo.retornarInformacaoVoo(embarque, origem, 
            this.retonarDesembarqueHorarioLocalDestino(), destino);
    String desembarqueHorarioDestino = tempoViagem.retonarDesembarqueHorarioLocalDestino();
    String desembarqueHorarioOrigem = tempoViagem.retonarDesembarqueHorarioLocalOrigem();

    return infoVoo
        + "Atenção: o desembarque em " + destino 
        + " será: " + desembarqueHorarioDestino + " no horário de " + destino
        + " e " + desembarqueHorarioOrigem + " no horário de " + origem;
        
  }
}
