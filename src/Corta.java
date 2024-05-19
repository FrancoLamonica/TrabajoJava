public class Corta extends Arma {
    private boolean esAutomatica;

    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.esAutomatica = esAutomatica;
    }

    @Override
    public String toString() {
        String temp = "Municiones: " + cantMuniciones + "\nAlcance: " + alcance + "\nMarca: " + marca + "\nCalibre: " + calibre + "\nEstado: " + estado;
        if (esAutomatica) {temp = temp.concat("\nEs Automatica");}
        else {temp = temp.concat("\nNo es Automatica");};
        return temp;
    }

    public boolean efectividadMts() {
        return (alcance >= 200);
    }
}