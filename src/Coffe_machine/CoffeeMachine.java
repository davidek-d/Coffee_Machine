package Coffe_machine;

import java.util.ArrayList;
import java.util.List;

// Kaffemaskine klasse – aggregation
class CoffeeMachine {
    private List<Drink> drinks;

    public CoffeeMachine() {
        drinks = new ArrayList<>();
        // TODO: Tilføj forskellige drikke til listen
        // Eksempel: drinks.add(new Coffe_machine.Coffee("Sort kaffe"));
        drinks.add(new Blackcoffee("BlackCoffee"));
        drinks.add(new Espresso("Espresso"));
        drinks.add(new DoubleEspresso("DoubleEspresso"));
        drinks.add(new TripleEspresso("TripleEspresso"));
        drinks.add(new LatteMachiato("LatteMachiato"));
        drinks.add(new HotChoclate("HotChocolate"));
        drinks.add(new MilkChoclate("MilkChocolate"));
        // TODO: Tilføj Coffe_machine.Espresso og Coffe_machine.ChocolateDrink
    }

    /*
     * Serve en drik
     * - Søger i listen efter navn
     * - Kalder serve() på den rigtige drik
     */
    public Cup serveDrink(String drinkName, Size size, boolean whippedCream) {
        for (Drink d : drinks) {
            if(drinkName.equalsIgnoreCase(String.valueOf(drinks))) {
                //Returner resultatet af serve()
                return d.serve(drinkName, size, whippedCream);
                //Håndter hvis drikken ikke findes
            } else {
                System.out.println("Fejl, kan ikke finde");
            }
        }

        // TODO: sortDrinks() – sorter alfabetisk via Comparable

        // TODO: listDrinks() – udskriv alle drikke til konsol
    }
}
