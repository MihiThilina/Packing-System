package model;

public class Vehicle {
    private String  vehicleNumber;
    private String  vehicleType;
    private String  vehicleSlot;



    public String[] slotNumberVan={"1","2","3","4","12","13"};
    public String[] slotNumberCargolorry={"5","6","7","8","9","10","11"};
    public String[] slotNumberBus={"14"};


    public String[] getSlotNumberVan() {
        return slotNumberVan;
    }

    public String[] getSlotNumberCargolorry() {
        return slotNumberCargolorry;
    }

    public String[] getSlotNumberBus() {
        return slotNumberBus;
    }





    public Vehicle(String text, String txtSlotNumberText) {
        setVehicleType(text);
        setVehicleSlot(txtSlotNumberText);
    }

    public Vehicle (String vehicleNumber, String vehicleType,String vehicleSlot) {
        setVehicleNumber(vehicleNumber);
        setVehicleType(vehicleType);
        setVehicleSlot(vehicleSlot);
    }

    public Vehicle(String newValue) {

    }

    public Vehicle() {
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleSlot(){return vehicleSlot;}

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleSlot(String vehicleSlot){this.vehicleSlot=vehicleSlot;}
    public void Park() {}
    public void park() {}


}



