<?php

require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('Account.php');

$uberX = new UberX("ABC123", new Account("Brandon", "Brand"), 4, "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("DEF456", new Account("Andrea", "Andy"), 3, "Dodge", "Attitude");
$uberPool->printDataCar();


?>