package com.example.bookinventory



class BookInventoryController() {
    private val books = mutableListOf<Book>()
    fun addBook(book: Book) {
        books.add(book)
    }
    // todo convert book list to JSON to enable data import
    fun bookListToJson() {}


    fun loadBookInventoryCsv() {}
}