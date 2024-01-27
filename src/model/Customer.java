package model;

import java.time.LocalDateTime;

public class Customer {
    private Long id;
    private String name;
    private String surname;
    private LocalDateTime orderTime;
    private int coffeeId;

    public Customer(Long id, String name, String surname, LocalDateTime orderTime, int coffeeId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.orderTime = orderTime;
        this.coffeeId = coffeeId;
    }

    public Customer(String name, String surname, int coffeeId) {
        this.name = name;
        this.surname = surname;
        this.coffeeId = coffeeId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(int coffeeId) {
        this.coffeeId = coffeeId;
    }

    @Override
    public String toString() {
        return "---------------\n" +
                "\nId: " + getId() +
                "\nName: " + getName() +
                "\nSurname: " + getSurname() +
                "\nCoffeeId: " + getCoffeeId() +
                "\n---------------";
    }
}
