package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passengers;

    // public UberVan(int id, String license, Account driver, int passengers,
    // Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String>
    // seatsMaterial) {
    // super(id, license, driver, passengers);
    // this.typeCarAccepted = typeCarAccepted;
    // this.seatsMaterial = seatsMaterial;
    // }

    public UberVan(int id, String license, Account driver, int passengers) {
        super(id, license, driver, passengers);
    }

    public void setPassengers(int passengers) {
        if (passengers == 6) {
            this.passengers = passengers;
        } else {
            System.out.println("The number of passengers must be 6");
        }
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Uber Van");
    }
}
