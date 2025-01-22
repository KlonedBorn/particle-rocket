module com.kynesis {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kynesis to javafx.fxml;
    exports com.kynesis;
    
    opens com.kynesis.app to javafx.fxml;
    exports com.kynesis.app;
}
