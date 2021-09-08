package com.example.bookinventory

import javafx.geometry.Insets
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.VBox

data class Column(
    val label: String,
    val value: String
)

data class TableColumnData(
    val column: Column,
    val nestedColumns: List<Column> = listOf(Column("", ""))
)

fun createTable(columns: List<TableColumnData> = listOf(
    TableColumnData(Column("id", "Id")),
    TableColumnData(Column("title", value = "Title")),
    TableColumnData(Column("author", "Author")),
    TableColumnData(Column("publisher","Publisher"),
        nestedColumns = listOf(Column("name", "Name"), Column("date", "Date"))
    ),
    TableColumnData(Column("volumes", "Volumes")),
    TableColumnData(Column("pages", "Pages"))
)
): VBox{
    val table = TableView<Book>()
    // ensure that the extra space in table column header will be distributed among columns
    table.columnResizePolicy = TableView.CONSTRAINED_RESIZE_POLICY
    table.isEditable = true
    for (columnItem in columns.iterator()) {
        val (column, nestedColumns) = columnItem
        if(column.label == "publisher" && nestedColumns.isNotEmpty()) {
            val pubCol = TableColumn<Book, String>(column.value)
            for(nestedColumn in nestedColumns) {
                pubCol.columns.add(TableColumn<Book, String>(nestedColumn.value))
            }
            table.columns.add(pubCol)
        } else {
            table.columns.add(TableColumn<Book, String>(column.value))
        }

    }
    // set up view box
    val viewBox = VBox()
    viewBox.spacing = 5.0
    viewBox.padding = Insets(20.0, 10.0, 0.0, 10.0)
    viewBox.children.addAll(table)
    return viewBox
}