const uberX = new UberX(1, "ABC123", new Account("Brandon", "Brand"), 4, "Chevrolet", "Spark");
uberX.printDataCar();

const uberVan = new UberVan(2, "DEF456", new Account("Andrea", "Andy"), 6, "Dodge", "Attitude");
uberVan.printDataCar();
uberVan.setPassengers(7);

// const paypal = new Paypal(3, "brandargel@gmail.com");
// paypal.printDataPayment();
