package br.edu.up.handler;

import br.edu.up.DocumentoNFe;

import java.util.concurrent.TimeoutException;

public abstract class absValidador{
    protected absValidador nextValidador;

    public void setNextHandle(absValidador nextValidador){
        this.nextValidador = nextValidador;
    }

    public abstract void handleRequest(DocumentoNFe documentoNFe) throws TimeoutException;

    public abstract boolean canHandle(DocumentoNFe documentoNFe);
}
