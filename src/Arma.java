public abstract class Arma {
    public int cantMuniciones;
    public double alcance;
    public String marca;
    public int calibre;
    public String estado;

    public boolean enCondicion() {
        return (estado == "EN USO" && calibre >= 9);
    }
}