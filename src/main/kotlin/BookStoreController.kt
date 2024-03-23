import models.BookModel

/**
 * You can add book and display book by using this class
 */
class BookStoreController {
    private val bookList = mutableListOf<BookModel>()

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
        bookList.add(
            BookModel(
                id = generateBookId(),
                bookName = bookName,
                authorName = authorName,
                publishedYear = publishedYear
            )
        )
    }

    /**
     * Purpose - display book list
     */
    fun displayBooks(){
       if(bookList.isEmpty()) {
           println("No book in our store")
       } else {
           bookList.forEach{ println(it) }
       }
    }

    /**
     * Purpose - auto generate ID of the book depending on book list
     * @return - unique ID of the book
     */
    private fun generateBookId() = bookList.lastOrNull()?.let {
        it.id + 1
    } ?: 1
}