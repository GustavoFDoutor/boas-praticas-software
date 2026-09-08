package com;

/**
 *
 * @author Aluno
 */
public class Sistema {

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8;
        double nota2 = 7;

        double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);

        apresentarResultados(nomeAluno, media, situacao);
    }

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    /*
     * Verifica se o aluno está aprovado ou reprovado com base na média.
     */
    public static String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }
    }

    /*
     * Apresenta os resultados na tela.
     */
    public static void apresentarResultados(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}