package com.example.javaJPM.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Productmodel
{
    @Id
    int id;
    String name;
    int price;

    public Productmodel()
    {
    }

    public Productmodel(int id, String name, int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Productmodel(int productId, String space, String space1) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
