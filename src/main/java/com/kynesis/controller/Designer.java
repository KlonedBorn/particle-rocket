package com.kynesis.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

public class Designer {

  @FXML private ResourceBundle resources;
  @FXML private URL location;
  @FXML private Pane builder;
  @FXML private Label partCount;
  @FXML private ToggleGroup partSelector;
  @FXML private ScrollPane scroller;

  @FXML
  void onActionLaunchRocket(ActionEvent event) {}

  @FXML
  void onActionRedoAction(ActionEvent event) {}

  @FXML
  void onActionUndoAction(ActionEvent event) {}

  @FXML
  void onActionnConfirmAndClear(ActionEvent event) {}

  @FXML
  void initialize() {
    validateFXMLInjection();
  }

  /** Validates that all FXML injection was successful. */
  private void validateFXMLInjection() {
    assert builder != null
        : "fx:id=\"builder\" was not injected: check your FXML file 'designer.fxml'.";
    assert partCount != null
        : "fx:id=\"partCount\" was not injected: check your FXML file 'designer.fxml'.";
    assert partSelector != null
        : "fx:id=\"partSelector\" was not injected: check your FXML file 'designer.fxml'.";
    assert scroller != null
        : "fx:id=\"scroller\" was not injected: check your FXML file 'designer.fxml'.";
  }
}
