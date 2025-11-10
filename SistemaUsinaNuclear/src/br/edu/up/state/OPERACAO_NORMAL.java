package br.edu.up.state;

import br.edu.up.Usina;

public record OPERACAO_NORMAL(Usina usina) implements iState{
    @Override
    public void subirEstado() {
        if (usina.temperatura > 300.0){
            System.out.println("Entrando em estado de Alerta Amarelo!");
            usina.setState(new ALERTA_AMARELO(usina));
        }else{
            System.out.println("temperatura abaixo de 300ºC");
        }
    }

    @Override
    public void descerEstado() {
        System.out.println("Desligando usina...");
        usina.setState(new DESLIGADA(usina));
        System.out.println("Usina desligada");
    }

    @Override
    public void entrarManutencao(iState estadoAnterior) {
        usina.setState(new MANUTENCAO(usina, estadoAnterior));
    }

}
