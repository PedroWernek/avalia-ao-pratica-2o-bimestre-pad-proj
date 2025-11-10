package br.edu.up.state;

import br.edu.up.Usina;

public record ALERTA_VERMELHO(Usina usina) implements iState{
    @Override
    public void subirEstado() {
        System.out.println("Sistema de resfriamento falhou, entrando em estado de emergência");
        usina.setState(new EMERGENCIA(usina));
    }

    @Override
    public void descerEstado() {
        System.out.println("Necessário entrar em manutenção");
    }

    @Override
    public void entrarManutencao(iState estadoAnterior) {
        usina.setState(new MANUTENCAO(usina, estadoAnterior));
    }
}
