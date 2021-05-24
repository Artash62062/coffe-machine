package Factoties;

import Models.Attributes.Cup;
import Models.Attributes.Stick;
import Models.Attributes.Sugar;
import Models.Drinks.Drink;

import java.util.Arrays;

public class Product {
    Sugar[] sugar ;
    Cup cup = new Cup();
    Drink drink;
    Stick stick;

    public Product(Sugar[] sugar, Cup cup, Drink drink, Stick stick) {
        this.sugar = sugar;
        this.cup = cup;
        this.drink = drink;
        this.stick = stick;
    }

    public Product() {
    }


    public Sugar[] getSugar() {
        return sugar;
    }

    public void setSugar(Sugar[] sugar) {
        this.sugar = sugar;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    @Override
    public String toString() {
        StringBuilder productString = new StringBuilder();
        if(drink == null) {
            productString.append("You have a Empty Cup ");
        }else {
            productString.append("You Have Cup of ").append(drink.toString());
        }

        if(sugar.length == 0) {
            productString.append(" Without sugar ");
        } else {
            productString.append(" With ") .append(sugar.length).append(" Sugar").append("With Stick");
        }
        return productString.toString();
    }
}
