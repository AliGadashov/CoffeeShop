package Helper;

import model.Coffee;
import util.InputUtil;


public class CoffeeServiceHelper {
    public static Coffee fillCoffee() {
        System.out.println("----------------");
        String name = InputUtil.getInstance().inputTypeString("Enter the name: ");
        double price = InputUtil.getInstance().inputTypeDouble("Enter the price: ");
        System.out.println("----------------");

        return new Coffee(name,price);
    }
}
