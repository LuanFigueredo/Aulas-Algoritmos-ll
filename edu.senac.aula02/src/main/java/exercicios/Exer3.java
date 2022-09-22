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
public class Exer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o 1º número");
        int primeiro = input.nextInt();
        
        System.out.println("Digite o 2º número");
        int segundo = input.nextInt();
        
        deUmAte(primeiro, segundo);
    }
    
    public static int deUmAte(int a, int b){
        for(int i = a;a<=b;a++){
            System.out.print(a);
        }
        return a;
    }
}
