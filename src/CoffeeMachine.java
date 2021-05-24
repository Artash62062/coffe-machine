import Commands.Command;
import Commands.CommandController;
import Factoties.Product;
import Factoties.ProductFactory;

public class CoffeeMachine {
    ProductFactory productFactory;

    public void start() {
        boolean isWorking = true;
        while (isWorking) {
            CommandController.commandController.setCommand();
            Command command = CommandController.commandController.getCommand();
            productFactory = new ProductFactory();
            Product finalProduct = productFactory.getProduct(command);
            System.out.println(finalProduct);
        }
    }

}
