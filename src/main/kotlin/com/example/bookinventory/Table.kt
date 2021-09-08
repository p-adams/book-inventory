package com.example.bookinventory

import javafx.geometry.Insets
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.VBox

data class Column(
    val label: String,
    val value: String,
    val nestedColumns: List<Column> = listOf(Column("", ""))
)

fun createTable(columns: List<Column> = listOf(
    Column("id", "Id"),
    Column("title", value = "Title"),
    Column("author", "Author"),
    Column("publisher","Publisher", nestedColumns = listOf(Column("name", "Name"), Column("date", "Date"))),
    Column("date", "Date"),
    Column("volumes", "Volumes"),
    Column("pages", "Pages")
)
): VBox{
    val table = TableView<Book>()
    // ensure that the extra space in table column header will be distributed among columns
    table.columnResizePolicy = TableView.CONSTRAINED_RESIZE_POLICY
    table.isEditable = true
    for (column in columns.iterator()) {
        // TODO: build nested columns for publisher column
        val publisherCol = if(column.label == "publisher") {
            val pubCol = TableColumn<Book, String>(column.value)
        } else {
            null
        }

        table.columns.add(TableColumn<Book, String>(column.label))
    }
    // set up view box
    val viewBox = VBox()
    viewBox.spacing = 5.0
    viewBox.padding = Insets(20.0, 10.0, 0.0, 10.0)
    viewBox.children.addAll(table)
    return viewBox
}