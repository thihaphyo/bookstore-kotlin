package data.repositories

import data.datasource.local.LocalDataSource
import data.models.BookModel

class MockBookRepositoryImpl(private val bookDataSource: LocalDataSource) : BookRepository {
    override fun addBook(bookName: String, authorName: String, publishedYear: Int) {

    }

    override fun fetchBooks(): List<BookModel> {
        return listOf()
    }
}