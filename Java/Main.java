package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Car car = new Car(1, "ABC123", new Account("Brandon", "Brand",
        // "brandargel@gmail.com", "********"), 4);

        // UberX uberx = new UberX(2, "XYZ987", new Account("Andrea", "Andy",
        // "andy@gmail.com", "********"), 3,
        // "Chevrolet", "Spark");

        UberVan uberVan = new UberVan(3, "awdadwa", new Account("Jonathan", "Jony", "jnny@gmail.com", "********"), 6);
        uberVan.setPassengers(7);
        uberVan.printDataCar();
    }
}
