package service.impl;

import Helper.CoffeeServiceHelper;
import model.Coffee;
import repository.CoffeeRepository;
import repository.impl.CoffeeRepositoryImpl;
import service.CoffeeService;

import java.util.List;

public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeServiceImpl() {
        coffeeRepository = new CoffeeRepositoryImpl();
    }

    @Override
    public void addCoffee() {
        coffeeRepository.addCoffee(CoffeeServiceHelper.fillCoffee());
    }

    @Override
    public void showCoffee() {
        coffeeRepository.showCoffee()
                .forEach(System.out::println);
    }
}
