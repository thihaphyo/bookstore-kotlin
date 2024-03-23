package data.repositories

import data.datasource.local.LocalDataSource
import data.models.BookModel

class BookRepositoryImpl(
    private val bookDataSource: LocalDataSource
) : BookRepository {

    /**
     * Purpose - Data Access Function for adding a new book to [LocalDataSource]
     * @param bookName, the name of the book
     * @param authorName, the name of the author
     * @param publishedYear, published year of the book
     */
    override fun addBook(
        bookName: String,
        authorName: String,
        publishedYear: Int
    ) {
        bookDataSource.add(
            bookName = bookName,
            authorName = authorName,
            publishedYear = publishedYear
        )
    }

    /**
     * Purpose - Fetch all books from [LocalDataSource]
     * @return List<[BookModel]>
     */
    override fun fetchBooks() = bookDataSource.getAllBooks()
}