/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado2algo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author luan.fsilva17
 */
public class ArquivoLinha {

    public class arquivoEscrever {

        public static void main(String[] args) throws IOException {

            File arquivo = new File("arquivoMatheus.txt");

            try {
                arquivo.createNewFile();
                FileWriter fileWriter = new FileWriter(arquivo);

                BufferedWriter escrever = new BufferedWriter(fileWriter);
                for (int i = 0; i <= 9; i++) {
                    escrever.write("Linha " + i + "\r\n");
                }

                escrever.close();
                fileWriter.close();
            } catch (IOException ex) {

            }
        }
    }

}
