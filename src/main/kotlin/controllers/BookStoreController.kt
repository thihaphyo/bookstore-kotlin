package controllers

import data.repositories.BookRepository

/**
 * You can add book and display book by using this class
 */
class BookStoreController(
    private val repository: BookRepository
) {

    /**
     * Purpose - Add new book to the bookstore
     * @param bookName, the name of the book
     * @param authorName, the name of the author
     * @param publishedYear, published year of the book
     */
    fun addBook(
        bookName: String,
        authorName: String,
        publishedYear: Int
    ) {
        repository.addBook(
            bookName = bookName,
            authorName = authorName,
            publishedYear = publishedYear
        )
    }

    /**
     * Purpose - display book list
     */
    fun displayBooks() {
        val bookList = repository.fetchBooks()
        if (bookList.isEmpty()) {
            println("No book in our store")
        } else {
            bookList.forEach { println(it) }
        }
    }
}