<?php
class UberBlack extends Car {
    public $typeCarAccepted;
    public $material;

    public function __construct($license, $driver, $passengers, $typeCarAccepted, $material) {
        parent::__construct($license, $driver, $passengers);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->material = $material;
    }
}

?>