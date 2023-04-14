module com.example.bonprojetjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.bonprojetjavafx to javafx.fxml;
    exports com.example.bonprojetjavafx;
    exports classes;
    opens classes to javafx.fxml;
}