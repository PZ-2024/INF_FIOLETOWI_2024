module com.example.kilohokla {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kilohokla to javafx.fxml;
    exports com.example.kilohokla;
}