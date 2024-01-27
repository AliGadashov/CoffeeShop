package repository.impl;

import enums.Exceptions;
import exceptions.GeneralExceptions;
import model.Customer;
import queries.CustomerQuery;
import repository.CustomerRepository;
import repository.DBConnection;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public void addCustomer(Customer customer) {
        Connection connection = DBConnection.connection();
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(CustomerQuery.ADD_CUSTOMER);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getSurname());
            preparedStatement.setInt(3, customer.getCoffeeId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> showCustomer() {
        List<Customer> customers = new LinkedList<>();
        Connection connection = DBConnection.connection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CustomerQuery.SHOW_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.wasNull()){
                throw new GeneralExceptions(Exceptions.CUSTOMER_NOT_FOUND);
            }
            while (resultSet.next()){
                long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                String  surname = resultSet.getString(3);
                LocalDateTime orderTime = resultSet.getTimestamp(4).toLocalDateTime();
                int coffeeId = resultSet.getInt(5);

                customers.add(new Customer(id,name,surname,orderTime,coffeeId));
            }
            return customers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
