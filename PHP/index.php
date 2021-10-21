<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("ABC123", new Account("Brandon", "Brand"), 4);
$car->printDataCar();