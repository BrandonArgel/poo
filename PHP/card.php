<?php
require_once("Payment.php");
class Card extends Payment {
    public $number;
    public $cvv;
    public $date;

    public function __construct($id, $number, $cvv, $date)
    {
        parent::__construct($id);
        $this->number = $number;
        $this->cvv = $cvv;
        $this->date = $date;
    }
}
?>