<?php
require_once("Payment.php");
class PayPal extends Payment
{
    public $email;

    public function __construct($id, $email)
    {
        parent::__construct($id);
        $this->email = $email;
    }
}
?>