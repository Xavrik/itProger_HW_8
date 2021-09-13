package com.itproger.itproger_hw_8;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField numb_in;

    @FXML
    private ChoiceBox<String> choice_box;
    ObservableList<String> weigth = FXCollections.observableArrayList("Тонны","Килограммы", "Граммы");

    @FXML
    private Label lb_ton;

    @FXML
    private Label lb_kilo;

    @FXML
    private Label lb_gram;
    String num = "";
    float ton = 0;
    float kilo = 0;
    float gram =0;

    @FXML
    public void SetOnKeyReleased() {
        if(numb_in.getCharacters().length() > 0) {
            num = numb_in.getText();
            System.out.println(num);
            getWeigth();


        }

    }

    @FXML
    void initialize() {
        assert numb_in != null : "fx:id=\"numb_in\" was not injected: check your FXML file 'sample.fxml'.";
        assert choice_box != null : "fx:id=\"choice_box\" was not injected: check your FXML file 'sample.fxml'.";
        assert lb_ton != null : "fx:id=\"lb_ton\" was not injected: check your FXML file 'sample.fxml'.";
        assert lb_kilo != null : "fx:id=\"lb_kilo\" was not injected: check your FXML file 'sample.fxml'.";
        assert lb_gram != null : "fx:id=\"lb_gram\" was not injected: check your FXML file 'sample.fxml'.";
    }

    //Список и его умножение
     void getWeigth () {

        choice_box.setItems(weigth);
            choice_box.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

                if (newValue.equals("Тонны")) {
                    ton = Float.parseFloat(num);
                    kilo = Float.parseFloat(num) * 1000;
                    gram = Float.parseFloat(num) * 1000000;
                    lb_ton.setText(String.valueOf(ton));
                    lb_kilo.setText(String.valueOf(kilo));
                    lb_gram.setText(String.valueOf(gram));
                } else if (newValue.equals("Килограммы")) {
                    ton = Float.parseFloat(numb_in.getText()) / 0.001f;
                    kilo = Float.parseFloat(numb_in.getText());
                    gram = Float.parseFloat(numb_in.getText()) * 1000;
                    lb_ton.setText(String.valueOf(ton));
                    lb_kilo.setText(String.valueOf(kilo));
                    lb_gram.setText(String.valueOf(gram));
                } else if (newValue.equals("Граммы")) {
                    ton = Float.parseFloat(numb_in.getText()) / 1000000;
                    kilo = Float.parseFloat(numb_in.getText()) * 0.001f;
                    gram = Float.parseFloat(numb_in.getText());
                    lb_ton.setText(String.valueOf(ton));
                    lb_kilo.setText(String.valueOf(kilo));
                    lb_gram.setText(String.valueOf(gram));
                }



//            switch (newValue) {
//                case "Тонны":
//                    ton = Float.parseFloat(num);
//                    kilo = Float.parseFloat(num) * 1000;
//                    gram = Float.parseFloat(num) * 1000000;
//                    lb_ton.setText(String.valueOf(ton));
//                    lb_kilo.setText(String.valueOf(kilo));
//                    lb_gram.setText(String.valueOf(gram));
//                    break;
//                case "Килограммы":
//                    ton = Float.parseFloat(numb_in.getText()) / 0.001f;
//                    kilo = Float.parseFloat(numb_in.getText());
//                    gram = Float.parseFloat(numb_in.getText()) * 1000;
//                    lb_ton.setText(String.valueOf(ton));
//                    lb_kilo.setText(String.valueOf(kilo));
//                    lb_gram.setText(String.valueOf(gram));
//                    break;
//
//                case "Граммы":
//                    ton = Float.parseFloat(numb_in.getText()) / 1000000;
//                    kilo = Float.parseFloat(numb_in.getText()) * 0.001f;
//                    gram = Float.parseFloat(numb_in.getText());
//                    lb_ton.setText(String.valueOf(ton));
//                    lb_kilo.setText(String.valueOf(kilo));
//                    lb_gram.setText(String.valueOf(gram));
//                    break;
//
//
//            }

            });



     }





}
