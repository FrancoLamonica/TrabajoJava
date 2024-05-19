public class Larga extends Arma implements Comparable<Larga> {
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int cantMuniciones, double alcance, String marca, int calibre, String estado, String justifUso, int nivelArma, boolean tieneSello) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }

    @Override
    public String toString() {
        String temp = "Municiones: " + cantMuniciones + "\nAlcance: " + alcance + "\nMarca: " + marca + "\nCalibre: " + calibre + "\nEstado: " + estado +
        "\nUso: " + justifUso + "\nNivel: " + nivelArma;
        if (tieneSello) {temp = temp.concat("\nTiene Sello RENAR");}
        else {temp = temp.concat("\nSin Sello RENAR");};
        return temp;
    }

    @Override
    public int compareTo(Larga o) {
        if (nivelArma > o.nivelArma) return 1;
        else if (nivelArma < o.nivelArma) return -1;
        else return 0;
    }
}