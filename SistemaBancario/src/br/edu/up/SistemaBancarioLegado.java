package br.edu.up;

import java.util.HashMap;

public class SistemaBancarioLegado {
    public boolean processarTransacao(HashMap<String, Object> parametros){
        return !parametros.get("valor").toString().isEmpty() && !parametros.get("cartao").toString().isEmpty() && ((int) parametros.get("moeda")) != 0;
    }
}
