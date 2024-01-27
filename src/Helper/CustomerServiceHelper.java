package Helper;

import model.Customer;
import util.InputUtil;

public class CustomerServiceHelper {
    public static Customer fillCustomer(int coffeeId) {
        System.out.println("----------------");
        String name = InputUtil.getInstance().inputTypeString("Enter the name: ");
        String surname = InputUtil.getInstance().inputTypeString("Enter the surname: ");
        System.out.println("----------------");

        return new Customer(name,surname,coffeeId);
    }
}
