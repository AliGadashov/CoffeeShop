package repository;

import model.Coffee;

import java.util.List;

public interface CoffeeRepository {

    void addCoffee(Coffee coffee);
    List<Coffee> showCoffee();

}
