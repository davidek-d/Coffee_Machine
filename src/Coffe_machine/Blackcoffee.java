package Coffe_machine;

// Coffe_machine.Coffee subklasse – polymorfi
class Blackcoffee extends Drink {
    public Blackcoffee(String name) {
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
        // TODO: Coffe_machine.Coffee kan have størrelser, men ikke flødeskum
        // TODO: Returner en Coffe_machine.Cup med korrekt navn og størrelse
        return null; // TODO: Erstat null med faktisk Coffe_machine.Cup
    }
}