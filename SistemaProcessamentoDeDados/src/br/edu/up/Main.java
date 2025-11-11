package br.edu.up;

import br.edu.up.algoritimos.ExpectedShortfall;
import br.edu.up.algoritimos.StressTesting;
import br.edu.up.algoritimos.ValueAtRisk;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(new ValueAtRisk(), new HashMap<>());
        cliente.setParametros("aaa", "teste");
        cliente.executarAlgoritimo();
        cliente.setAlgoritimo(new ExpectedShortfall());
        cliente.executarAlgoritimo();
        cliente.setAlgoritimo(new StressTesting());
        cliente.executarAlgoritimo();
    }
}