package com.example.tiagoc.carros.entities;

import android.graphics.drawable.Drawable;

public class Car {
    public int id;
    public String model;
    public String manfacturer;
    public int horsePower;
    public Double price;
    public Drawable picture;

    public Car(int id, String model, String manfacturer, int horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.manfacturer = manfacturer;
        this.horsePower = horsePower;
        this.price = price;
        this.picture = picture;
    }
}
