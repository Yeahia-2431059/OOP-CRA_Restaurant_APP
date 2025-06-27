package com.app.oop_restaurant_app.Common_scenes_controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Login_scene_controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}