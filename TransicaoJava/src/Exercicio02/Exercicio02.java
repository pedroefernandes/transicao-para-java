package Exercicio02;

// Considere seis vetores: nome, sobrenome, peso, altura, ano de nascimento, e um vetor
// booleano que indicar se uma pessoa é atleta ou não. Com base nesses vetores, responda
// os itens abaixo.
// a) Mostre o nome completo de cada pessoa.
// b) Mostre a quantidade de pessoas que tem IMC acima de 25 (IMC é peso/altura²).
// c) Mostre a média das alturas das pessoas.
// d) Mostre a quantidade de atletas com peso inferior a 65,7 kg.
// e) Mostre o nome completo da pessoa mais alta.
// f) Mostre se a pessoa mais nova é atleta ou não (a resposta deve ser “sim” ou “não”).
// g) Mostre a média dos pesos das pessoas que não são atletas.
// h) Mostre quantas pessoas possuem altura acima de 1,70 metros e que são atletas.
// i) Mostre se a pessoa há atleta que nasceu após o ano 1989 (a resposta deve ser “sim ou
// não”).

public class Exercicio02 {
  public static void main(String[] args) {
    String nome[] = {"João", "Maria", "José", "Ana", "Carlos", "Mariana"};
    String sobrenome[] = {"Silva", "Santos", "Oliveira", "Pereira", "Ferreira", "Costa"};
    double peso[] = {70.0, 60.0, 80.0, 55.0, 90.0, 65.0};
    double altura[] = {1.75, 1.60, 1.80, 1.55, 1.85, 1.70};
    int anoNascimento[] = {1990, 1995, 1985, 2000, 1980, 1998};
    boolean atleta[] = {true, false, true, false, true, false};

    // a) Mostre o nome completo de cada pessoa.

    for (int i = 0; i < nome.length; i++) {
      System.out.println(nome[i] + " " + sobrenome[i]);
    }

    // b) Mostre a quantidade de pessoas que tem IMC acima de 25 (IMC é peso/altura²).

    int pessoasAcimaDe25 = 0;

    for (int i = 0; i < nome.length; i++) {
      if (peso[i] / (altura[i] * altura[i]) > 25) {
        pessoasAcimaDe25++;
      }
    }

    System.out.println(pessoasAcimaDe25);

    // c) Mostre a média das alturas das pessoas.

    double mediaAlturas = 0;

    for (int i = 0; i < nome.length; i++) {
      mediaAlturas += altura[i];
    }

    mediaAlturas /= nome.length;

    System.out.println(mediaAlturas);

    // d) Mostre a quantidade de atletas com peso inferior a 65,7 kg.

    int atletasComPesoInferiorA657 = 0;

    for (int i = 0; i < nome.length; i++) {
      if (atleta[i] && peso[i] < 65.7) {
        atletasComPesoInferiorA657++;
      }
    }

    System.out.println(atletasComPesoInferiorA657);

    // e) Mostre o nome completo da pessoa mais alta.

    int pessoaMaisAlta = 0;

    for (int i = 1; i < nome.length; i++) {
      if (altura[i] > altura[pessoaMaisAlta]) {
        pessoaMaisAlta = i;
      }
    }

    System.out.println(nome[pessoaMaisAlta] + " " + sobrenome[pessoaMaisAlta]);

    // f) Mostre se a pessoa mais nova é atleta ou não (a resposta deve ser “sim” ou “não”).

    int pessoaMaisNova = 0;

    for (int i = 1; i < nome.length; i++) {
      if (anoNascimento[i] > anoNascimento[pessoaMaisNova]) {
        pessoaMaisNova = i;
      }
    }

    System.out.println(atleta[pessoaMaisNova] ? "sim" : "não");

    // g) Mostre a média dos pesos das pessoas que não são atletas.

    double mediaPesosNaoAtletas = 0;

    int quantidadeNaoAtletas = 0;

    for (int i = 0; i < nome.length; i++) {
      if (!atleta[i]) {
        mediaPesosNaoAtletas += peso[i];
        quantidadeNaoAtletas++;
      }
    }

    mediaPesosNaoAtletas /= quantidadeNaoAtletas;

    System.out.println(mediaPesosNaoAtletas);

    // h) Mostre quantas pessoas possuem altura acima de 1,70 metros e que são atletas.

    int pessoasAcimaDe170EAtletas = 0;

    for (int i = 0; i < nome.length; i++) {
      if (altura[i] > 1.70 && atleta[i]) {
        pessoasAcimaDe170EAtletas++;
      }
    }

    System.out.println(pessoasAcimaDe170EAtletas);

    // i) Mostre se a pessoa há atleta que nasceu após o ano 1989 (a resposta deve ser “sim ou

    boolean atletaNasceuApos1989 = false;

    for (int i = 0; i < nome.length; i++) {
      if (atleta[i] && anoNascimento[i] > 1989) {
        atletaNasceuApos1989 = true;
        break;
      }
    }

    System.out.println(atletaNasceuApos1989 ? "sim" : "não");
  }
}