// Main.java (Corrigida e Completa)
package br.edu.up;

import br.edu.up.handler.*; // Importe todos os seus handlers
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Object> metadados = new HashMap<>();
        metadados.put("Schema", "XSD");
        metadados.put("Validade", LocalDate.now().plusDays(30));
        metadados.put("Imposto", 18.5);
        metadados.put("Id", 12345);
        metadados.put("SEFAZ", "Servidor-Ativo");

        DocumentoNFe documentoNFe = new DocumentoNFe(metadados);

        absValidador validador = new ValidadorXML();

        validador.setNextHandle(validador);

        try {
            System.out.println("--- INICIANDO VALIDAÇÃO DA CADEIA ---");
            validador.handleRequest(documentoNFe);
            System.out.println("\n--- VALIDAÇÃO CONCLUÍDA COM SUCESSO ---");

        } catch (Exception e) {
            System.out.println("\n--- VALIDAÇÃO INTERROMPIDA ---");
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}