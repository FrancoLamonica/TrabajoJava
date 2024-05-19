public class Main {
    public static void main(String[] args) {
        Policia poli1 = new Policia(
            "Raul", "Gutierrez", 101, 
            new Corta(8, 15, "Marca2", 3, "NUEVA", true),
            new Larga(10,300,"Marca",9,"EN USO","Patrullaje",9,true)
            );
        System.out.println(poli1.toString());

        System.out.println("\n--------------\n" );

        if (poli1.armaCorta.enCondicion()) {
            System.out.println("El arma corta de " + poli1.nombre + " está en condiciones de uso");
        }else {
            System.out.println("El arma corta de " + poli1.nombre + " no está en condiciones de uso");
        }

        if (poli1.armaLarga.enCondicion()) {
            System.out.println("El arma larga de " + poli1.nombre + " está en condiciones de uso");
        }else {
            System.out.println("El arma larga de " + poli1.nombre + " no está en condiciones de uso");
        }

        System.out.println("\n--------------\n" );

        Policia poli2 = new Policia(
            "Simon", "Gomez", 132, 
            new Corta(6, 210, "Marca4", 20, "EN USO", false),
            new Larga(14,230,"Marca",10,"EN MANTENIMIENTO","Patrullaje",7,false)
            );
        System.out.println(poli2.toString());

        System.out.println("\n--------------\n" );

        if (poli2.armaCorta.enCondicion()) {
            System.out.println("El arma corta de " + poli2.nombre + " está en condiciones de uso");
        }else {
            System.out.println("El arma corta de " + poli2.nombre + " no está en condiciones de uso");
        }

        if (poli2.armaLarga.enCondicion()) {
            System.out.println("El arma larga de " + poli2.nombre + " está en condiciones de uso");
        }else {
            System.out.println("El arma larga de " + poli2.nombre + " no está en condiciones de uso");
        }

        System.out.println("\n--------------\n" );

        if (poli1.armaLarga.compareTo(poli2.armaLarga) == 1) {
            System.out.println("El arma larga de " + poli1.nombre + " tiene mayor nivel");
        }else if (poli1.armaLarga.compareTo(poli2.armaLarga) == -1) {
            System.out.println("El arma larga de " + poli2.nombre + " tiene mayor nivel");
        }else {
            System.out.println("Ambas armas largas tienen el mismo nivel");
        }

        System.out.println("" );

        if (poli1.armaCorta.efectividadMts()) {
            System.out.println("El arma corta de " + poli1.nombre + " es efectiva a 200 mts");
        }else {
            System.out.println("El arma corta de " + poli1.nombre + " no es efectiva a 200 mts");
        }

        if (poli2.armaCorta.efectividadMts()) {
            System.out.println("El arma corta de " + poli2.nombre + " es efectiva a 200 mts");
        }else {
            System.out.println("El arma corta de " + poli2.nombre + " no es efectiva a 200 mts");
        }

    }
}
