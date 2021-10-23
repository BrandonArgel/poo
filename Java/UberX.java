package Java;

class UberX extends Car {
    String brand;
    String model;

    public UberX(int id, String license, Account driver, int passengers, String brand, String model) {
        super(id, license, driver, passengers);
        this.brand = brand;
        this.model = model;
    }
}