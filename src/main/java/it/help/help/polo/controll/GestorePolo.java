package it.help.help.polo.controll;

import it.help.help.autenticazione.controll.GestoreAutenticazione;
import it.help.help.entity.Prodotto;
import it.help.help.entity.SchemaDistribuzione;
import it.help.help.polo.boundary.SchermataSchemaDistribuzionePolo;
import it.help.help.autenticazione.boundary.SchermataSospensionePolo;
import it.help.help.utils.DBMS;
import it.help.help.utils.MainUtils;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GestorePolo {
    public void schermataVisualizzaSchemaDiDistribuzionePolo(Stage stage) throws Exception {
        MainUtils.cambiaInterfaccia("Schermata visualizza schema di distribuzione", "/it/help/help/polo/SchermataSchemaDistribuzionePolo.fxml", stage, c -> {
            return new SchermataSchemaDistribuzionePolo();
        });

        SchemaDistribuzione[] schemiDistribuzione = DBMS.queryGetSchemiDistribuzione(1, MainUtils.responsabileLoggato.getIdLavoro());

        Parent root = stage.getScene().getRoot();

        double layoutY = 140;
        double spacing = 40.0; // Spazio verticale tra i componenti
        double layoutX = 20.0; // Spazio laterale

        // Ottieni il nome del mese corrente in italiano
        LocalDate currentDate = LocalDate.now();
        LocalDate nextMonth = currentDate.plusMonths(1);
        String nomeMeseCorrente = nextMonth.format(DateTimeFormatter.ofPattern("MMMM", new Locale("it")));

        // Aggiungi il titolo
        Label titoloLabel = new Label("Schema di distribuzione di " + nomeMeseCorrente);
        titoloLabel.setLayoutX(layoutX);
        titoloLabel.setLayoutY(80);
        titoloLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        ((Pane) root).getChildren().add(titoloLabel);

        if(schemiDistribuzione.length != 0) {
            for (SchemaDistribuzione schemaDistribuzione : schemiDistribuzione) {
                Prodotto prodotto = DBMS.queryGetProdotto(schemaDistribuzione.getCodiceProdotto());

                Label label = new Label(schemaDistribuzione.getQuantità() + " di " + prodotto.getTipo());
                label.setLayoutX(layoutX);
                label.setLayoutY(layoutY);
                layoutY += spacing;

                ((Pane) root).getChildren().add(label);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Pop-Up Errore");
            alert.setHeaderText("Nessuno schema di distribuzione per il mese in corso");
            alert.showAndWait();
            MainUtils.tornaAllaHome(stage);
        }
    }

}
