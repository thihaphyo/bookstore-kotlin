import data.datasource.local.LocalDataSourceImpl
import data.repositories.BookRepositoryImpl
import ui.BookConsoleUI

fun main() {
    val bookConsoleUI = BookConsoleUI(
        repository = BookRepositoryImpl(
            bookDataSource = LocalDataSourceImpl.getInstance()
        )
    )
    bookConsoleUI.startSystem()
}