package data;

import java.util.Objects;

public abstract class Car implements Vehicle, Alarm {
    final int WHEELS = 4;
    boolean alarm;
    private int numofCars;
    private String model;
    private int maxSpeed;
    private int milage;
    private double SpeedUp;
    private double SlowDown;

    public Car() {
    }

    public Car(int numofCars, String model, int maxSpeed, int milage, double speedUp, double slowDown) {
        this.numofCars = numofCars;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.milage = milage;
        this.SpeedUp = speedUp;
        this.SlowDown = slowDown;
    }

    public int getWHEELS() {
        return WHEELS;
    }

    public int getNumofCars() {
        return numofCars;
    }

    public void setNumofCars(int numofCars) {
        this.numofCars = numofCars;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public double getSpeedUp() {
        return SpeedUp;
    }

    public void setSpeedUp(double speedUp) {
        SpeedUp = speedUp;
    }

    public double getSlowDown() {
        return SlowDown;
    }

    public void setSlowDown(double slowDown) {
        SlowDown = slowDown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return WHEELS == car.WHEELS && numofCars == car.numofCars && maxSpeed == car.maxSpeed && milage == car.milage && Double.compare(car.SpeedUp, SpeedUp) == 0 && Double.compare(car.SlowDown, SlowDown) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(WHEELS, numofCars, model, maxSpeed, milage, SpeedUp, SlowDown);
    }

    @Override
    public String toString() {
        return "Car{ " + getBrand() +" "+
                " Has WHEELS =" + WHEELS +
                ", Invent nomer (numofCars) =" + numofCars +
                ", model ='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", milage=" + milage +
                ", SpeedUp=" + SpeedUp +
                ", SlowDown=" + SlowDown +
                '}';
    }
}
