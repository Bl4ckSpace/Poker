package poker;

import java.io.Serializable;
import java.util.ArrayList;

public class Mano implements Serializable {
    private String nickJugador;
    private ArrayList<CartaPoker> mano;

    public Mano(String nickJugador, ArrayList<CartaPoker> mano) {
        this.nickJugador = nickJugador;
        this.mano = mano;
    }

    public String getNickJugador() {
        return nickJugador;
    }

    public ArrayList<CartaPoker> getMano() {
        return mano;
    }

    public boolean esMano() {
        return mano.size() == 5;
    }

    @Override
    public String toString() {
        StringBuilder manoCompleta = new StringBuilder();
        manoCompleta.append(this.nickJugador);
        for (CartaPoker cartaPoker : mano) {
            manoCompleta.append(cartaPoker);
        }
        return manoCompleta.toString();
    }
}
