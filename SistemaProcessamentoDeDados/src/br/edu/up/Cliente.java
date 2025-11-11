package br.edu.up;

import br.edu.up.algoritimos.iAlgoritimo;

import java.util.Map;

public class Cliente {
    private iAlgoritimo algoritimo;
    private Map<String,Object> parametros;

    public Cliente(iAlgoritimo algoritimo, Map<String, Object> parametros) {
        this.algoritimo = algoritimo;
        this.parametros = parametros;
    }

    public void setAlgoritimo(iAlgoritimo algoritimo){
        this.algoritimo = algoritimo;
    }
    public void setParametros(String nome, Object parametro){
        this.parametros.put(nome, parametro);
    }

    public void executarAlgoritimo(){
        algoritimo.executar(parametros);
    }
}
