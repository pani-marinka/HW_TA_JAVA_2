package service;

import data.Car;

import java.util.Comparator;

class SortByModelCar implements Comparator<Car>{
    public int compare(Car o1, Car o2) {
        return (o1.getModel().toUpperCase().compareTo(o2.getModel().toUpperCase()));
    }
}
