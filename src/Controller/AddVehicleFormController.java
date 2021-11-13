package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import model.NewVehicle;
import java.util.ArrayList;

public class AddVehicleFormController {
    public AnchorPane AddVehicle;
    public JFXComboBox cmbVehicleType;
    public JFXButton butAddVehicle;
    public JFXTextField txtVehicleNumber;
    public JFXTextField txtMaxWeight;
    public JFXTextField passengers;

    static ArrayList<NewVehicle> NewVehicleList = new ArrayList();

    public void initialize(){
        cmbVehicleType.getItems().addAll(
                "Bus",
                "Van",
                "CargoLorry"
        );

    }

    public void moveToWeight(ActionEvent actionEvent) {
        txtMaxWeight.requestFocus();
    }

    public void clickAddVehicle(ActionEvent actionEvent) {
        NewVehicle newvehicle = new NewVehicle(cmbVehicleType.getSelectionModel().getSelectedItem().toString(),txtVehicleNumber.getText(),txtMaxWeight.getText(),passengers.getText());
        txtVehicleNumber.clear();
        txtMaxWeight.clear();
        passengers.clear();
        if(  NewVehicleList.add(newvehicle)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }

    }

    public void moveToVehicleType(ActionEvent actionEvent) {
        txtVehicleNumber.requestFocus();
    }

    public void movetoPassengers(ActionEvent actionEvent) {
        passengers.requestFocus();
    }
}
