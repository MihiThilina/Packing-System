package model;

public class NewVehicle {
     private String VehicleType;
     private String txtVehicleNumber;
     private String txtMaxWeight;
     private String passengers;

    public NewVehicle() {
    }

    public NewVehicle(String vehicleType, String txtVehicleNumber, String txtMaxWeight, String passengers) {
        setVehicleType(vehicleType);
        this.setTxtVehicleNumber(txtVehicleNumber);
        this.setTxtMaxWeight(txtMaxWeight);
        this.setPassengers(passengers);
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getTxtVehicleNumber() {
        return txtVehicleNumber;
    }

    public void setTxtVehicleNumber(String txtVehicleNumber) {
        this.txtVehicleNumber = txtVehicleNumber;
    }

    public String getTxtMaxWeight() {
        return txtMaxWeight;
    }

    public void setTxtMaxWeight(String txtMaxWeight) {
        this.txtMaxWeight = txtMaxWeight;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
}
