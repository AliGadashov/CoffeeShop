package service.impl;

import enums.Exceptions;
import exceptions.GeneralExceptions;
import service.CoffeeService;
import service.CustomerService;
import service.ManagementService;
import util.MenuUtil;

public class ManagementServiceImpl implements ManagementService {
    @Override
    public void management() {
        CustomerService customerService = new CustomerServiceImpl();
        CoffeeService coffeeService = new CoffeeServiceImpl();
        while(true){
            try {
                byte option = MenuUtil.entryApp();
                switch (option){
                    case 0 -> System.exit(-1);
                    case 1 -> customerService.addCustomer();
                    case 2 -> customerService.showCustomer();
                    case 3 -> coffeeService.addCoffee();
                    default -> throw  new GeneralExceptions(Exceptions.INVALID_OPTION);

                }
            }catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
