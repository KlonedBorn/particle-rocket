module com.kynesis {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kynesis to javafx.fxml;
    exports com.kynesis;
}
