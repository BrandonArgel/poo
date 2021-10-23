<?php

class Car {
  public $id;
  public $license;
  public $driver;
  public $passengers;

  public function __construct($license, $driver, $passengers) {
    $this->license = $license;
    $this->driver = $driver;
    $this->passengers = $passengers;
  }

  // public function PrintDataCar(){
  //   echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}, pasajeros: $this->passengers";
  // }
  public function PrintDataCar(){
    echo "License: " . $this->license . "<br>";
    echo "Driver: " . $this->driver->name . "<br>";
    echo "Document: " . $this->driver->document . "<br>";
    echo "Passengers: " . $this->passengers . "<br>";
  }
}

?>