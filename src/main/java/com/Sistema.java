/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com;

/**
 *
 * @author Aluno
 */
public class Sistema {
    public static void main(String[] args) {
        
        String NomeAluno = "Carlos";
        double Nota1 = 8;
        double Nota2 = 7;
        double Media = (Nota1 + Nota2) / 2;
        
        System.out.println("Aluno: "+ NomeAluno);
        System.out.println("Media: " + Media);
        
        if (Media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
