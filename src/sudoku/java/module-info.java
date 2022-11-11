module com.example.sudoku {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.sudoku to javafx.fxml;
    exports com.example.sudoku;
}