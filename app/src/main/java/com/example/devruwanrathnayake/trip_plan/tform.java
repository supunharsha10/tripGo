package com.example.devruwanrathnayake.trip_plan;

public class tform {
    private String customerName;
    private String email;
    private String tp;
    private String passenger;
    private String type;
    private String in;
    private String out;
    private String NIC;

    public tform() {
        this.customerName = customerName;
        this.email = email;
        this.tp = tp;
        this.passenger = passenger;
        this.type = type;
        this.in = in;
        this.out = out;
        this.NIC = NIC;
    }



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getRooms() {
        return passenger;
    }

    public void setRooms(String rooms) {
        this.passenger = rooms;
    }

    public String getRoomtype() {
        return type;
    }

    public void setRoomtype(String roomtype) {
        this.type = roomtype;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
}
