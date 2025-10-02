package Coffe_machine;


class DoubleEspresso extends Drink {

    public DoubleEspresso(String name) {
        super(name);}


    public String getName() {
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
