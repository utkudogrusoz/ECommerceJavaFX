module com.example.ecommerce {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;



    opens com.example.ecommerce to javafx.fxml;
    exports com.example.ecommerce;
    exports com.example.ecommerce.Controller;
    exports com.example.ecommerce.Model;
    //exports com.example.ecommerce.View;
}