package ui

import controllers.BookStoreController

/**
 * A main ui class of console app
 */
class BookConsoleUI {

    private val userInputHandler = UserInputHandler()
    private val bookStoreController = BookStoreController()

    /**
     * Start the console ui of the book store app
     */
    fun startSystem() {
        userInputHandler.handleUserInput(
            onAddBook = {title, author, publishedYear ->
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