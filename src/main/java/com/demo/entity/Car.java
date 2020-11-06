package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Integer id;

    private String marca;
    private String model;
    private Integer speedPerHour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSpeedPerHour() {
        return speedPerHour;
    }

    public void setSpeedPerHour(Integer speedPerHour) {
        this.speedPerHour = speedPerHour;
    }
}
