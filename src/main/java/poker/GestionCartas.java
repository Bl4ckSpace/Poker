package poker;

import poker.enumeraciones.Palo;
import poker.enumeraciones.Valor;

import java.util.ArrayList;
import java.util.LinkedList;

public class GestionCartas {
    private ArrayList<CartaPoker> prepararMano1() {
       ArrayList<CartaPoker> mano1 = new ArrayList<>();

       mano1.add(new CartaPoker(Palo.TREBOL, Valor.REY));
       mano1.add(new CartaPoker(Palo.DIAMANTE, Valor.REY));
       mano1.add(new CartaPoker(Palo.CORAZON, Valor.REY));
       mano1.add(new CartaPoker(Palo.PICA, Valor.CINCO));
       mano1.add(new CartaPoker(Palo.DIAMANTE, Valor.CINCO));

        return mano1;
    }

    private ArrayList<CartaPoker> prepararMano2() {
        ArrayList<CartaPoker> mano2 = new ArrayList<>();

        mano2.add(new CartaPoker(Palo.PICA, Valor.AS));
        mano2.add(new CartaPoker(Palo.CORAZON, Valor.AS));
        mano2.add(new CartaPoker(Palo.DIAMANTE, Valor.AS));
        mano2.add(new CartaPoker(Palo.TREBOL, Valor.AS));
        mano2.add(new CartaPoker(Palo.CORAZON, Valor.DIEZ));

        return mano2;
    }

    private ArrayList<CartaPoker> prepararMano3() {
        ArrayList<CartaPoker> mano3 = new ArrayList<>();

        mano3.add(new CartaPoker(Palo.PICA, Valor.DOS));
        mano3.add(new CartaPoker(Palo.TREBOL, Valor.DOS));
        mano3.add(new CartaPoker(Palo.DIAMANTE, Valor.REY));
        mano3.add(new CartaPoker(Palo.CORAZON, Valor.REY));
        mano3.add(new CartaPoker(Palo.PICA, Valor.NUEVE));

        return mano3;
    }

    private ArrayList<CartaPoker> prepararMano4() {
        ArrayList<CartaPoker> mano5 = new ArrayList<>();

        mano5.add(new CartaPoker(Palo.CORAZON, Valor.CUATRO));
        mano5.add(new CartaPoker(Palo.PICA, Valor.OCHO));
        mano5.add(new CartaPoker(Palo.DIAMANTE, Valor.DOS));
        mano5.add(new CartaPoker(Palo.TREBOL, Valor.REINA));
        mano5.add(new CartaPoker(Palo.CORAZON, Valor.SEIS));

        return mano5;
    }

    public LinkedList<Mano> prepararManos() {
        LinkedList<Mano> manos = new LinkedList<>();

        manos.add(new Mano("ReinaCorazones", prepararMano1()));
        manos.add(new Mano("PokerFace", prepararMano2()));
        manos.add(new Mano("AcesHigh", prepararMano3()));
        manos.add(new Mano("AceOfSpades", prepararMano4()));

        return manos;
    }
}
