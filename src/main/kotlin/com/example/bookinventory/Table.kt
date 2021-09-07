package com.example.bookinventory

import javafx.geometry.Insets
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.VBox

fun createTable(columns: List<String> = listOf("Id", "Title", "Author", "Publisher", "Date", "Volumes", "Pages")): VBox{
    val table = TableView<Book>()
    // ensure that the extra space in table column header will be distributed among columns
    table.columnResizePolicy = TableView.CONSTRAINED_RESIZE_POLICY
    table.isEditable = true
    for (column in columns.iterator()) {
        table.columns.add(TableColumn<Book, String>(column))
    }
    // set up view box
    val viewBox = VBox()
    viewBox.spacing = 5.0
    viewBox.padding = Insets(20.0, 10.0, 0.0, 10.0)
    viewBox.children.addAll(table)
    return viewBox
}