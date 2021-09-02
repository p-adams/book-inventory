package com.example.bookinventory

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.geometry.Insets
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.VBox
import javafx.stage.Stage
import java.util.*

data class Book(
    val id: String,
    val title: String,
    val author: String?,
    val date: Date?,
    val volumes: Int?,
    val pages: Int?)

class BookInventoryApplication : Application() {
    private val table = TableView<Book>()
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(BookInventoryController::class.java.getResource("hello-view.fxml"))

        stage.title = "Book Inventory"


        table.isEditable = true
        // columns
        val idCol = TableColumn<Book, String>("1")
        val titleCol = TableColumn<Book, String>("Title")
        table.columns.addAll(idCol, titleCol)

        val viewBox = VBox()
        viewBox.spacing = 5.0
        viewBox.padding = Insets(10.0, 0.0, 0.0, 10.0)
        viewBox.children.addAll(table)

        val scene = Scene(viewBox, 320.0, 240.0)
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(BookInventoryApplication::class.java)
}