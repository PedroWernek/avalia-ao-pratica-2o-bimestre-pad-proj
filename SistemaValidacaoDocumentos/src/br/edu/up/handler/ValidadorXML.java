package br.edu.up.handler;

import br.edu.up.DocumentoNFe;

import java.util.concurrent.TimeoutException;

public class ValidadorXML extends absValidador {

    @Override
    public void handleRequest(DocumentoNFe documentoNFe) throws TimeoutException {
        try{
            System.out.println("Validando se doc é XML...");
            if (canHandle(documentoNFe)){
                System.out.println("Sucesso!");
                setNextHandle(new ValidadorCertificadoDigital());
            }else{
                System.out.println("Erro, fazendo outra validação...");
                setNextHandle(new ValidadorXSD());
            }
            nextValidador.handleRequest(documentoNFe);
        }catch (TimeoutException e){
            System.out.println("Timeout Execption, continuando...");
            nextValidador.handleRequest(documentoNFe);
        }
    }

    @Override
    public boolean canHandle(DocumentoNFe documentoNFe) {
        if (documentoNFe.metadados.containsKey("Schema")){
                Object tipo = documentoNFe.metadados.get("Schema");
                return tipo != null && tipo.toString().equalsIgnoreCase("XML");
        }
        return false;
    }

}
