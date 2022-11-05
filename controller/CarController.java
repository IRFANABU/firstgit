package com.example.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.Entity.CarEntity;
import com.example.car.service.CarService;

@RestController
@RequestMapping(value ="cardet")
public class CarController {
@Autowired
CarService carcont;
@PostMapping(value ="/listofcars")
public String listofcars (@RequestBody List <CarEntity> ce) {
	return carcont.addcarList(ce);
}
@GetMapping(value ="/getall")
public List <CarEntity> getall(){
	return carcont.getall();
}

}
