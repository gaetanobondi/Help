package it.help.help.autenticazione.controll;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import it.help.help.autenticazione.boundary.HelloApplication;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

import javafx.scene.control.Alert.AlertType;

public class GestoreAutenticazione {

    public Button buttonSignIn;
    public Button buttonLogin;
    public Label labelBenvenuto;
    public PasswordField fieldPassword;
    public TextField fieldEmail;
    public Button buttonRecuperaPassword; //schermata login
    public Button buttonAccedi;
    public Button buttonIndietro;
    public RadioButton radioButtonDiocesi;
    public RadioButton radioButtonAziendaPartner;
    public PasswordField fieldRipetiPassword;
    public Button buttonRegistrati;
    public Button buttonRecupera; //schermata recupero password

    public Button buttonConferma; //schermata Cambio Password

    public PasswordField fieldNuovaPassword;

    //Schermata home responsabile azienda partner
    public Button buttonVisualizzaProfiloAziendaPartner;
    public Button buttonVisualizzaDonazioniEffettuate;

    public Button buttonEffettuaDonazioneAdHoc;
    public Button buttonLogout;
    public Button buttonEffettuaDonazioneSpontanea;


    //Scherma Home Responsabile Diocesi
    public Button buttonVisualizzaSchemaDiDistribuzioneDiocesi;
    public Button buttonVisualizzaListaPoli;
    public Button buttonRegistrazionePolo;
    public Button buttonVisualizzaCarichiInviati;
    public Button buttonVisualizzaProfiloDiocesi;

    //Schermata Home responsabile Help
    public Button buttonVisualizzaProfiloHelp;
    public Button buttonVisualizzaPrevisioneDistribuzione;
    public Button buttonRichiesteDiocesi;
    public Button buttonRichiesteAziendePartner;
    public Button buttonListaDonazioniRicevute;
    public Button buttonGestione;
    public Button buttonVisualizzaReport;
    public Button buttonDonazioneAziendaPartner;


    @FXML
    private AnchorPane contentPane;



    public void clickIndietro(ActionEvent actionEvent) {
        System.out.println("ciao");

    }

