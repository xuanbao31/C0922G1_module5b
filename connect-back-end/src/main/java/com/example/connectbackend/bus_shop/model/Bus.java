package com.example.connectbackend.bus_shop.model;

import javax.persistence.*;

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codeBus;
    private String phoneNumber;
    private String email;
    private String timeStart;
    private String endTime;
    private String locationStart;
    private String locationEnd;
    private int status;
    @ManyToOne
    @JoinColumn(name = "bus_type_id", referencedColumnName = "id")
    private BusType busType;

    public String getLocationStart() {
        return locationStart;
    }

    public void setLocationStart(String locationStart) {
        this.locationStart = locationStart;
    }

    public String getLocationEnd() {
        return locationEnd;
    }

    public void setLocationEnd(String locationEnd) {
        this.locationEnd = locationEnd;
    }

    public Bus(int id, String codeBus, String phoneNumber, String email, String timeStart, String endTime, String locationStart, String locationEnd, BusType busType, int status) {
        this.id = id;
        this.codeBus = codeBus;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.timeStart = timeStart;
        this.endTime = endTime;
        this.locationStart = locationStart;
        this.locationEnd = locationEnd;
        this.busType = busType;
        this.status = status;
    }

    public Bus() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeBus() {
        return codeBus;
    }

    public void setCodeBus(String codeBus) {
        this.codeBus = codeBus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }


}
