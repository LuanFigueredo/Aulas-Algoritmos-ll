/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.senac.aula02;

/**
 *
 * @author luan.fsilva17
 */
public class ExemploPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João da Silva");
        pessoa.setIdade(24);
        pessoa.setAltura(1.75);
        pessoa.setPeso(60.0);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getPeso());
    }

}
