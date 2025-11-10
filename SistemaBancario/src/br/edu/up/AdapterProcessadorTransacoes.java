package br.edu.up;

import java.util.HashMap;

public record AdapterProcessadorTransacoes(SistemaBancarioLegado legado) implements ProcessadorTransacoes {

    @Override
    public boolean autorizar(String cartao, double valor, String moeda) {
        HashMap<String, Object> parametros = new HashMap<>();
        parametros.put("cartao", cartao);
        parametros.put("valor", valor);
        parametros.put("moeda", converterMoeda(moeda));

        return legado.processarTransacao(parametros);
    }

    private int converterMoeda(String moeda) {
        return switch (moeda.toUpperCase()) {
            case "USD" -> 1;
            case "EUR" -> 2;
            case "BRL" -> 3;
            default -> {
                System.out.println("Moeda não autorizada: " + moeda);
                yield 0;
            }
        };
    }
}
