<?php
namespace Model;
class Seller {
    public $idSeller;
    public $nameSeller;
    public $totalToPay = 0;

    public function __construct($idSeller, $nameSeller) {
        $this->idSeller = $idSeller;
        $this->nameSeller = $nameSeller;
    }

    public function sellBook($bookCost) {
        $this->totalToPay += $bookCost;
    }

    public function getTotalToPay() {
        return $this->totalToPay;
    }
}
?>