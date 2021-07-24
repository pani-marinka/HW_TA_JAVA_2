package data;

public class Bmw extends Car{


    @Override
    public String getBrand() {
        return "car BMW";
    }

    @Override
    public double SpeedUp() {
        return 0;
    }

    @Override
    public double SlowDown() {
        return 0;
    }
}
