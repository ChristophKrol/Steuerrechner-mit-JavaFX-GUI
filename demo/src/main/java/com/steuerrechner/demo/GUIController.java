package com.steuerrechner.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static com.steuerrechner.demo.SteuerRechnerByChristoph.steuertarif1;

public class GUIController {
    @FXML
    private Label entryLabel;
    @FXML
    private TextField incomeInput;
    @FXML
    private Button berechnungStarten;

    float einkommen;

    public void checkSteuertarif(ActionEvent event) {
        einkommen = Float.parseFloat(incomeInput.getText());
        int netto = (int) steuertarif1(einkommen);

        System.out.println(netto);
    }




}