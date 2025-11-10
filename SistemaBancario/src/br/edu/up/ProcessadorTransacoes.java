package br.edu.up;

public interface ProcessadorTransacoes {
    boolean autorizar(String cartao, double valor, String moeda);
}
