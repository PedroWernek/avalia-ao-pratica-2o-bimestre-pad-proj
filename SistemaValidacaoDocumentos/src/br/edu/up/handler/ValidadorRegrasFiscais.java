package br.edu.up.handler;

import br.edu.up.DocumentoNFe;

import java.util.concurrent.TimeoutException;

public class ValidadorRegrasFiscais extends absValidador{
    public ValidadorRegrasFiscais(){
        this.setNextHandle(new ValidadorBD());
    }
    @Override
    public void handleRequest(DocumentoNFe documentoNFe) throws TimeoutException {
        try {
            if(canHandle(documentoNFe)){
                System.out.println("Impostos calculáveis");
            }else {
                System.out.println("Impossivel calcular impostos");
            }
            nextValidador.handleRequest(documentoNFe);
        }catch (TimeoutException e){
            System.out.println("Timeout Execption, continuando...");
            nextValidador.handleRequest(documentoNFe);
        }
    }

    @Override
    public boolean canHandle(DocumentoNFe documentoNFe) {
        if (documentoNFe.metadados.containsKey("Imposto")){
            return (double) documentoNFe.metadados.get("Imposto") != 0;
        }
        return false;
    }
}
