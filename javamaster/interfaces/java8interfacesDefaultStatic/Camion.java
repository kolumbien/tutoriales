package interfaces.java8interfacesDefaultStatic;

/**
 * Diamond Problem: have the same defautl methods--> solution is to implement them
 */
public class Camion implements  Vehicle, Alarm {

    @Override
    public String getBrand() {
        return "brand";
    }

    @Override
    public String speedUp() {
        return "speedUp";
    }

    @Override
    public String slowDown() {
        return "slowDown";
    }

    @Override
    public String turnAlarmOn() {
        return Alarm.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return Alarm.super.turnAlarmOff();
    }
}
