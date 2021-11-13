package model;

public class Bus extends Vehicle {
    public String vehicleType;
    public String slotNumber;
    public String slot;
    public String name;

    public Bus() {
    }

    public Bus(String vehicleType, String slotNumber, String slot, String name) {
        this.vehicleType = vehicleType;
        this.slotNumber = slotNumber;
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

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
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

    public Bus(Object newValue) {


    }

    public void SlotNumber(){
        slotNumber="14";
    }

    public void Park(){
        vehicleType="Bus";
    }

}
