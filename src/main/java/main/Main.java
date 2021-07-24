package main;

import enums.Enums;
import util.ServiceChoiceCar;
import util.ServiceUtil;

public class Main {


    public static void main(String[] args) {

        ServiceChoiceCar serviceChoiceCar = new ServiceChoiceCar();

        //Select user:
        // 1 - bmw, 2 - mercedes , 3 - exit;
        //  1 - Add object  2 - View all cars 3 - Car Detail(idCar) 4 - Remove car(idCar) 5 - Sort car SpeedUp 6 - Sort car model  7 - Change mark car 8 - Exit

        String userDecision = ServiceUtil.mainSelect();
        if (!userDecision.isEmpty() && userDecision.equals("3")) System.exit(0);
        String userActive = ServiceUtil.markSelect();


        int forCase = 0;
        int idCar = -1;

        do {
            switch (userActive) {
                case "1":
                    serviceChoiceCar.addCar(Integer.parseInt(userDecision));
                    userActive = ServiceUtil.markSelect();
                    break;
                case "2":
                    serviceChoiceCar.viewAllCars(Integer.parseInt(userDecision));
                    userActive = ServiceUtil.markSelect();
                    break;
                case "3":
                    try {
                        idCar = Integer.parseInt(ServiceUtil.viewIdCar());
                    } catch (NumberFormatException e) {
                        System.out.println(Enums.TRYMORE.getValue());
                        userActive = ServiceUtil.markSelect();
                        break;
                    }
                    serviceChoiceCar.carDetail(Integer.parseInt(userDecision), idCar);
                    userActive = ServiceUtil.markSelect();
                    break;
                case "4":
                    try {
                        idCar = Integer.parseInt(ServiceUtil.viewIdCar());
                    } catch (NumberFormatException e) {
                        System.out.println(Enums.TRYMORE.getValue());
                        userActive = ServiceUtil.markSelect();
                        break;
                    }
                    serviceChoiceCar.carRemove(Integer.parseInt(userDecision), idCar);
                    userActive = ServiceUtil.markSelect();
                    break;
                case "5":
                    serviceChoiceCar.sortViewCarsSpeedUp(Integer.parseInt(userDecision));
                    userActive = ServiceUtil.markSelect();
                    break;
                case "6":
                    serviceChoiceCar.sortViewCarsModel(Integer.parseInt(userDecision));
                    userActive = ServiceUtil.markSelect();
                    break;
                case "7":
                    userDecision = ServiceUtil.mainSelect();
                    if (!userDecision.isEmpty() && userDecision.equals("3")) System.exit(0);
                    userActive = ServiceUtil.markSelect();
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.out.println(Enums.TRYMORE.getValue());
                    userDecision = ServiceUtil.mainSelect();
                    if (!userDecision.isEmpty() && userDecision.equals("3")) System.exit(0);
                    userActive = ServiceUtil.markSelect();
                    break;
            }
        } while (forCase == 0);
    }


}
/*
сфыу 3

 */
