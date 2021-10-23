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
  public function printDataCar() {
    echo "
        Licencia: $this->license 
        Driver: {$this->driver->name} 
        Número de pasajeros: $this->passengers
        

    ";
}

  public function getPassengers() {
      return $this->passengers;
  }

  public function setPassengers($passengers) { 
      if ($passengers == 4) {
          $this->passengers = $passengers;
      }
      else {
          echo "Necesitas asignar 4 pasajeros";
      }

  }
}

?>