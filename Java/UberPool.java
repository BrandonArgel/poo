package Java;

class UberPool extends Car {
    String brand;
    String model;

    public UberPool(int id, String license, Account driver, int passengers, String brand, String model) {
        super(id, license, driver, passengers);
        this.brand = brand;
        this.model = model;
    }
}