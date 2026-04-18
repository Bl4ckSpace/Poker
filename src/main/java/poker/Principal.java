package poker;

import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        JuegoPokerImpl juegoPoker = new JuegoPokerImpl();
        GestionArchivos gestionArchivos = new GestionArchivos();
        GestionCartas gestionCartas = new GestionCartas();

        try {
            LinkedList<Mano> manos = gestionCartas.prepararManos();
            gestionArchivos.escribirArchivoSer(manos);
            if (args.length != 0) {
                LinkedList<Mano> manosSer = gestionArchivos.leerArchivoSer(args[0]);
                if (args[0].equals("manos.ser")) {
                    for (Mano mano : manosSer) {
                        if (juegoPoker.isFull(mano.getMano()))
                            gestionArchivos.escribirNick(mano.getNickJugador(), "full.txt");
                        if (juegoPoker.isPoker(mano.getMano()))
                            gestionArchivos.escribirNick(mano.getNickJugador(), "poker.txt");
                        if (juegoPoker.isDoblePareja(mano.getMano()))
                            gestionArchivos.escribirNick(mano.getNickJugador(), "doblepareja.txt");
                    }
                }
            } else {
                System.out.println("Debes escribir el nombre del archivo.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
