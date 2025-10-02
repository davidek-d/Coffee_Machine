package Coffe_machine;

// Coffe_machine.Espresso subklasse – polymorfi
class Espresso extends Drink {
    public Espresso(String name) {
        super(name);
    }
    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public Cup serve(String drinkName, Size size, boolean HasWhippedCream) {

        return new Cup(drinkName, null, false);
    }
}
