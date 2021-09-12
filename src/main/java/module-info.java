module com.itproger.itproger_hw_8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.itproger.itproger_hw_8 to javafx.fxml;
    exports com.itproger.itproger_hw_8;
}