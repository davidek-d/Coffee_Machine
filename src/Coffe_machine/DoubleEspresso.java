package Coffe_machine;


class DoubleEspresso extends Drink {

    public DoubleEspresso(String name) {
        super(name);}


    public String getName() {
        return name;
    }

//    public void setName(){
//        this.name;
//    }

    // compareTo implementeres her i superklassen
    @Override
    public int compareTo(Drink other) {
        return this.name.compareToIgnoreCase(other.name);
    }

//    private boolean whippedCream(){
//        System.out.println("This kind of Coffee, dosn´t get served with whipped Cream");
//        return false;
//    }


    // TODO: Coffe_machine.Espresso har fast størrelse – size ignoreres
    // TODO: Returner en Coffe_machine.Cup med navn, ingen size og uden flødeskum
    @Override
    public Cup serve(String drinkName, Size size, boolean whippedCream) {
        return new Cup(drinkName, null, false);
    }
}
