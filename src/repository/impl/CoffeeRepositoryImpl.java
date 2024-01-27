package repository.impl;

import enums.Exceptions;
import exceptions.GeneralExceptions;
import model.Coffee;
import queries.CoffeeQuery;
import repository.CoffeeRepository;
import repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class CoffeeRepositoryImpl implements CoffeeRepository {
    @Override
    public void addCoffee(Coffee coffee) {
        Connection connection = DBConnection.connection();
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(CoffeeQuery.ADD_COFFEE);
            preparedStatement.setString(1,coffee.getName());
            preparedStatement.setDouble(2,coffee.getPrice());

            preparedStatement.execute();

            preparedStatement.close();
            DBConnection.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Coffee> showCoffee() {
        List<Coffee> coffees = new LinkedList<>();
        Connection connection = DBConnection.connection();
        try {
         PreparedStatement preparedStatement = connection.prepareStatement(CoffeeQuery.SHOW_COFFEE);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.wasNull()){
                throw new GeneralExceptions(Exceptions.COFFEE_NOT_FOUND);
            }
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int size = resultSet.getInt(3);
                double price = resultSet.getDouble(4);

                coffees.add(new Coffee(id,name,size,price));
            }
            return coffees;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
