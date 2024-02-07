<?php
namespace Model;
class Book {
    public $book_id;
    public $title;
    public $author;
    public $publisher;
    public $publish_year;
    public $cost;
    public $sold = false;
    public $seller;

    public function __construct($book_id, $title, $author, $publisher, $publish_year, $cost) {
        $this->book_id = $book_id;
        $this->title = $title;
        $this->author = $author;
        $this->publisher = $publisher;
        $this->publish_year = $publish_year;
        $this->cost = $cost;
    }

    public function sellBook($seller) {
        $this->sold = true;
        $this->seller = $seller;
    }
}
?>