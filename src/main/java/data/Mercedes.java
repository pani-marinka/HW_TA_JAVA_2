package data;

public class Mercedes extends Car {



    @Override
    public String getBrand() {
        return "car Mercedes";

    }

    @Override
    public double SpeedUp() {
        return getSpeedUp();

    }

    @Override
    public double SlowDown() {
        return getSlowDown();
    }
}
