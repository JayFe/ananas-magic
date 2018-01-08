package com.jayfe.ananas.magic.controllers;

import org.apache.log4j.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class ButtonController {

  @FXML private Text notificationText;
  
  @FXML protected void handleClickButtonAction(ActionEvent event) {
	  notificationText.setText("Button pressed");
  }
}
