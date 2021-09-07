package com.example.bookinventory

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.VBox
import javafx.stage.Stage

class BookInventoryApplication : Application() {

    override fun start(stage: Stage) {
        val bookInventory = BookInventoryController()
        stage.title = "Book Inventory"
        val columns =  listOf<String>("")
        val scene = Scene(createTable(
            columns
        ), 600.0, 500.0)
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(BookInventoryApplication::class.java)
}