package viwe.Tm;

public class ParkingVehicleTm {
    private String vehicleNumber;
    private String vehicleType;
    private String parkingSlot;
    private String parkingTime;

    public ParkingVehicleTm() {

    }

    public ParkingVehicleTm(String tempVehicleNumber, String number, String vehicleNumber) {

    }

    public ParkingVehicleTm(String vehicleNumber, String vehicleType, String parkingSlot, String parkingTime) {
        this.setVehicleNumber(vehicleNumber);
        this.setVehicleType(vehicleType);
        this.setParkingSlot(parkingSlot);
        this.setParkingTime(parkingTime);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getParkingSlot() {
        return parkingSlot;
    }

    public String getParkingTime() {
        return parkingTime;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setParkingSlot(String parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public void setParkingTime(String parkingTime) {
        this.parkingTime = parkingTime;
    }


}
