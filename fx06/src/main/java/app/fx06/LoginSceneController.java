package app.fx06;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginSceneController {

    @FXML
    TextField nameTextField;


    private Stage stage;
    private Scene scene;
    private Parent root;


    public void login(ActionEvent event) throws IOException {

        String userName = nameTextField.getText();

        System.out.println(userName);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AfterLogin.fxml"));
        root = loader.load();


        AfterLoginController afterLoginController = loader.getController();
        afterLoginController.displayName(userName);


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


}
