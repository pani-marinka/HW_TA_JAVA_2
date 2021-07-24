package util;

import enums.Enums;

import java.util.Scanner;

public class ServiceUtil {
    private static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static String mainSelect() {
        System.out.println(Enums.SELECTMARK.getValue());
        return getScanner().nextLine();
    }

    public static String markSelect() {
        System.out.println(Enums.ACTIVES.getValue());
        return getScanner().nextLine();
    }

    public static String model() {
        System.out.println(Enums.MODEL.getValue());
        return getScanner().nextLine();
    }
    public static String maxSpeed() {
        System.out.println(Enums.MAXSPEED.getValue());
        return getScanner().nextLine();
    }
    public static String milage() {
        System.out.println(Enums.MILAGE.getValue());
        return getScanner().nextLine();
    }
    public static String speedUp() {
        System.out.println(Enums.SPEEDUP.getValue());
        return getScanner().nextLine();
    }
    public static String slowDown() {
        System.out.println(Enums.SLOWDOWN.getValue());
        return getScanner().nextLine();
    }

    public static String viewIdCar() {
        System.out.println(Enums.IDENTIFYCAR.getValue());
        return getScanner().nextLine();
    }


}
