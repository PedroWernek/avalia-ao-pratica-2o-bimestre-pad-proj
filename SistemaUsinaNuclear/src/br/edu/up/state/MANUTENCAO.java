package br.edu.up.state;

import br.edu.up.Usina;

public record MANUTENCAO(Usina usina, iState estadoAnterior) implements iState{
    @Override
    public void subirEstado() {
        System.out.println("Volte um estado!");
    }

    @Override
    public void descerEstado() {
        estadoAnterior.descerEstado();
    }

    @Override
    public void entrarManutencao(iState estadoAnterior) {
        System.out.println("Já em manutenção");
    }
}
