package Exercicio01;

public class Exercicio01 {
  public static void main(String[] args) {
    String [] bandas = {"Los Hermanos", "Ed Sheeran", "Lenine", "Oasis", "Rubel", "Aerosmith"};
    String [] tipoMusica = {"Indie", "Folk", "MPB", "Rock", "Folk", "Rock"};
    int [] numeroIntegrantes = {4, 1, 1, 5, 1, 5};
    double [] lucroUltimaTurne = {58000, 47000, 32000, 62000, 33000, 42000};
    int [] quantidadeShows = {31, 29, 15, 45, 20, 34};

    // A quantidade de bandas que tem exatamente cinco integrantes (no caso da tabela, 2);

    int quantidadeBandasCincoIntegrantes = 0;
    for (int i = 0; i < numeroIntegrantes.length; i++) {
      if (numeroIntegrantes[i] == 5) {
        quantidadeBandasCincoIntegrantes++;
      }
    }

    System.out.println("Quantidade de bandas com 5 integrantes: " + quantidadeBandasCincoIntegrantes);

    // A quantidade de bandas do tipo Indie (no caso da tabela, 1);

    int quantidadeBandasIndie = 0;
    for (int i = 0; i < tipoMusica.length; i++) {
      if (tipoMusica[i].equals("Indie")) {
        quantidadeBandasIndie++;
      }
    }

    System.out.println("Quantidade de bandas do tipo Indie: " + quantidadeBandasIndie);

    // O maior lucro obtido por uma banda (no caso da tabela, 62000);

    double maiorLucro = lucroUltimaTurne[0];
    for (int i = 1; i < lucroUltimaTurne.length; i++) {
      if (lucroUltimaTurne[i] > maiorLucro) {
        maiorLucro = lucroUltimaTurne[i];
      }
    }

    System.out.println("Maior lucro obtido por uma banda: " + maiorLucro);

    // O menor lucro obtido por uma banda (no caso da tabela, 32000);

    double menorLucro = lucroUltimaTurne[0];
    for (int i = 1; i < lucroUltimaTurne.length; i++) {
      if (lucroUltimaTurne[i] < menorLucro) {
        menorLucro = lucroUltimaTurne[i];
      }
    }

    System.out.println("Menor lucro obtido por uma banda: " + menorLucro);

    // O nome da banda, que contém um único integrante, que obteve o maior lucro (no caso da tabela, Ed Sheeran);

    String nomeBandaMaiorLucro = "";
    double lucroBandaMaiorLucro = 0;
    
    for (int i = 0; i < bandas.length; i++) {
      if (numeroIntegrantes[i] == 1 && lucroUltimaTurne[i] > lucroBandaMaiorLucro) {
        nomeBandaMaiorLucro = bandas[i];
        lucroBandaMaiorLucro = lucroUltimaTurne[i];
      }
    }

    System.out.println("Nome da banda com um integrante que obteve maior lucro: " + nomeBandaMaiorLucro);

    // O nome da banda que fez menos shows (no caso da tabela, Lenine);

    String nomeBandaMenosShows = "";
    int quantidadeShowsMenos = quantidadeShows[0];

    for (int i = 1; i < quantidadeShows.length; i++) {
      if (quantidadeShows[i] < quantidadeShowsMenos) {
        nomeBandaMenosShows = bandas[i];
        quantidadeShowsMenos = quantidadeShows[i];
      }
    }

    System.out.println("Nome da banda que fez menos shows: " + nomeBandaMenosShows);

    // A soma dos integrantes das bandas (no caso da tabela, 17);

    int somaIntegrantes = 0;

    for (int i = 0; i < numeroIntegrantes.length; i++) {
      somaIntegrantes += numeroIntegrantes[i];
    }

    System.out.println("Soma dos integrantes das bandas: " + somaIntegrantes);

    // A quantidade de bandas que possuem mais de um integrante e fizeram mais que 33 shows (no caso da tabela, 2);

    int quantidadeBandasMaisDeUmIntegranteEMaisDe33Shows = 0;

    for (int i = 0; i < numeroIntegrantes.length; i++) {
      if (numeroIntegrantes[i] > 1 && quantidadeShows[i] > 33) {
        quantidadeBandasMaisDeUmIntegranteEMaisDe33Shows++;
      }
    }

    System.out.println("Quantidade de bandas com mais de um integrante e mais de 33 shows: " + quantidadeBandasMaisDeUmIntegranteEMaisDe33Shows);

    // A média do lucro (no caso da tabela, 45666.66).

    double mediaLucro = 0;

    for (int i = 0; i < lucroUltimaTurne.length; i++) {
      mediaLucro += lucroUltimaTurne[i];
    }

    mediaLucro /= lucroUltimaTurne.length;

    System.out.println("Média do lucro: " + mediaLucro);
  }
}