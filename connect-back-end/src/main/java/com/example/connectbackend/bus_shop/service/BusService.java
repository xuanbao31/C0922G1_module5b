package com.example.connectbackend.bus_shop.service;

import com.example.connectbackend.bus_shop.model.Bus;
import com.example.connectbackend.bus_shop.repository.IBusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IBusSerVice {
    @Autowired
    private IBusRepository busRepository;

    @Override
    public void save(Bus bus) {
        busRepository.save(bus);
    }

    @Override
    public void remove(int id) {
        busRepository.deleteById(id);

    }

    @Override
    public Bus findById(int id) {
        return busRepository.findById(id).get();
    }

    @Override
    public Page<Bus> findAll(Pageable pageable) {
        return busRepository.findAllBy(pageable);
    }

    @Override
    public void deleteBus(int id) {
        busRepository.delete(id);
    }

    @Override
    public List<Bus> getAll() {
        return busRepository.findAll();
    }

}
