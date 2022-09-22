/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4algo;

/**
 *
 * @author luan.fsilva17
 */
public class Fatorial {

    public static void main(String[] args) {
        System.out.println("Valor do fatorial:" + fatorial(6));
    }

    public static int fatorial(int valor) {
        if (valor == 0) {
            return 1;
        } else {
            valor = (valor * fatorial(valor - 1));
            System.out.println(valor);
            return valor;
        }
    }

}
