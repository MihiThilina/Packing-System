package viwe.Tm;

public class OnDeliveryTm {
    private String selectVehicle;
    private String vehicleType;
    private String driver;
    private String time;

    public OnDeliveryTm() {
    }

    public OnDeliveryTm(String selectVehicle, String vehicleType, String driver, String time) {
        this.setSelectVehicle(selectVehicle);
        this.setVehicleType(vehicleType);
        this.setDriver(driver);
        this.setTime(time);
    }

    public String getSelectVehicle() {
        return selectVehicle;
    }

    public void setSelectVehicle(String selectVehicle) {
        this.selectVehicle = selectVehicle;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
