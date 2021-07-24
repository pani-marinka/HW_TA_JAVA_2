package enums;

public enum Enums {
    SELECTMARK("You wont to work with BMW (1) or MERCEDES (2),  3 - Exit"),
    ACTIVES("Select 1 - Add object  2 - View all cars 3 - Car Detail(idCar) 4 - Remove car(idCar) 5 - Sort car SpeedUp 6 - Sort car model  7 - Change mark car 8 - Exit "),
    TRYMORE("INCORRET CHOICE"),
    MODEL("What model?"),
    SPEEDUP ("What SpeedUp?"),
    SLOWDOWN ("What SlowDown&"),
    MILAGE ("What milage?"),
    MAXSPEED("What MaxSpeed?"),
    IDENTIFYCAR ("What identify Car (numsOfCar)?");


    private Enums(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
