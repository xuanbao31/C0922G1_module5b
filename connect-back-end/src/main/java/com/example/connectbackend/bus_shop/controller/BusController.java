package com.example.connectbackend.bus_shop.controller;

import com.example.connectbackend.bus_shop.model.Bus;
import com.example.connectbackend.bus_shop.model.BusType;
import com.example.connectbackend.bus_shop.service.BusService;
import com.example.connectbackend.bus_shop.service.BusTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/bus")
@CrossOrigin("*")
public class BusController {
    @Autowired
    private BusService busService;
    @Autowired
    private BusTypeService busTypeService;

    //    @GetMapping("/list")
//    public String showList(@PageableDefault(value = 2) Pageable pageable, Model model) {
//        model.addAttribute("busList", busService.findAll(pageable));
//        model.addAttribute("busTypeList", busTypeService.findAll());
//        return "/list";
//    }
    @GetMapping("/list")
    public ResponseEntity<List<Bus>> getAllBus() {
        List<Bus> bus = busService.getAll();
        if (bus.isEmpty()) {
            return new ResponseEntity<>(bus, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bus, HttpStatus.OK);
    }


    @GetMapping("{id}/delete")
    public String showDeleteFormCustomer(@PathVariable int id, Model model) {
        model.addAttribute("bus", busService.findById(id));
        model.addAttribute("busType", busTypeService.findAll());
        return "/delete";
    }

    @PostMapping("/delete")
    public String deleteBus(@ModelAttribute Bus bus, RedirectAttributes redirectAttributes) {
        bus.setStatus(1);
        busService.save(bus);
//            customerService.remove(customer.getId());
        return "redirect:/list";
    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Bus> delete(@PathVariable("id") int id) {
//        Bus busForm = busService.findById(id).get();
//        if (busForm == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        busService.d(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
