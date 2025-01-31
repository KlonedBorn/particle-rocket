package com.kynesis.app;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    final Pane root = FXMLLoader.load(getClass().getResource("/com/kynesis/ui/designer.fxml"));
    final Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
