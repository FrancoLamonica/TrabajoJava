public class Policia {
    public String nombre;
    public String apellido;
    public int legajo;
    public Corta armaCorta;
    public Larga armaLarga;

    public Policia(String nombre, String apellido, int legajo, Corta armaCorta, Larga armaLarga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.armaCorta = armaCorta;
        this.armaLarga = armaLarga;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\nApellido: " + apellido + "\nLegajo: " + legajo + "\n\n--Arma Corta: \n" + armaCorta.toString() + "\n\n--Arma Larga: \n" + armaLarga.toString();
    }
    /* 
    public String getFabricante() {
        return fabricante;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    */
}