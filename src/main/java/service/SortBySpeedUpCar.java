package service;

import data.Bmw;
import data.Car;

import java.util.Comparator;

class SortBySpeedUpCar implements Comparator<Car>{

        public int compare(Car o1, Car o2) {
            return o1.getSpeedUp() > o2.getSpeedUp() ? -1 : 1;
        }
}

