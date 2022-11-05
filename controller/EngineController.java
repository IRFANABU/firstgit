package com.example.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.Entity.EngineEntity;
import com.example.car.service.EngineService;
@RequestMapping(value="enginedet")
@RestController
public class EngineController {
	@Autowired
	EngineService engcont;
	@PostMapping(value="/addlistofengine")
	public String addlist(@RequestBody List <EngineEntity> ee) {
		return engcont.newEngine(ee);
	}
	

}
