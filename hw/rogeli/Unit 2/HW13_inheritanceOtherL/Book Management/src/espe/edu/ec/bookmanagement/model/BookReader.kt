package espe.edu.ec.bookmanagement.model

class BookReader(private val name: String) {
    fun readBook(book: Books) {
        println("$name is reading: ${book.getTitle()}")
    }
}