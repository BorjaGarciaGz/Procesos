module org.example.practica2_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.practica2_1 to javafx.fxml;
    exports org.example.practica2_1;
}