package com.why.pojo;

import lombok.ToString;

@ToString
public class Car {
    int id;
    String carName;

    public Car(int id){
        this.id=id;
    }
    public Car(int id,String carName){
        this.id=id;
        this.carName = carName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
