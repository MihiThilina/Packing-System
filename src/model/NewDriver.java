package model;

import com.jfoenix.controls.JFXTextField;

public class NewDriver {
     String DriverName;
     String Nic;
     String License;
     String Address;
     String  ContactNo;

    public NewDriver() {
    }

    public NewDriver(String driverName, String nic, String license, String address, String contactNo) {
        DriverName = driverName;
        Nic = nic;
        License = license;
        Address = address;
        ContactNo = contactNo;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String license) {
        License = license;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }


}
