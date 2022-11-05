package com.example.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.Entity.EngineEntity;
import com.example.car.repository.EngineRepository;

@Service
public class EngineService {
	@Autowired 
	EngineRepository engineser;
	
	public String newEngine(List<EngineEntity> ee) {
		engineser.saveAll(ee);
		return "List of data is added";
	}
	
	

}
