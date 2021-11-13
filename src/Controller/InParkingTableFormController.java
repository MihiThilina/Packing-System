package Controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Delivery;
import model.Vehicle;
import viwe.Tm.ParkingVehicleTm;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class InParkingTableFormController {
    public AnchorPane InParkingPanel;
    public JFXComboBox cmbSelect;
    public JFXButton butAddVehicle;
    public JFXButton butAddDriver;
    public JFXButton butLogOut;
    public TableView tblParking;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn tblParkingSlot;
    public TableColumn colParkingTime;

    static ArrayList<Vehicle> ParkingVehicleList = new ArrayList();
    public TableView tblOnDelivery;
    public TableColumn colVnum;
    public TableColumn colType;
    public TableColumn colName;
    public TableColumn colLeftTime;


    static ArrayList<Delivery> OnDeliveryList = new ArrayList();

    public void initialize(){
        cmbSelect.getItems().addAll("In Parking","On Delivery");
        cmbSelect.setValue("In Parking");
        tblParking.setItems(FXCollections.observableArrayList(ParkingFormController.ParkingVehicleList));
        colVehicleNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        tblParkingSlot.setCellValueFactory(new PropertyValueFactory<>("vehicleSlot"));
        colParkingTime.setCellValueFactory(new PropertyValueFactory<>("parkingTime"));

        cmbSelect.setValue("On Delivery");
        tblOnDelivery.setItems(FXCollections.observableArrayList(ParkingFormController.OnDeliveryList));
        colVnum.setCellValueFactory(new PropertyValueFactory<>("VNum"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colLeftTime.setCellValueFactory(new PropertyValueFactory<>("leftTime"));
    }
    public void loadAlVehicle(){
        ObservableList<ParkingVehicleTm> tmObservableList = FXCollections.observableArrayList();
        for (Vehicle temp : ParkingVehicleList) {
            tmObservableList.add(new ParkingVehicleTm(temp.getVehicleNumber(),temp.getVehicleType(),temp.getVehicleSlot())
            );
        }
        tblParking.setItems(tmObservableList);
    }



    public void MoveToOnDilivery(ActionEvent actionEvent){
      if(cmbSelect.getValue().equals("On Delivery")){
          butLogOut.setVisible(false);
          tblParking.setVisible(false);
          tblOnDelivery.setVisible(true);
      }else {
          butLogOut.setVisible(false);
          tblParking.setVisible(true);
          tblOnDelivery.setVisible(false);
      }
    }

    public void AddNewVehicle(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viwe/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void AddNewDriver(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viwe/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void LogOut(ActionEvent actionEvent) {

    }
}
