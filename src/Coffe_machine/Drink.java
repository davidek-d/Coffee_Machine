package Coffe_machine;

/*
 * Abstrakt klasse Coffe_machine.Drink
 * - Skal arves af alle drikke
 * - Viser abstraktion, polymorfi og arv
 */
abstract class Drink implements Comparable<Drink> {

    protected String name; // TODO: Overvej om dette skal være private med getter/setter

    public Drink(String name) {
        // TODO: Sæt navnet på drikken
    }

    /*
     * Polymorf metode serve
     * - Skal implementeres forskelligt i subklasser
     * - Skal returnere en Coffe_machine.Cup med den valgte drik
     */
    public abstract Cup serve(Size size, boolean whippedCream);

    // TODO: Implementér getter for name

    // TODO: Implementér compareTo() for alfabetisk sortering af drikke

    // TODO: Implementér toString() til at vise drikkens navn
}

