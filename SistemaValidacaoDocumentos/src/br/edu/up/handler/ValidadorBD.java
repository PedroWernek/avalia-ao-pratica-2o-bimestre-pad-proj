package br.edu.up.handler;

import br.edu.up.DocumentoNFe;

import java.util.concurrent.TimeoutException;


public class ValidadorBD extends absValidador{

    @Override
    public void handleRequest(DocumentoNFe documentoNFe) throws TimeoutException {
        try {
            System.out.println("Validando Banco de dados...");
            if (canHandle(documentoNFe)) {
                System.out.println("Sucesso!");
                setNextHandle(new ValidadorSEFAZ());
                nextValidador.handleRequest(documentoNFe);
            } else {
                System.out.println("Erro dados duplicados ou banco inexistente");
            }
        }catch (TimeoutException e){
            System.out.println("Timeout Execption");
        }
    }

    @Override
    public boolean canHandle(DocumentoNFe documentoNFe) {
        return documentoNFe.metadados.containsKey("Id");
    }
}
