package espe.edu.ec.bookmanagement.view

import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import java.io.FileWriter
import espe.edu.ec.bookmanagement.model.Library
import espe.edu.ec.bookmanagement.model.Books
import espe.edu.ec.bookmanagement.model.BookReader

fun main() {

    val book1 = Books("The Kotlin Programming Language", "JetBrains", 350)
    val book2 = Books("Effective Kotlin", "Joshua Bloch", 220)

    val library = Library()

    library.addBook(book1)
    library.addBook(book2)

    library.displayBooks()

    val reader = BookReader("Alice")

    reader.readBook(book1)

    book1.setPages(500)

    book1.displayInfo()

    val gson = GsonBuilder().setPrettyPrinting().create()
    val jsonBook1: String = gson.toJson(book1)
    val jsonBook2: String = gson.toJson(book2)

    println(jsonBook1)
    println(jsonBook2)

    val booksJsonObject = JsonObject()

    booksJsonObject.add("book1", gson.toJsonTree(book1))
    booksJsonObject.add("book2", gson.toJsonTree(book2))

    val jsonBooks: String = gson.toJson(booksJsonObject)
    val fileWriter = FileWriter("books.json")
    fileWriter.use {it.write(jsonBooks)}
}





