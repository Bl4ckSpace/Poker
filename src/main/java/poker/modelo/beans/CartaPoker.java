package poker.modelo.beans;

import enumeraciones.Palo;
import enumeraciones.Valor;

public class CartaPoker {
    private Palo palo;
    private Valor valor;

    public CartaPoker(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.palo+" | "+this.valor;
    }
}
