package model;

public class CargoLorry extends Vehicle {
    public String vehicleType;
    public String slot;
    public String name;

    public CargoLorry() {
    }

    public CargoLorry(String vehicleType, String slot, String name) {
        this.vehicleType = vehicleType;
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

    public CargoLorry(Object newValue) {}

    public void park() {
        vehicleType="CargoLorry";
      }
}
