package com.example.connectbackend.bus_shop.service;

import com.example.connectbackend.bus_shop.model.BusType;
import com.example.connectbackend.bus_shop.repository.IBusTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusTypeService implements IBusTypeService {
    @Autowired
    IBusTypeRepository busTypeRepository;

    @Override
    public List<BusType> findAll() {
        return busTypeRepository.findAll();
    }
}
