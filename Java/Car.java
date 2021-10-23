package Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengers;

    public Car(Integer id, String license, Account driver, Integer passengers) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passengers = passengers;
    }

    void printDataCar() {
        if (passengers != null) {
            System.out.println("License: " + license + " - Driver: " + driver.name + " - Passengers: " + passengers);
        }
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        if (passengers == 4) {
            this.passengers = passengers;
        } else {
            System.out.println("The number of passengers must be 4");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}
