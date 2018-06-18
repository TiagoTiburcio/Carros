package com.example.tiagoc.carros.data;

import com.example.tiagoc.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mListCars;

    public CarMock() {
        this.mListCars = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            this.mListCars.add(new Car(i,String.valueOf(i),i * 10 ,Double.valueOf(i * 1000)));
        }
    }

    public List<Car> getList() {
        return this.mListCars;
    }

    public Car get(int id){
        return this.mListCars.get(id);
    }
}
