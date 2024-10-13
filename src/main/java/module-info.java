module com.example.animation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animation to javafx.fxml;
    exports com.example.animation;
    exports es.ieslosmontecillos.di_t1a1_shanshangfeng;
    opens es.ieslosmontecillos.di_t1a1_shanshangfeng to javafx.fxml;
}