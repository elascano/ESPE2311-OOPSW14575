package espe.edu.ec.bookmanagement.model


class Library {
    private val books = mutableListOf<Books>()

    fun addBook(book: Books) {
        books.add(book)
    }

    fun displayBooks() {
        println("Books in the library:")
        for (book in books) {
            book.displayInfo()
        }
    }
}