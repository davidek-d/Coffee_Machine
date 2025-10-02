package Coffe_machine;

// Coffe_machine.Coffee subklasse – polymorfi
class Blackcoffee extends Drink {
    public Blackcoffee(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        return this.name.compareToIgnoreCase(other.name);
    }


    @Override
    public Cup serve(Size size, boolean hasWhippedCream) {

        return new Cup(DrinkName, null, false);
    }
}