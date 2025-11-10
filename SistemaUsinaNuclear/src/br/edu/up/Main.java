package br.edu.up;

import br.edu.up.state.DESLIGADA;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Usina usina = new Usina();
        usina.subirEstado();
        while (usina.estado.getClass() != DESLIGADA.class){
            usina.temperatura += 1;
            Thread.sleep(300);
            usina.subirEstado();
        }
    }
}