package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.*;
import viwe.Tm.OnDeliveryTm;
import viwe.Tm.ParkingVehicleTm;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class ParkingFormController {
    public AnchorPane ParkingSystemForm;
    public JFXComboBox cmbSelectVehicle;
    public JFXComboBox cmbDriver;
    public JFXTextField txtVehicleType;
    public JFXTextField txtSlotNumber;
    public JFXButton butManagementLogin;
    public JFXButton butOndilivaryShift;
    public JFXButton butParkVehicle;
    public JFXTextField txtTime;

    Vehicle vehicle=new Vehicle();
    static ArrayList<Vehicle> ParkingVehicleList = new ArrayList();
    static ArrayList<Delivery> OnDeliveryList = new ArrayList();
    public void initialize(){
        cmbSelectVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue=="NA-3434"){
                Bus bus=new Bus(newValue);
                for (int i=0;i<vehicle.slotNumberBus.length;i++){
                    if(vehicle.slotNumberBus[i]!=""){
                        txtSlotNumber.setText(vehicle.slotNumberBus[i]);
                        vehicle.slotNumberBus[i]="";
                    }
                }
                bus.Park();
                txtVehicleType.setText(bus.vehicleType);
            }else if(newValue.equals("KA-4563")||newValue.equals("58-3567")||newValue.equals("GF-4358")||newValue.equals("CCB-3568")||newValue.equals("LM-6679")||newValue.equals("QA-3369")){
                Van van=new Van(newValue);
                for (int i=0;i<vehicle.slotNumberVan.length;i++){
                    if(vehicle.slotNumberVan[i]!=""){
                        txtSlotNumber.setText(vehicle.slotNumberVan[i]);
                        vehicle.slotNumberVan[i]="";
                        break;
                    }
                }
                van.Park();
                txtVehicleType.setText(van.vehicleType);
            }else if(newValue.equals("KB-3668")||newValue.equals("JJ-9878")||newValue.equals("GH-5772")||newValue.equals("XY-4456")||newValue.equals("YQ-3536")||newValue.equals("CBB-3566")||newValue.equals("QH-3444")){
                CargoLorry lorry=new CargoLorry(newValue);
                for (int i=0;i<vehicle.slotNumberCargolorry.length;i++){
                    if(vehicle.slotNumberCargolorry[i]!=""){
                        txtSlotNumber.setText(vehicle.slotNumberCargolorry[i]);
                        vehicle.slotNumberCargolorry[i]="";
                        break;
                    }
                }
                lorry.park();
                txtVehicleType.setText(lorry.vehicleType);
            }
        });

        Vehicle();
        Drivers();
        initClock();
    }
    private void initClock() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("  dd/MM/yyyy   HH:mm");
            txtTime.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }
    public void Vehicle(){
        cmbSelectVehicle.getItems().addAll(
                "NA-3434",
                "KA-4563",
                "58-3567",
                "GF-4358",
                "CCB-3568",
                "LM-6679",
                "QA-3369",
                "KB-3668",
                "JJ-9878",
                "GH-5772",
                "XY-4456",
                "YQ-3536",
                "CBB-3566",
                "QH-3444"
        );

    }
    public  void Drivers(){
        cmbDriver.getItems().addAll(
                "Sumith Kumara",
                "Amila Pathirana",
                "Jithmal Perera",
                "Sumith Dissanayaka",
                "Sumanasiri Herath",
                "Awantha Fernando",
                "Charith Sudara ",
                "Prashan Dineth",
                "Chethiya Dilan",
                "Dushantha Perera",
                "Sumith Udayanga",
                "Dinesh Udara",
                "Udana Chathuranga",
                "Mohommad Riaz",
                "Sandun Kumara",
                "Priyanga Perera"
        );
    }
    public void VehicleType(ActionEvent actionEvent) {}
    public void ParkingSlotNumber(ActionEvent actionEvent) {}
    public void ManagementLogin(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../viwe/ManagementLoginForm.fxml"));
        Parent load = fxmlLoader.load();
        ManagementLoginFormController managementLoginFormController = fxmlLoader.getController();
        managementLoginFormController.setPane(ParkingSystemForm);
        Scene scene = new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }
    public void OnDiliveryShift(ActionEvent actionEvent) {
        Delivery delivery=new Delivery(cmbSelectVehicle.getSelectionModel().getSelectedItem().toString(),txtVehicleType.getText(),cmbDriver.getSelectionModel().getSelectedItem().toString(),txtTime.getText());
        txtVehicleType.clear();
        if( OnDeliveryList.add(delivery)) {
            loadAlDelivery();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
    }
    public void loadAlDelivery() {
        ObservableList<OnDeliveryTm> tmObservableList = FXCollections.observableArrayList();
        for (Delivery temp : OnDeliveryList) {
            tmObservableList.add(new OnDeliveryTm(temp.getVNum(),temp.getType(),temp.getName(),temp.getLeftTime())
            );
        }
    }
    public void loadAlVehicle() {
        ObservableList<ParkingVehicleTm> tmObservableList = FXCollections.observableArrayList();
        for (Vehicle temp : ParkingVehicleList) {
            tmObservableList.add(new ParkingVehicleTm(temp.getVehicleNumber(),temp.getVehicleType(),temp.getVehicleSlot())
            );
        }
    }
    public void ParkingVehcles(ActionEvent actionEvent) {
        Vehicle vehicle = new Vehicle(cmbSelectVehicle.getSelectionModel().getSelectedItem().toString(),txtVehicleType.getText(),txtSlotNumber.getText());
        txtVehicleType.clear();
        txtSlotNumber.clear();
        if (ParkingVehicleList.add(vehicle)) {
            loadAlVehicle();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
    }
}











