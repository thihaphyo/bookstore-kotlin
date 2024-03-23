package data.datasource.local

import data.models.BookModel

interface LocalDataSource {
    fun add(
        bookName: String,
        authorName: String,
        publishedYear: Int
    )

    fun getAllBooks(): List<BookModel>
}