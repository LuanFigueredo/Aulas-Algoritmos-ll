/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.senac.aula03;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 *
 * @author luan.fsilva17
 */
public class ArquivoDiretorioMoverExcluir {

    public static void main(String[] args) throws Exception {
        Path diretorioAtual = Path.of(".");
        System.out.println("## Listando todos os arquivos do diretório");
        try ( Stream<Path> arquivos = Files.list(diretorioAtual)) {
            for (Path arquivo : arquivos.toList()) {
                System.out.println(arquivo.normalize().toAbsolutePath());
            }
        }
        System.out.println("## Buscando um arquivo");
            try ( DirectoryStream<Path> arquivos = Files.newDirectoryStream(diretorioAtual, "*.xml")) {
            for (Path arquivo : arquivos) {
                System.out.println(arquivo.normalize().toAbsolutePath());
            }
        }
    }
}
