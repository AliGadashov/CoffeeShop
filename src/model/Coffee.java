package model;

public class Coffee {
    private int id;
    private String name;
    private int size;
    private double price;

    public Coffee(int id, String name, int size, double price) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Coffee(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "---------------\n" +
                "\nId: " + getId() +
                "\nName: " + getName() +
                "\nSize: " + getSize() +
                "\nPrice: " + getPrice() +
                "\n---------------";
    }
}
