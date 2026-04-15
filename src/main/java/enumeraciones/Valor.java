package enumeraciones;

public enum Valor {
    AS(1), JOTA(11), REINA(12), REY(13);

    private final int valorLetra;

    Valor(int valorLetra) {this.valorLetra = valorLetra;}

    public int getValorLetra() {return valorLetra;}
}
