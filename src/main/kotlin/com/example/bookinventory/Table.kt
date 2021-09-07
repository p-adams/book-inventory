package com.example.bookinventory

import javafx.geometry.Insets
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.VBox

fun createTable(columns: List<String>): VBox{
    val table = TableView<Book>()
    // ensure that the extra space in table column header will be distributed among columns
    table.columnResizePolicy = TableView.CONSTRAINED_RESIZE_POLICY
    table.isEditable = true
    // columns
    val idCol = TableColumn<Book, String>("Id")
    val titleCol = TableColumn<Book, String>("Title")
    val authorCol = TableColumn<Book, String>("Author")
    val publicationDateCol = TableColumn<Book, String>("Date")
    val volumesCol = TableColumn<Book, String>("Volumes")
    val pagesCol = TableColumn<Book, String>("Pages")
    table.columns.addAll(
        idCol,
        titleCol,
        authorCol,
        publicationDateCol,
        volumesCol,
        pagesCol
    )
    // set up view box
    val viewBox = VBox()
    viewBox.spacing = 5.0
    viewBox.padding = Insets(20.0, 10.0, 0.0, 10.0)
    viewBox.children.addAll(table)
    return viewBox
}