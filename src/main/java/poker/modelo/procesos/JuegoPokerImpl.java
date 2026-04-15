package poker.modelo.procesos;

import interfaces.JuegoPoker;
import poker.modelo.beans.CartaPoker;

import java.util.ArrayList;

public class JuegoPokerImpl implements JuegoPoker {

    @Override
    public boolean isFull(ArrayList<CartaPoker> cartas) { //Trío + pareja
        return false;
    }

    @Override
    public boolean isPoker(ArrayList<CartaPoker> cartas) { //4 iguales
        for (CartaPoker cartaPoker : cartas) {
            if (cartaPoker.equals(cartas))
        }
    }

    @Override
    public boolean isDoblePareja(ArrayList<CartaPoker> cartas) { //Dos parejas (dos cartas del mismo valor en cada una)
        return false;
    }
}
