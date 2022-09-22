/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author luan.fsilva17
 */
public class ado1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome e sobrenome:");
        String nome = input.nextLine();

        boasVindas(nome);

    }

    public static void  boasVindas(String a) {

        if (a == null || a.isEmpty()) {
            System.out.println("Digite um valor válido");
        } else {
            System.out.println("Seja bem vindo: " + a);
        }
    }
}
