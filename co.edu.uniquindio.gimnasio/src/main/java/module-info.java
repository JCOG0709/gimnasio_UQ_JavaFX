module co.edu.uniquindio.gimnasio.gimnasioapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gimnasio.gimnasioapp to javafx.fxml;
    exports co.edu.uniquindio.gimnasio.gimnasioapp;
}