package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ManagementLoginFormController {
    public JFXTextField txtName;
    public JFXButton butLogin;
    public JFXButton butCancel;
    public JFXPasswordField passwordField;
    public AnchorPane LoginForm;
    AnchorPane closePane;

    public void OpenParkingSystemTable(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viwe/InParkingTableForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)LoginForm.getScene().getWindow();
        window.setScene(new Scene(load));
        toClose();
    }

    public void CancelWindow(ActionEvent actionEvent) {
    }
    public void setPane(AnchorPane pane){
        closePane=pane;
    }
    public  void toClose(){
        Stage stage = (Stage) closePane.getScene().getWindow();
        stage.close();
    }

}
