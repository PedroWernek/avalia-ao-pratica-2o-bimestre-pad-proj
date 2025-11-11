package br.edu.up.handler;

import br.edu.up.DocumentoNFe;

import java.util.concurrent.TimeoutException;

public class ValidadorSEFAZ extends absValidador{

    @Override
    public void handleRequest(DocumentoNFe documentoNFe){
        if(canHandle(documentoNFe)){
            System.out.println("Validando SEFAZ!");
        }else {
            System.out.println("Erro ao validar SEFAZ");
        }
    }

    @Override
    public boolean canHandle(DocumentoNFe documentoNFe) {
        return documentoNFe.metadados.containsKey("SEFAZ");
    }
}
