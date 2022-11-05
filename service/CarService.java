package com.example.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.Entity.CarEntity;
import com.example.car.repository.CarRepository;

@Service
public class CarService {
@Autowired
CarRepository carserv;
public String addcarList(List <CarEntity> ce) {
	carserv.saveAll(ce);
	return "listcar detail added";
}
public List <CarEntity> getall (){
	return carserv.getbyid();
}

}
