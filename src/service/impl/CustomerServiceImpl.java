package service.impl;

import Helper.CustomerServiceHelper;
import enums.Exceptions;
import exceptions.GeneralExceptions;
import model.Coffee;
import repository.CoffeeRepository;
import repository.CustomerRepository;
import repository.impl.CoffeeRepositoryImpl;
import repository.impl.CustomerRepositoryImpl;
import service.CoffeeService;
import service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        customerRepository = new CustomerRepositoryImpl();
    }


    @Override
    public void addCustomer() {
        CoffeeService coffeeService = new CoffeeServiceImpl();
        CoffeeRepository coffeeRepository = new CoffeeRepositoryImpl();
        coffeeService.showCoffee();
        System.out.println("Choose the coffee id: ");
        int optionCoffeeId = new Scanner(System.in).nextInt();
        List<Coffee> coffees = coffeeRepository.showCoffee();
        Coffee coffeeById = coffees.stream()
                .filter(coffee -> coffee.getId() == optionCoffeeId)
                .findFirst()
                .orElseThrow(() -> new GeneralExceptions(Exceptions.COFFEE_NOT_FOUND));

        customerRepository.addCustomer(CustomerServiceHelper.fillCustomer(coffeeById.getId()));
    }

    @Override
    public void showCustomer() {
        customerRepository.showCustomer()
                .forEach(System.out::println);
    }
}
