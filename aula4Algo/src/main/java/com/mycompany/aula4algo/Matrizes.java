/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4algo;

/**
 *
 * @author luan.fsilva17
 */
public class Matrizes {

    public static void main(String[] args) {
        int valor[][] = {
                    {9, 0, 0, 9},
                    {0, 1, 1, 0},
                    {0, 1, 1, 0},
                    {9, 0, 0, 9}
                };
        for (int i = 0; i <= valor.length - 1; i++) {
            for (int j = 0; j <= valor[0].length - 1; j++) {
                System.out.print(valor[i][j]);
            }
            System.out.println();
        }
    }

}
