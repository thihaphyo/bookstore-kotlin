package data.datasource.local

import data.models.BookModel

class MockLocalDataSourceImpl private constructor() : LocalDataSource {

    companion object {
        private var INSTANCE: MockLocalDataSourceImpl? = null

        fun getInstance(): MockLocalDataSourceImpl {
            if (INSTANCE == null) {
                INSTANCE = MockLocalDataSourceImpl()
            }
            return INSTANCE!!
        }
    }

    override fun add(bookName: String, authorName: String, publishedYear: Int) {

    }

    override fun getAllBooks(): List<BookModel> {
        return listOf()
    }
}