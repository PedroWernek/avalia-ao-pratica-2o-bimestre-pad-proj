package br.edu.up.state;

import br.edu.up.Usina;

public record DESLIGADA(Usina usina) implements iState{
    @Override
    public void subirEstado() {
        System.out.println("Ligando Usina...");
        usina.setState(new OPERACAO_NORMAL(usina));
        System.out.println("Usina ligada!");
    }

    @Override
    public void descerEstado() {
        System.out.println("Usina já desligada.");
    }

    @Override
    public void entrarManutencao(iState estadoAnterior) {
        System.out.println("Usina desligada,,ligue-a primeiro");
    }
}
