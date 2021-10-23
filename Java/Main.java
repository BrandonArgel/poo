package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Car car = new Car(1, "ABC123", new Account("Brandon", "Brand", "brandargel@gmail.com", "********"), 4);
        car.printDataCar();

        UberX uberx = new UberX(2, "XYZ987", new Account("Andrea", "Andy", "andy@gmail.com", "********"), 3,
                "Chevrolet", "Spark");
        uberx.printDataCar();
    }
}
