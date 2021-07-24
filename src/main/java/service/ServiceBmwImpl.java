package service;

import data.Bmw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ServiceBmwImpl {
    ArrayList<Bmw> listBmwCar = new ArrayList<>();
    private static final AtomicInteger IDCAR = new AtomicInteger();


    public void addBmwCar(Bmw bmw) { // add objects to ArrayList
        bmw.setNumofCars(IDCAR.incrementAndGet());
        listBmwCar.add(bmw);
    }


    public void removeBmwCar(Bmw bmw) {
        listBmwCar.remove(bmw);
    }


    public Bmw showBmwCar(int idCar) { // find a car
        Bmw bmwNull = null;
        for (Bmw bmw : listBmwCar) {
            if (bmw.getNumofCars() == idCar) return bmw;
        }
        return bmwNull;
    }


    public ArrayList showBmwCarAll() {
        return listBmwCar;
    }


    public ArrayList sortBmwCarSpeedUp() {
//for developing Test:
//        listBmwCar.add(new Bmw(11, "Jlmw1", 4, 4, 4.0, 4.0));
//        listBmwCar.add(new Bmw(22, "Abmw1", 4, 4, 3.0, 4.0));
//        listBmwCar.add(new Bmw(111, "Jkbmw1", 4, 4, 5.0, 4.0));

        List<Bmw> sortedBySpeedBmw = listBmwCar.stream()
                .sorted(new SortBySpeedUpCar())
                .collect(Collectors.toList());
        return (ArrayList<Bmw>)sortedBySpeedBmw;
    }




    public ArrayList sortBmwCarModel() {
        List<Bmw> sortedByModelBmw = listBmwCar.stream()
                .sorted(new SortByModelCar())
                .collect(Collectors.toList());
        return (ArrayList<Bmw>)sortedByModelBmw;
    }
}
