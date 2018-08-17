package com.example.tiagoc.carros.data;

import android.app.Activity;

import com.example.tiagoc.carros.R;
import com.example.tiagoc.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mListCars;

    public CarMock(Activity activity) {
        this.mListCars = getCarMockList(activity);
        }


    public List<Car> getList() {
        return this.mListCars;
    }

    public Car get(int id) {
        return this.mListCars.get(id);
    }

    private List<Car> getCarMockList(Activity activity) {

        List<Car> mMockList =  new ArrayList<>();
        int id = 0;
        Car audiR8 = new Car(id, "Audi R8", "Audi", 610, 1165338.00, activity.getResources().getDrawable(R.drawable.audir8));
        mMockList.add(audiR8);
        Car bugattiChiron = new Car(++id, "Bugatti Chiron", "Bugatti", 1520, 10000000.00, activity.getResources().getDrawable(R.drawable.bugattichiron));
        mMockList.add(bugattiChiron);
        Car civicTypeR = new Car(++id, "Civic Type R", "Honda", 310, 136000.00, activity.getResources().getDrawable(R.drawable.civictyper));
        mMockList.add(civicTypeR);
        Car corolla = new Car(++id, "Corolla", "Toyota", 144, 101000.00, activity.getResources().getDrawable(R.drawable.corolla));
        mMockList.add(corolla);
        Car ferrari458Italia = new Car(++id, "Ferrari 458 Itália", "Ferrari", 670, 1500000.00, activity.getResources().getDrawable(R.drawable.ferrari458));
        mMockList.add(ferrari458Italia);
        Car ferrariF60America = new Car(++id, "Ferrari F60 América", "Ferrari", 700, 2500000.00, activity.getResources().getDrawable(R.drawable.ferrarif60america));
        mMockList.add(ferrariF60America);
        Car jaguarFTypeCoupe = new Car(++id, "Jaguar F-Type Coupe", "Jaguar", 340, 500000.00, activity.getResources().getDrawable(R.drawable.jaguarftype));
        mMockList.add(jaguarFTypeCoupe);
        Car jeepRenegade = new Car(++id, "Jeep Renegade", "Jeep", 139, 79000.00, activity.getResources().getDrawable(R.drawable.jeeprenegade));
        mMockList.add(jeepRenegade);
        Car lamborghiniAventador = new Car(++id, "Lamborghini Aventador", "Lamborghini", 700, 2800000.00, activity.getResources().getDrawable(R.drawable.lamborghiniaventador));
        mMockList.add(lamborghiniAventador);
        Car mcLarenMP412C = new Car(++id, "McLaren MP4-12C", "McLaren", 625, 2200000.00, activity.getResources().getDrawable(R.drawable.mclarenmp412c));
        mMockList.add(mcLarenMP412C);
        Car mustang = new Car(++id, "Mustang", "Ford", 533, 270000.00, activity.getResources().getDrawable(R.drawable.mustang));
        mMockList.add(mustang);
        Car porsche911 = new Car(++id, "Porsche 911", "Porsche", 435, 509000.00, activity.getResources().getDrawable(R.drawable.porsche911));
        mMockList.add(porsche911);
        Car rangeRoverEvoque = new Car(++id, "Range Rover Evoque", "Range Rover", 285, 224000.00, activity.getResources().getDrawable(R.drawable.rangerover));
        mMockList.add(rangeRoverEvoque);
        Car vanquish = new Car(++id, "Vanquish", "Aston Martin", 573, 1850000.00, activity.getResources().getDrawable(R.drawable.vanquish));
        mMockList.add(vanquish);
        return mMockList;
    }
}
