module Murphy.forms {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;

    opens Murphy.forms to javafx.fxml;
    exports Murphy.forms;
}
