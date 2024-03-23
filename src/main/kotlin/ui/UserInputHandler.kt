package ui

/**
 * This class handles the user inputs
 * Option 1 -> add book
 * Option 2 -> display books
 * Option 3 -> Exit
 */
class UserInputHandler {

    /**
     * Handle the user input
     * @param onAddBook, the callback when user tries to add a book
     * @param onDisplayBooks, the callback when user tries to display book list
     * @param onExit, the callback when user tries to exit the app
     */
    fun handleUserInput(
        onAddBook: (String, String, Int) -> Unit,
        onDisplayBooks: () -> Unit,
        onExit: () -> Unit,
    ) {
        showMenu()
        val userInput = readln().toInt()
        when (userInput) {
            1 -> {
                print("Enter book name: ")
                val bookName = readln()

                print("Enter book author: ")
                val author = readln()

                print("Enter published year: ")
                val publishedYear = readln().toInt()

                onAddBook(bookName, author, publishedYear)
            }

            2 -> onDisplayBooks()

            3 -> onExit()
        }
    }

    /**
     * Show available menu options to user
     */
    private fun showMenu() {
        println(
            """
            Book Store Menu:
            1. Add book
            2. Show all books
            3. Exit
        """.trimIndent()
        )
    }

}