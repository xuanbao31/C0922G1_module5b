package com.example.connectbackend.bus_shop.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BusType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "busType")
    private Set<Bus> buses;

    public BusType() {
    }

    public BusType(int id, String name, Set<Bus> buses) {
        this.id = id;
        this.name = name;
        this.buses = buses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Set<Bus> buses) {
        this.buses = buses;
    }
}
