package br.edu.up.handler;

import br.edu.up.DocumentoNFe;

import java.util.concurrent.TimeoutException;

public class ValidadorXSD extends absValidador {

    public ValidadorXSD() {
        setNextHandle(new ValidadorCertificadoDigital());
    }
    @Override
    public void handleRequest(DocumentoNFe documentoNFe) throws TimeoutException {
        try {
            System.out.println("Validando se doc é XSD...");
            if (canHandle(documentoNFe)) {
                System.out.println("Sucesso!");

                nextValidador.handleRequest(documentoNFe);
            } else {
                System.out.println("Erro falha nas validações de formato");
            }

        }catch (TimeoutException e){
            System.out.println("Timeout Execption, continuando...");
            nextValidador.handleRequest(documentoNFe);
        }
    }

    @Override
    public boolean canHandle(DocumentoNFe documentoNFe) {
        if (documentoNFe.metadados.containsKey("Schema")){
            Object tipo = documentoNFe.metadados.get("Schema");
            return tipo != null && tipo.toString().equalsIgnoreCase("XSD");
        }
        return false;
    }
}
