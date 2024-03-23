package utils

import data.models.BookModel

class BookIdGenerator {

    /**
     * Purpose - auto generate ID of the book depending on book list
     * @return - unique ID of the book
     */
    fun generateBookId(bookList: List<BookModel>) = bookList.lastOrNull()?.let {
        it.id + 1
    } ?: 1
}