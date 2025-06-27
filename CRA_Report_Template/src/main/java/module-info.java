module com.cra_template.cra_report_template {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cra_template.cra_report_template to javafx.fxml;
    exports com.cra_template.cra_report_template;
}