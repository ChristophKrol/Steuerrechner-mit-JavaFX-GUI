package com.steuerrechner.demo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class SteuerRechnerByChristoph extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("rechner-gui.fxml"));
        stage.setTitle("Steuerrechner By Christoph");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }

//  Steuertarife --> input = Gesamteinkommen

    public static long steuertarif1(float einkommen){
        int income = Math.round(einkommen);
        int y = (1/10000) * income - 9408;
        int netto = (int) ((995.5 * y + 1400) * y);
        return netto;
    }
    public long steuertarif2(float einkommen){
        long income = Math.round(einkommen);
        long z = (1/1000) * income - 14532;
        long netto = (long) ((208.85 * z + 2397) * z + 950.96);
        return netto;
    }
    public long steuertarif3(float einkommen){
        long income = Math.round(einkommen);
        long x = income;
        long netto = (long) ((0.42 * x - 9136.63));
        return netto;
    }
    public long steuertarif4(float einkommen){
        long income = Math.round(einkommen);
        long x = income;
        long netto = (long) ((0.45 * x - 17374.99));
        return netto;
    }
    public long kirchensteuer(float netto, boolean babw){                       //babw = Lebt man in Bayern oder Baden - Würrtemberg (true/false)
        short percent = 9/100;
        if(babw == true)
            percent = 8/100;
        float nettochurch = netto + (netto * (percent / 100));
        long nettoKirche = Math.round(nettochurch);
        return nettoKirche;
    }

    //         Sozialabgaben

    public double nettoArbeitslohn(double arbeitslohn){
        double netto = arbeitslohn - (arbeitslohn * (93/1000)) - (arbeitslohn * (12/1000)) - (arbeitslohn * (1525/100000)) - (arbeitslohn * (73/1000));
        return netto;
    }


}
