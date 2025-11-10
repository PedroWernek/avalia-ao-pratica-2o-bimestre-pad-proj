package br.edu.up.state;

public interface iState {
    void subirEstado();
    void descerEstado();
    void entrarManutencao(iState estadoAnterior);
}
