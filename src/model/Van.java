package model;

public class Van extends Vehicle{
    public String vehicleType;
    public String slot;
    public String name;
    public Van(Object newValue) {}
    public void Park(){
        vehicleType="Van";
    }

    public Van() {
    }

    public Van(String slot, String name) {
        this.slot = slot;
        this.name = name;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
