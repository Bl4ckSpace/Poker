package poker;

import poker.enumeraciones.Palo;
import poker.enumeraciones.Valor;

import java.io.Serializable;

import static java.util.Objects.hash;

public class CartaPoker implements Serializable {
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
    public int hashCode() {
        return hash(this.valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        CartaPoker carta = (CartaPoker) obj;

        return this.valor.equals(carta.valor);
    }

    @Override
    public String toString() {
        return this.palo+" | "+this.valor;
    }
}
