package com.example.connectbackend.bus_shop.service;

import com.example.connectbackend.bus_shop.model.BusType;

import java.util.List;

public interface IBusTypeService {
    List<BusType> findAll();
}
