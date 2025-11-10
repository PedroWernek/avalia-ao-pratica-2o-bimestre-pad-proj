package br.edu.up;

import br.edu.up.state.DESLIGADA;
import br.edu.up.state.iState;

public class Usina {
    public iState estado;
    public double temperatura;
    public double pressao;
    public double radiacao;

    public Usina() {
        this.estado = new DESLIGADA(this);
    }

    public void setState(iState estado){
        this.estado = estado;
    }

    public void subirEstado(){
        estado.subirEstado();
    }
    public void descerEstado(){
        estado.descerEstado();
    }
    public void entrarManutencao(){
        estado.entrarManutencao(estado);
    }

}
