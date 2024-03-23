package data.datasource.local

import data.models.BookModel
import utils.BookIdGenerator

class LocalDataSourceImpl private constructor() : LocalDataSource {

    private val bookList: MutableList<BookModel> = mutableListOf()
    private val bookIdGenerator: BookIdGenerator = BookIdGenerator()

    companion object {
        private var INSTANCE: LocalDataSourceImpl? = null

        fun getInstance(): LocalDataSourceImpl {
            if (INSTANCE == null) {
                INSTANCE = LocalDataSourceImpl()
            }
            return INSTANCE!!
        }
    }

    /**
     * Purpose - Add new book to the bookstore
     * @param bookName, the name of the book
     * @param authorName, the name of the author
     * @param publishedYear, published year of the book
     */
    override fun add(
        bookName: String,
        authorName: String,
        publishedYear: Int
    ) {
        bookList.add(
            BookModel(
                id = bookIdGenerator.generateBookId(bookList),
                bookName = bookName,
                authorName = authorName,
                publishedYear = publishedYear
            )
        )
    }

    /**
     * Purpose: To get the list of books from datasource
     * @return List<[BookModel]>
     */
    override fun getAllBooks() = bookList.toList()

}