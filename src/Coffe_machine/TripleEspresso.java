package Coffe_machine;

// Coffe_machine.Espresso subklasse – polymorfi
class TripleEspresso extends Drink {
    public TripleEspresso(String name) {

        super(name);
    }

    public String getname(){
        return name;
    }

    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    // TODO: Coffe_machine.Espresso har fast størrelse – size ignoreres
    // TODO: Returner en Coffe_machine.Cup med navn, ingen size og uden flødeskum
    @Override
    public Cup serve(String drinkName, Size size, boolean whippedCream) {

        return new Cup(drinkName, null, false);
    }
}
