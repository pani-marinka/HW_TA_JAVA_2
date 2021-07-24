package service;

import data.Mercedes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ServiceMercedesImpl {

    ArrayList<Mercedes> listMercedesCar = new ArrayList<>();
    private static final AtomicInteger IDCAR = new AtomicInteger();


    public void addMercedesCar(Mercedes mercedes) { // add objects to ArrayList
        mercedes.setNumofCars(IDCAR.incrementAndGet());
        listMercedesCar.add(mercedes);
    }


    public void removeMercedesCar(Mercedes mercedes) {
        listMercedesCar.remove(mercedes);
    }


    public Mercedes showMercedesCar(int idCar) { // find a car
        Mercedes mercedesNull = null;
        for (Mercedes mercedes : listMercedesCar) {
            if (mercedes.getNumofCars() == idCar) return mercedes;
        }
        return mercedesNull;
    }


    public ArrayList showMercedesCarAll() {
        return listMercedesCar;
    }


    public ArrayList sortMercedesCarSpeedUp() {

        List<Mercedes> sortedBySpeedMercedes = listMercedesCar.stream()
                .sorted(new SortBySpeedUpCar())
                .collect(Collectors.toList());
        return (ArrayList<Mercedes>) sortedBySpeedMercedes;
    }


    public ArrayList sortMercedesCarModel() {
        List<Mercedes> sortedByModelMercedes = listMercedesCar.stream()
                .sorted(new SortByModelCar())
                .collect(Collectors.toList());
        return (ArrayList<Mercedes>) sortedByModelMercedes;
    }
}
