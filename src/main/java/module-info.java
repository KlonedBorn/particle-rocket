module com.kynesis {
    requires javafx.fxml;
    requires javafx.controls;

    requires transitive javafx.graphics;

    opens com.kynesis to javafx.fxml;
    exports com.kynesis;

    opens com.kynesis.app to javafx.fxml;
    exports com.kynesis.app;
}
