package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(Integer id, String license, Account driver, Integer passengers) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passengers = passengers;
    }

    void printDataCar() {
        System.out.println("License: " + license + " - Driver: " + driver.name + " - Passengers: " + passengers);
    }
}
