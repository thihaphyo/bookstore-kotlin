package data.repositories

import data.models.BookModel

interface BookRepository {

    fun addBook(
        bookName: String,
        authorName: String,
        publishedYear: Int
    )

    fun fetchBooks(): List<BookModel>
}