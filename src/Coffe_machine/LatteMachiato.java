package Coffe_machine;

// Coffe_machine.Espresso subklasse – polymorfi
class LatteMachiato extends Drink {
    public LatteMachiato(String name) {
        super(name); // TODO: kald super constructor
    }
    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        // TODO: Sammenlign navne alfabetisk
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public Cup serve(Size size, boolean whippedCream) {
        // TODO: Coffe_machine.Espresso har fast størrelse – size ignoreres
        // TODO: Returner en Coffe_machine.Cup med navn, ingen size og uden flødeskum
        return null;
    }
}
