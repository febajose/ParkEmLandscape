package com.tf_staff.parkemlandscape.Models;

/**
 * Created by Kripa on 20-09-2017.
 */

public class ParkingBookingModel {
    String pAdmin;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    double lat;
    double longi;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;

    public String getpAdmin() {
        return pAdmin;
    }

    public void setpAdmin(String pAdmin) {
        this.pAdmin = pAdmin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String user;
    String id;
    String time;
    String type;

}
