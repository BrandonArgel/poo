<?php

require_once('car.php');
require_once('uberX.php');
require_once('uberVan.php');
require_once('Account.php');

$uberX = new UberX("ABC123", new Account("Brandon", "Brand"), 4, "Chevrolet", "Spark");
$uberX->printDataCar();
$uberX->setPassengers(5);

$uberVan = new UberVan("DEF456", new Account("Andrea", "Andy"), 6, "Dodge", "Attitude");
$uberVan->printDataCar();
$uberVan->setPassengers(7);
    
?>