package com.itproger.itproger_hw_8;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable {

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


    @FXML
    void SetOnKeyReleased(KeyEvent event) {
        


    }

    String num = "";
    float ton = 0;
    float kilo = 0;
    float gram =0;
    @FXML
    void initialize() {
        assert numb_in != null : "fx:id=\"numb_in\" was not injected: check your FXML file 'sample.fxml'.";
        assert choice_box != null : "fx:id=\"choice_box\" was not injected: check your FXML file 'sample.fxml'.";
        assert lb_ton != null : "fx:id=\"lb_ton\" was not injected: check your FXML file 'sample.fxml'.";
        assert lb_kilo != null : "fx:id=\"lb_kilo\" was not injected: check your FXML file 'sample.fxml'.";
        assert lb_gram != null : "fx:id=\"lb_gram\" was not injected: check your FXML file 'sample.fxml'.";

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        getWeigth(getnumb(num));




    }
//Берем данные из поля ввода
    String getnumb(String numb){
       numb_in.setOnKeyReleased(value -> num = numb_in.getText() );
        return numb;
    }

//Список и его умножение
    void getWeigth ( String numb){

        choice_box.setItems(weigth);
        choice_box.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                case "Тонны":
                    ton = Float.parseFloat(num);
                    kilo = Float.parseFloat(num) * 1000;
                    gram = Float.parseFloat(num) * 1000000;
                    lb_ton.setText(String.valueOf(ton));
                    lb_kilo.setText(String.valueOf(kilo));
                    lb_gram.setText(String.valueOf(gram));
                    break;
                case "Килограммы":
                    ton = Float.parseFloat(num) / 0.001f;
                    kilo = Float.parseFloat(num);
                    gram = Float.parseFloat(num) * 1000;
                    lb_ton.setText(String.valueOf(ton));
                    lb_kilo.setText(String.valueOf(kilo));
                    lb_gram.setText(String.valueOf(gram));
                    break;
                case "Граммы":
                    ton = Float.parseFloat(num) / 1000000;
                    kilo = Float.parseFloat(num) * 0.001f;
                    gram = Float.parseFloat(num);
                    lb_ton.setText(String.valueOf(ton));
                    lb_kilo.setText(String.valueOf(kilo));
                    lb_gram.setText(String.valueOf(gram));
                    break;

            }


        });

    }


}
