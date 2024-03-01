package espe.edu.ec.bookmanagement.model

class Books (private val title: String, private val author: String, private var pages: Int){
    fun getTitle(): String = title
    fun getAuthor(): String = author
    fun getPages(): Int = pages

    fun setPages(newPages: Int) {
        if (newPages > 0) {
            pages = newPages
        } else {
            println("Invalid number of pages. It has not been updated.")
        }
    }

    fun displayInfo() {
        println("Title: $title")
        println("Author: $author")
        println("Pages: $pages")
        println()
    }
}