package com.company;

public class Auto implements Comparable<Auto>{
    private String brand;
    private String model;
    public int price;

    public Auto(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Auto o) {
        if (this.getModel().compareTo(o.getModel()) == 0) {
            return this.getPrice() - o.getPrice();
        }
        return this.getModel().compareTo(o.getModel());
    }
}
