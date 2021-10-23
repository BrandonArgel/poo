<?php
class UberVan extends Car {
    public $typeCarAccepted;
    public $material;
    public $passengers;

    public function __construct($license, $driver, $passengers, $typeCarAccepted, $material) {
        parent::__construct($license, $driver, $passengers);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->material = $material;
    }

    public function setPassengers($passengers) {
        if ($passengers == 6) {
            $this->passengers = $passengers;
        }
        else {
            echo "Necesitas asignar 6 pasajeros, $passengers pasajeros no son válidos: ";
        }

    }
}

?>