const uberX = new UberX(1, "ABC123", new Account("Brandon", "Brand"), 4, "Chevrolet", "Spark");
uberX.printDataCar();

const uberBlack = new UberBlack(2, "DEF456", new Account("Andrea", "Andy"), 3, "Dodge", "Attitude");
uberBlack.printDataCar();

const paypal = new Paypal(3, "brandargel@gmail.com");
paypal.printDataPayment();
