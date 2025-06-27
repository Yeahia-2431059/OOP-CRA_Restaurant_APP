module com.app.oop_restaurant_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.oop_restaurant_app to javafx.fxml;
    exports com.app.oop_restaurant_app;
    exports com.app.oop_restaurant_app.Common_scenes_controller;
    opens com.app.oop_restaurant_app.Common_scenes_controller to javafx.fxml;
}