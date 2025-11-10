package br.edu.up.state;

import br.edu.up.Usina;

public record ALERTA_AMARELO(Usina usina) implements iState{

    @Override
    public void subirEstado() {
        if(usina.temperatura > 400.0){
            System.out.println("Usina entrando em alerta vermelho!!!");
            usina.setState(new ALERTA_VERMELHO(usina));
        }else{
            System.out.println("temperatura abaixo de 400ºC");
        }
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
