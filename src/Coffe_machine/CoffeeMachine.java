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
        drinks.add(new Blackcoffee("Black Coffee"));
        drinks.add(new Espresso("Espresso"));
        drinks.add(new DoubleEspresso("Double espresso"));
        drinks.add(new TripleEspresso("Triple espresso"));
        drinks.add(new LatteMachiato("Latte machiato"));
        drinks.add(new HotChoclate("Hot chocolate"));
        drinks.add(new MilkChoclate("Milk chocolate"));
        // TODO: Tilføj Coffe_machine.Espresso og Coffe_machine.ChocolateDrink
    }

    /*
     * Serve en drik
     * - Søger i listen efter navn
     * - Kalder serve() på den rigtige drik
     */
    public Cup serveDrink(String drinkName, Size size, boolean whippedCream) {
        // TODO: Loop igennem drinks-listen
        for (Drink d : drinks) {
            // TODO: Tjek om navnet matcher (ignoreCase)
            if(drinkName.equalsIgnoreCase(String.valueOf(drinks)))

            // TODO: Returner resultatet af serve()
            // TODO: Håndter hvis drikken ikke findes
            return null;
        }

        // TODO: sortDrinks() – sorter alfabetisk via Comparable

        // TODO: listDrinks() – udskriv alle drikke til konsol
    }
}
