package com.example.connectbackend.bus_shop.repository;

import com.example.connectbackend.bus_shop.model.BusType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBusTypeRepository extends JpaRepository<BusType,Integer> {
}
