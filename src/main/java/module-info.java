module com.example.sancaklitarti {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sancaklitarti to javafx.fxml;
    exports com.example.sancaklitarti;
}