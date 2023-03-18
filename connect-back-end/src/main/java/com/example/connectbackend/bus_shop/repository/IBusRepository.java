package com.example.connectbackend.bus_shop.repository;

import com.example.connectbackend.bus_shop.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBusRepository extends JpaRepository<Bus, Integer> {
    @Query(value = "select * from bus", nativeQuery = true)
    Page<Bus> findAllBy(Pageable pageable);

    @Query(value = "update bus b set status=1 where id=:id", nativeQuery = true)
    void delete(@Param("id") int id);
}
