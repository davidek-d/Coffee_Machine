package Coffe_machine;

// Coffe_machine.Cup-klasse – eksempel på encapsulation
class Cup {
    private String DrinkName;
    private Size DrinkSize;
    private boolean HasWhippedCream;

    public Cup(String DrinkName, Size DrinkSize, boolean HasWhippedCream){
        this.DrinkName = DrinkName;
        this.DrinkSize = DrinkSize;
        this.HasWhippedCream = HasWhippedCream;

    }

    //getters
    public String getDrinkName(){
        return DrinkName;
    }

    public Size getDrinkSize(){
        return DrinkSize;
    }

    public boolean HasWhippedCream() {
        return HasWhippedCream;
    }

    //toString
    public String toString() {
        return DrinkName + " " + DrinkSize + " " + HasWhippedCream;
    }

    // TODO: private felter: drinkName, size, whippedCream

    // TODO: Lav constructor, der initialiserer felterne

    // TODO: Implementér getters for alle felter

    // TODO: Implementér toString(), fx "Coffe_machine.Cup{drinkName='Coffe_machine.Espresso', size=N/A, whippedCream=false}"
}
