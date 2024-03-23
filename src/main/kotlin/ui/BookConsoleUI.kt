package ui

import controllers.BookStoreController
import data.repositories.BookRepository

/**
 * A main ui class of console app
 */
class BookConsoleUI(
    repository: BookRepository
) {

    private val userInputHandler = UserInputHandler()
    private val bookStoreController = BookStoreController(repository)

    /**
     * Start the console ui of the book store app
     */
    fun startSystem() {
        userInputHandler.handleUserInput(
            onAddBook = { title, author, publishedYear ->
                bookStoreController.addBook(
                    bookName = title,
                    authorName = author,
                    publishedYear = publishedYear
                )
                startSystem()
            },
            onDisplayBooks = {
                bookStoreController.displayBooks()
                startSystem()
            }
        ) {
            println("Bye!")
        }
    }

}