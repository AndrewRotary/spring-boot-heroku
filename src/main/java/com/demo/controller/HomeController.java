package com.demo.controller;

import com.demo.entity.Car;
import com.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/")
    public Iterable<Car> home(){
        return carRepository.findAll();
    }

    @GetMapping("/add-cars")
    public Iterable<Car> addCar(){
        Car vw = new Car();
        vw.setMarca("VW");
        vw.setModel("Passat");
        vw.setSpeedPerHour(0);
        carRepository.save(vw);

        Car ford = new Car();
        ford.setMarca("Ford");
        ford.setModel("Mustang");
        ford.setSpeedPerHour(0);
        carRepository.save(ford);
        return carRepository.findAll();
    }


    @GetMapping("/add-speed/{id}")
    public Integer addSpeedById(@PathVariable Integer id){
        Car car = carRepository.findById(id).get();
        car.setSpeedPerHour(car.getSpeedPerHour()+1);
        carRepository.save(car);
        return car.getSpeedPerHour();
    }
}
