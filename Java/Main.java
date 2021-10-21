package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Car car = new Car(1, "ABC123", new Account("Brandon", "Brand"), 4);
        car.printDataCar();

        Car car2 = new Car(2, "XYZ987", new Account("Andrea", "Andy"), 3);
        car2.printDataCar();
    }
}
