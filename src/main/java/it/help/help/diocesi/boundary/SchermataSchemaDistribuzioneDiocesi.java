package it.help.help.diocesi.boundary;

import it.help.help.utils.MainUtils;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class SchermataSchemaDistribuzioneDiocesi {

    public Button buttonHome;

    public void clickHome(ActionEvent actionEvent) throws IOException {
        MainUtils.tornaAllaHome((Stage) buttonHome.getScene().getWindow());
    }
}
