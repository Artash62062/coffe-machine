package Commands;

import Models.Drinks.DrinkTypes;

public class Command {
    int sugarCount;
    DrinkTypes drinkType;

    public Command(int sugarCount, DrinkTypes drinkType) {
        this.sugarCount = sugarCount;
        this.drinkType = drinkType;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public DrinkTypes getDrinkType() {
        return drinkType;
    }
}
