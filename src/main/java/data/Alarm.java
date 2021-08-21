package data;

public interface Alarm {
    default String turnAlarmON(boolean state) {

        if (state) return "Alarm is already On";
        return "Alarm On";
    }

    ;

    default String turmAlarmOff(boolean state) {
        if (state) return "Alarm is already Off";
        return "Alarm Off";
    }

    //test
}
