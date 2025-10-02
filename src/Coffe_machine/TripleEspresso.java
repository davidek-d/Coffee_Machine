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


    @Override
    public Cup serve(String drinkName, Size size, boolean HasWhippedCream) {

        return new Cup(drinkName, null, false);
    }
}
