package com.example.bookinventory

import javafx.fxml.FXML
import javafx.scene.control.Label

class BookInventoryController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }
}