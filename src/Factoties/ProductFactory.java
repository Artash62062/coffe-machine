package Factoties;

import Models.Attributes.Cup;
import Models.Attributes.Stick;
import Models.Attributes.Sugar;
import Commands.Command;
import Models.Drinks.*;

public class ProductFactory {
    public Product product = new Product();

    public Product getProduct(Command command) {
        if (command.getSugarCount() > 0) {
            product.setStick(new Stick());
        } else if (command.getSugarCount() == 0) {
            product.setStick(null);
        }
        product.setSugar(new Sugar[command.getSugarCount()]);
        product.setCup(new Cup());


        for (int i = 0; i < command.getSugarCount(); i++) {
            product.getSugar()[i] = new Sugar();
        }

        switch (command.getDrinkType()) {
            case CHOCOLATE:
                product.setDrink(new Chocolate());
                break;
            case COFFEE:
                product.setDrink(new Coffee());
                break;
            case TEA:
                product.setDrink(new Tea());
                break;
            default:
                product.setDrink(null);
                break;
        }

        return product;
    }
}
