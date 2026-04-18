package poker;

import java.io.*;
import java.util.LinkedList;

public class GestionArchivos {

    public void escribirArchivoSer(LinkedList<Mano> manos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("manos.ser"))) {
            oos.writeObject(manos);
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        }
    }

    public LinkedList<Mano> leerArchivoSer(String arg) {
        LinkedList<Mano> manos = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arg))) {
            manos = (LinkedList<Mano>) ois.readObject();
        } catch (IOException ioe) {
            System.out.println("Error de lectura.");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase.");
        }
        return manos;
    }

    public void escribirNick(String nickJugador, String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write(nickJugador);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        }
    }
}