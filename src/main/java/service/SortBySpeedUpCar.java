package service;

import data.Bmw;
import data.Car;

import java.util.Comparator;

class SortBySpeedUpCar implements Comparator<Car>{

//    public int compare(Car o1, Car o2) {
//        return o1.getSpeedUp() > o2.getSpeedUp() ? -1 : 1;
//
//    }


        public int compare(Car o1, Car o2) {
            return o1.getSpeedUp() > o2.getSpeedUp() ? -1 : 1;
        }
}

/**
 class SortByDate implements Comparator<Ad> { //comparator for FavorTop3
 public int compare(Ad o1, Ad o2) {
 return o1.getDate().getTime() > o2.getDate().getTime() ? -1 : 1;
 }
 }

 */