    //per la SCHERMATA CAMBIO PASSWORD
    public void clickConferma(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataLogin.fxml"));
        Stage window = (Stage) buttonConferma.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    //per la SCHERMATA HOME RESPONSABILE AZIENDA PARTNER
    public void clickVisualizzaProfiloAziendaPartner(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataProfiloPersonaleAziendaPartner.fxml"));
        Stage window = (Stage) buttonVisualizzaProfiloAziendaPartner.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickVisualizzaDonazioniEffettuate(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataVisualizzaDonazioniEffettuate.fxml"));
        Stage window = (Stage) buttonVisualizzaDonazioniEffettuate.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickEffettuaDonazioneAdHoc(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataEffettuaDonazioneAdHoc.fxml"));
        Stage window = (Stage) buttonEffettuaDonazioneAdHoc.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickLogout(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataLogin.fxml"));
        Stage window = (Stage) buttonLogout.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickEffettuaDonazioneSpontanea(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataEffettuaDonazione.fxml"));
        Stage window = (Stage) buttonEffettuaDonazioneSpontanea.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    //per la SCHERMATA HOME RESPONBILE DIOCESI
    public void clickVisualizzaProfiloDiocesi(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataProfiloPersonaleDiocesi.fxml"));
        Stage window = (Stage) buttonVisualizzaProfiloDiocesi.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickVisualizzaListaPoli(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataVisualizzazioneListaPoli.fxml"));
        Stage window = (Stage) buttonVisualizzaListaPoli.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickRegistrazionePolo(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataRegistrazionePolo.fxml"));
        Stage window = (Stage) buttonRegistrazionePolo.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickVisualizzaCarichiInviati(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataVisualizzazioneCarichi.fxml"));
        Stage window = (Stage) buttonVisualizzaCarichiInviati.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickVisualizzaSchemaDiDistribuzioneDiocesi(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataSchemaDiDistribuzioneDellaDiocesi.fxml"));
        Stage window = (Stage) buttonVisualizzaSchemaDiDistribuzioneDiocesi.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    //per la SCHERMATA HOME RESPONSABILE HELP
    public void clickVisualizzaProfiloHelp(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataProfiloPersonaleHelp.fxml"));
        Stage window = (Stage) buttonVisualizzaProfiloHelp.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void clickVisualizzaPrevisioneDiDistribuzione(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataVisualizzazionePrevisioneDiDistribuzione.fxml"));
        Stage window = (Stage) buttonVisualizzaProfiloHelp.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void clickRichiesteDiocesi(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataVisualizzaRichiesteDiocesi.fxml"));
        Stage window = (Stage) buttonRichiesteDiocesi.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickRichiesteAziendePartner(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataVisualizzaRichiesteAziendePartner.fxml"));
        Stage window = (Stage) buttonRichiesteAziendePartner.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickListaDonazioniRicevute(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataListaDonaizoni.fxml"));
        Stage window = (Stage) buttonListaDonazioniRicevute.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickGestione(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataGestione.fxml"));
        Stage window = (Stage) buttonGestione.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickDonazioneAziendaPartner(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataDonazioneAzienda.fxml"));
        Stage window = (Stage) buttonDonazioneAziendaPartner.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    //per la SCHERMATA INIZIALE
    public void clickSignIn(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataSignin.fxml"));
        Stage window = (Stage) buttonSignIn.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void clickLogin(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataLogin.fxml"));
        Stage window = (Stage) buttonLogin.getScene().getWindow();
        window.setScene(new Scene(root));
    }




    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }




    //per la SCHERMATA LOGIN
    public void clickAccedi(ActionEvent actionEvent) {
        String email = fieldEmail.getText();
        String password = fieldPassword.getText();

        if(esistenzaEmail(email)) {
            System.out.println("Email già esistente");
        } else {
            // controllo la password
            if(validatePassword(password)) {
                System.out.println("PROCEDO");
            } else {
                System.out.println("Password troppo debole");
                // Creazione di un oggetto Alert di tipo Avviso
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Errore");
                alert.setHeaderText("Password troppo debole");
                // alert.setContentText("Messaggio di avviso da visualizzare.");

                // Mostra il popup e attende la chiusura
                alert.showAndWait();
            }
        }
    }

    public void clickRecuperaPassword(ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/it/help/help/schermataRecuperoPassword.fxml"));
        Stage window = (Stage) buttonRecuperaPassword.getScene().getWindow();
        window.setScene(new Scene(root));

    }



    //per la SCHERMATA SIGN-IN

    public boolean isValidEmail(String email) {
        // Definisci la regex per il formato dell'email
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Verifica se la stringa email corrisponde alla regex
        return email.matches(emailRegex);
    }

    public static boolean validatePassword(String password) {
        // Controlla se la password ha almeno 8 caratteri
        if (password.length() < 8) {
            return false;
        }

        // Controlla se la password contiene almeno una lettera maiuscola
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Controlla se la password contiene almeno un numero
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Controlla se la password contiene almeno un carattere speciale
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }

        // La password soddisfa tutti i requisiti
        return true;
    }

    private boolean esistenzaEmail(String email) {
        if(email.equals("mia@email.com")) {
            return true;
        }
        return false;
    }

    public void clickRegistrati(ActionEvent actionEvent) {
        Boolean radioDiocesi = radioButtonDiocesi.isSelected();
        Boolean radioAzienda = radioButtonAziendaPartner.isSelected();
        String email = fieldEmail.getText();
        String password = fieldPassword.getText();
        String repeatPassword = fieldRipetiPassword.getText();
        Boolean showErrorAlert = false;
        String error = "";

        if((radioAzienda || radioDiocesi) && !email.isEmpty() && !password.isEmpty() && !repeatPassword.isEmpty()) {
            if(password.equals(repeatPassword)) {
                if(isValidEmail(email) && validatePassword(password)) {
                    // verifico che l'email non sia già presente nel DBMS
                    if(false) {
                        // registro l'utente nel DBMS

                    } else {
                        showErrorAlert = true;
                        error = "Email già esistente";
                    }
                } else {
                    showErrorAlert = true;
                    error = "I dati inseriti non sono corretti";
                }
            } else {
                showErrorAlert = true;
                error = "Le password inserite non coincidono";
            }
        } else {
            showErrorAlert = true;
            error = "Compila tutti i campi";
        }

        if(showErrorAlert) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Pop-Up Errore");
            alert.setHeaderText(error);
            alert.showAndWait();
        }
    }



    //per la SCHERMATA RECUPERO PASSWORD
    public void clickRecupera(ActionEvent actionEvent) {
        String email = fieldEmail.getText();
        Boolean showErrorAlert = false;
        String error = "";
        Random random = new Random();

        if (isValidEmail(email) && !email.isEmpty()) { // se l'email risulta nel database

            int n1 = random.nextInt(10);
            int n2 = random.nextInt(10);
            int n3 = random.nextInt(10);
            int n4 = random.nextInt(10);

            String codice = n1 + "" + n2 + "" + n3 + "" + n4;
            System.out.println(codice);

            if(true){   //se il codice inserito coincide

            }
            else {  // Pop-Up errore codice
                showErrorAlert = true;
                error = "Codice errato";
            }
        }
        else {
                // Pop-Up errore email
                showErrorAlert = true;
                error = "Email non esistente";


            }

        if(showErrorAlert) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Pop-Up Errore");
            alert.setHeaderText(error);
            alert.showAndWait();
        }

    }

   /* @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        String url = "jdbc:mysql://localhost:3306/help";
        String username = "root";
        String password = "";
        try {
            System.out.println("Provo a connettermi al db");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from responsabile where id=2");
            System.out.println(resultSet);
            if(resultSet.next()) {
                System.out.println("Ottengo i dati dal db:");
                while(resultSet.next()) {
                    System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2) + " " + resultSet.getString(3));
                }
            } else {
                System.out.println("Nessun dato presente.");
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/


}
