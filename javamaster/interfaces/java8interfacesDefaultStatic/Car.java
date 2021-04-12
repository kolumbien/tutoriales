package interfaces.java8interfacesDefaultStatic;

/**
 * default methods turnAlarmOn() and turnAlarmOff() from our Vehicle interface are automatically available in the Car
 * class.
 *
 *
 */
public class Car implements Vehicle {

    private String brand;

    public Car(final String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}