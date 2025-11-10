package br.edu.up;

public class Main {
    public static void main(String[] args) {
        ProcessadorTransacoes processador = new AdapterProcessadorTransacoes(new SistemaBancarioLegado());

        if(processador.autorizar("AAAA", 100, "BRL")){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

    }
}