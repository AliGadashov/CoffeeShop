package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {
    void addCustomer(Customer customer);
    List<Customer> showCustomer();
}
