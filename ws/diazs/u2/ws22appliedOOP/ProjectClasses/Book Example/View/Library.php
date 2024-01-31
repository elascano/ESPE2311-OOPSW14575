<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Registration and Sale</title>
</head>
<body>

<?php

use Model\Book;
use Model\Seller;
require_once __DIR__ . '/../Model/Book.php';
require_once __DIR__ . '/../Model/Seller.php';


$file_path = "BookList.json";

$sellers = [
    new Seller(0, 'Sebastian'),
    new Seller(1, 'Alex'),
    new Seller(2, 'Stefany')
];

// Verificamos si se han enviado datos mediante el formulario
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (isset($_POST["operation"])) {
        $operation = $_POST["operation"];

        if ($operation === "register") {
            // Procesar el registro de libros
            $title = $_POST["title"];
            $author = $_POST["author"];
            $publisher = $_POST["publisher"];
            $publish_year = $_POST["publish_year"];
            $cost = $_POST["cost"];

            if (file_exists($file_path)) {
                $json_content = file_get_contents($file_path);
                $decoded_data = json_decode($json_content);

                $total = [];
                foreach ($decoded_data as $item) {
                    $book = new Book($item->book_id, $item->title, $item->author, $item->publisher, $item->publish_year, $item->cost);
                    $book->sold = $item->sold;
                    $book->seller = isset($item->seller) ? $item->seller : null; // Asegurarse de agregar el vendedor al libro
                    $total[] = $book;
                }
            } else {
                $total = [];
            }

            $book_id = uniqid();
            $new_book = new Book($book_id, $title, $author, $publisher, $publish_year, $cost);
            $total[] = $new_book;

            $jtotal = json_encode($total, JSON_PRETTY_PRINT);
            $fp = fopen($file_path, "w+");
            if ($fp == false) {
                die("The file has not been created.");
            }
            fwrite($fp, $jtotal);
            fclose($fp);
        } elseif ($operation === "sell") {
            // Procesar la venta de libros
            $seller_id = $_POST["seller_id"];
            $book_id = $_POST["book_id"];

            if (file_exists($file_path)) {
                $json_content = file_get_contents($file_path);
                $decoded_data = json_decode($json_content);

                $total = [];
                foreach ($decoded_data as $item) {
                    $book = new Book($item->book_id, $item->title, $item->author, $item->publisher, $item->publish_year, $item->cost);
                    $book->sold = $item->sold;
                    $book->seller = isset($item->seller) ? $item->seller : null; // Asegurarse de agregar el vendedor al libro
                    $total[] = $book;
                }
            } else {
                $total = [];
            }

            if (isset($sellers[$seller_id])) {
                $seller = $sellers[$seller_id];
            } else {
                $seller = new Seller($seller_id, $seller_id); // Update with actual seller name
                $sellers[$seller_id] = $seller;
            }

            // Output the registered books
            echo "<h2>Registered Books</h2>";
            foreach ($total as $book) {
                echo "Book ID: {$book->book_id}, Title: {$book->title}, Author: {$book->author}, Publisher: {$book->publisher}, Cost: {$book->cost}, Seller: " . (isset($book->seller) ? $book->seller->nameSeller : 'N/A') . "<br>";
            }

            // Vendemos el libro correspondiente
            foreach ($total as $book) {
                if ((string) $book->book_id === $book_id && !$book->sold) {
                    $book->sellBook($seller);
                    $seller->sellBook($book->cost);
                    break;
                }
            }

            $sellers[$seller_id] = $seller;

            // Output the books after sale
            echo "<h2>Books After Sale</h2>";
            foreach ($total as $book) {
                echo "Book ID: {$book->book_id}, Title: {$book->title}, Author: {$book->author}, Publisher: {$book->publisher}, Cost: {$book->cost}, Seller: " . (isset($book->seller) ? $book->seller->nameSeller : 'N/A') . "<br>";
            }

            echo "<h2>Total to Pay for Seller {$seller->nameSeller}</h2>";
            echo "Total: {$seller->getTotalToPay()}";

            $jtotal = json_encode($total, JSON_PRETTY_PRINT);
            $fp = fopen($file_path, "w+");
            if ($fp == false) {
                die("The file could not be created.");
            }
            fwrite($fp, $jtotal);
            fclose($fp);
        }
    }
}
?>

<!-- Formulario de registro y venta de libros -->
<h2>Book Record</h2>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
    <!-- Agregamos un campo oculto para identificar el formulario -->
    <input type="hidden" name="operation" value="register">
    
    <label for="title">Title:</label>
    <input type="text" name="title" required><br>

    <label for="author">Author:</label>
    <input type="text" name="author" required><br>

    <label for="publisher">Editorial:</label>
    <input type="text" name="publisher" required><br>

    <label for="publish_year">Year of publication:</label>
    <input type="number" name="publish_year" required><br>

    <label for="cost">Cost:</label>
    <input type="number" name="cost" required><br>

    <input type="submit" value="Register the Book">
</form>

<h2>Book Sale</h2>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
    <!-- Agregamos un campo oculto para identificar el formulario -->
    <input type="hidden" name="operation" value="sell">

    <label for="seller_id">Select a seller:</label>
    <select name="seller_id">
        <?php
        // Mostramos los vendedores disponibles
        foreach ($sellers as $seller) {
            echo "<option value='{$seller->idSeller}'>{$seller->nameSeller}</option>";
        }
        ?>
    </select><br>

    <label for="book_id">Select a book for sale:</label>
    <select name="book_id">
        <?php
        // Mostramos los libros disponibles para la venta
        foreach ($total as $book) {
            if (!$book->sold) {
                echo "<option value='{$book->book_id}'>{$book->title}</option>";
            }
        }
        ?>
    </select><br>
    <input type="submit" value="Sell Book">
</form>
