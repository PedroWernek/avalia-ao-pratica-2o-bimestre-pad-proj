package br.edu.up.state;

import br.edu.up.Usina;

public record EMERGENCIA(Usina usina) implements iState{
    @Override
    public void subirEstado() {
        System.out.println("Alerta de Emergência evacuar área");
    }

    @Override
    public void descerEstado() {
        System.out.println("Alerta de Emergência evacuar área");
    }

    @Override
    public void entrarManutencao(iState estadoAnterior) {
        System.out.println("Alerta de Emergência evacuar área");
    }
}
