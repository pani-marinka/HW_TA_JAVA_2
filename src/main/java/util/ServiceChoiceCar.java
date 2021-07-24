package util;

import data.Bmw;
import service.ServiceBmwImpl;

public class ServiceChoiceCar {

    ServiceBmwImpl serviceBmwImpl = new ServiceBmwImpl();

    public void addCar(int markCar) {
        String model = ServiceUtil.model();
        String maxSpeed = ServiceUtil.maxSpeed();
        String milage = ServiceUtil.milage();
        String speedUp = ServiceUtil.speedUp();
        String slowDown = ServiceUtil.slowDown();

        switch (markCar) {
            case 1:
                Bmw bmw = new Bmw();
                bmw.setMaxSpeed(Integer.parseInt(maxSpeed));
                bmw.setMilage(Integer.parseInt(milage));
                bmw.setModel(model);
                bmw.setSpeedUp(Double.parseDouble(speedUp));
                bmw.setSlowDown(Double.parseDouble(slowDown));
                serviceBmwImpl.addBmwCar(bmw);
                break;
            case 2:
            default:
                System.out.println("INCORRECT");
                break;
        }
    }

    public void viewAllCars(int markCar) {
        switch (markCar) {
            case 1:
                System.out.println(serviceBmwImpl.showBmwCarAll().toString());
                break;
            case 2:
            default:
                System.out.println("INCORRECT");
                break;
        }
    }

    public void sortViewCarsSpeedUp(int markCar) {

        switch (markCar) {
            case 1:
                System.out.println(serviceBmwImpl.sortBmwCarSpeedUp().toString());
                break;
            case 2:
            default:
                System.out.println("INCORRECT");
                break;
        }
    }

    public void carDetail(int markCar, int idCar) {

        switch (markCar) {
            case 1:
                System.out.println(serviceBmwImpl.showBmwCar(idCar).toString());
                break;
            case 2:
            default:
                System.out.println("INCORRECT");
                break;
        }
    }

    public void carRemove(int markCar, int idCar) {

        switch (markCar) {
            case 1:
                serviceBmwImpl.removeBmwCar(serviceBmwImpl.showBmwCar(idCar));
                System.out.println("Remove Car");
                break;
            case 2:
            default:
                System.out.println("INCORRECT");
                break;
        }
    }

    public void sortViewCarsModel(int markCar) {

        switch (markCar) {
            case 1:
                System.out.println(serviceBmwImpl.sortBmwCarModel().toString());
                break;
            case 2:
            default:
                System.out.println("INCORRECT");
                break;
        }
    }
}

