package com.example.connectbackend.bus_shop.service;

import com.example.connectbackend.bus_shop.model.Bus;
import com.example.connectbackend.bus_shop.repository.IBusRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBusSerVice {
    void save(Bus bus);

    void remove(int id);

    Bus findById(int id);

    Page<Bus> findAll(Pageable pageable);

    void deleteBus(int id);
    List<Bus>getAll();

}
