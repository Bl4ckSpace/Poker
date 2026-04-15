package interfaces;

import poker.modelo.beans.CartaPoker;

import java.util.ArrayList;

public interface JuegoPoker {
    boolean isFull(ArrayList<CartaPoker> mano);
    boolean isPoker(ArrayList<CartaPoker> mano);
    boolean isDoblePareja(ArrayList<CartaPoker> mano);
}
