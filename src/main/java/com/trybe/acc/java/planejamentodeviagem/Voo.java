package com.trybe.acc.java.planejamentodeviagem;

/**Classe Voo. */
public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {
    Double duracaoDouble = distanciaKm / 700.0;
    tempoVoo = duracaoDouble.intValue();
    return tempoVoo;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {

    return "Partida: " + embarque + "\n" 
        + "Origem: " + origem + "\n"
        + "\n "
        + "Chegada: " + desembarque + "\n"
        + "Destino: " + destino + "\n"
        + "\n";
  }
}
