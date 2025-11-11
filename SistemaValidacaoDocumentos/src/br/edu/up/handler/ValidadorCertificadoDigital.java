package br.edu.up.handler;

import br.edu.up.DocumentoNFe;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeoutException;

public class ValidadorCertificadoDigital extends absValidador{
    public ValidadorCertificadoDigital() {
        this.setNextHandle(new ValidadorRegrasFiscais());
    }

    @Override
    public void handleRequest(DocumentoNFe documentoNFe) throws TimeoutException {
        try {

            if (canHandle(documentoNFe)) {
                System.out.println("Certificado digital validado com sucesso!");
                setNextHandle(new ValidadorRegrasFiscais());
            } else {
                System.out.println("Erro ao validar Certificado");
            }
            nextValidador.handleRequest(documentoNFe);
        }catch (TimeoutException e){
            System.out.println("Timeout Execption, continuando...");
            nextValidador.handleRequest(documentoNFe);
        }
    }

    @Override
    public boolean canHandle(DocumentoNFe documentoNFe) {
        if (documentoNFe.metadados.containsKey("Validade")){
            LocalDate validade = (LocalDate) documentoNFe.metadados.get("Validade");
            LocalDate hoje = LocalDate.now();
            return !validade.isBefore(hoje);
        }
        return false;
    }
}
