package com.demo.repository;

import com.demo.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Integer> {

    List<Car> findByMarca(String nume);
}
