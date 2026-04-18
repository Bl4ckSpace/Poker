package poker;

import poker.enumeraciones.Valor;
import poker.excepciones.ManoIncorrectaException;
import poker.interfaces.JuegoPoker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JuegoPokerImpl implements JuegoPoker {

    @Override
    public boolean isFull(ArrayList<CartaPoker> mano) throws ManoIncorrectaException { //Trío + pareja
        boolean esTrio = false;
        boolean esPareja = false;
        Map<Valor, Integer> fullHouse = new HashMap<>();

        if (mano.size() == 5) {
            for (CartaPoker carta : mano) {
                if (!fullHouse.containsKey(carta.getValor())) {
                    fullHouse.put(carta.getValor(), 1);
                } else {
                    fullHouse.put(carta.getValor(), fullHouse.get(carta.getValor()) + 1);
                }
            }
            for (int frecuencia : fullHouse.values()) {
                if (frecuencia == 2) esPareja = true;
                else if (frecuencia == 3) esTrio = true;
            }
        } else {
            throw new ManoIncorrectaException("Esta baraja no es una mano.");
        }
        return esTrio && esPareja;
    }

    @Override
    public boolean isPoker(ArrayList<CartaPoker> mano) throws ManoIncorrectaException{ //4 iguales
        Map<Valor, Integer> poker = new HashMap<>();

        if (mano.size() == 5) {
            for (CartaPoker carta : mano) {
                if (!poker.containsKey(carta.getValor())) {
                    poker.put(carta.getValor(), 1);
                } else {
                    poker.put(carta.getValor(), poker.get(carta.getValor()) + 1);
                }
            }
            for (int frecuencia : poker.values()) {
                if (frecuencia == 4) return true;
            }
        } else {
            throw new ManoIncorrectaException("Esta baraja no es una mano.");
        }
        return false;
    }

    @Override
    public boolean isDoblePareja(ArrayList<CartaPoker> mano) throws ManoIncorrectaException { //Dos parejas
        Map<Valor, Integer> doblePareja = new HashMap<>();
        int numParejas = 0;

        if (mano.size() == 5) {
            for (CartaPoker carta : mano) {
                if (!doblePareja.containsKey(carta.getValor())) {
                    doblePareja.put(carta.getValor(), 1);
                } else {
                    doblePareja.put(carta.getValor(), doblePareja.get(carta.getValor()) + 1);
                }
            }
            for (int frecuencia : doblePareja.values()) {
                if (frecuencia == 2 && numParejas < 2) {
                    numParejas++;
                }
            }
        } else {
            throw new ManoIncorrectaException("Esta baraja no es una mano.");
        }
        return numParejas == 2;
    }
}
