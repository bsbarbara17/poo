module com.edu.br {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.edu.br to javafx.fxml;
    exports com.edu.br;
}
