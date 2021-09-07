package com.example.bookinventory

import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage

class BookInventoryApplication : Application() {

    override fun start(stage: Stage) {
        val bookInventory = BookInventoryController()
        stage.title = "Book Inventory"

        val scene = Scene(createTable(), 600.0, 500.0)
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(BookInventoryApplication::class.java)
}