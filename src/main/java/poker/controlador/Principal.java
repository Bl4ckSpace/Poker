package poker.controlador;

import poker.modelo.procesos.JuegoPokerImpl;

public class Principal {
    public static void main(String[] args) {
        JuegoPokerImpl juegoPoker = new JuegoPokerImpl();
        juegoPoker.ejecutar(args);
    }
}
