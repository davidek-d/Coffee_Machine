package Coffe_machine;

// Coffe_machine.ChocolateDrink subklasse – polymorfi
class HotChoclate extends Drink {
    public HotChoclate(String name) {
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
        // TODO: Coffe_machine.ChocolateDrink kan tilføje flødeskum
        // TODO: Returner en Coffe_machine.Cup med navnet, størrelse og flødeskum
        return null;
    }
}
