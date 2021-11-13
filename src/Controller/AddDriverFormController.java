package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import model.NewDriver;
import java.util.ArrayList;


public class AddDriverFormController {
    public JFXButton butDriver;
    public JFXTextField txtDriverName;
    public JFXTextField txtNic;
    public JFXTextField txtLicense;
    public JFXTextField txtAddress;
    public JFXTextField txtContactNo;

    static ArrayList<NewDriver> NewDriverList = new ArrayList();

    public void AddDriver(ActionEvent actionEvent) {
        NewDriver newDriver = new NewDriver(txtDriverName.getText(),txtNic.getText(),txtLicense.getText(),txtAddress.getText(),txtContactNo.getText());
        txtDriverName.clear();
        txtNic.clear();
        txtLicense.clear();
        txtAddress.clear();
        txtContactNo.clear();
        if(  NewDriverList.add(newDriver)) {
            //loadAlDelivery();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }

    }

    public void moveToNic(ActionEvent actionEvent) {
        txtNic.requestFocus();
    }

    public void moveToDrivingLicense(ActionEvent actionEvent) {
        txtLicense.requestFocus();
    }

    public void moveToAddress(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }

    public void moveToContact(ActionEvent actionEvent) {
        txtContactNo.requestFocus();
    }
}
