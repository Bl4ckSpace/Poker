package poker.interfaces;

import poker.CartaPoker;
import poker.excepciones.ManoIncorrectaException;

import java.util.ArrayList;

public interface JuegoPoker {
    boolean isFull(ArrayList<CartaPoker> mano) throws ManoIncorrectaException;
    boolean isPoker(ArrayList<CartaPoker> mano) throws ManoIncorrectaException;
    boolean isDoblePareja(ArrayList<CartaPoker> mano) throws ManoIncorrectaException;
}
