package com.example.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.car.Entity.EngineEntity;



public interface EngineRepository extends JpaRepository<EngineEntity, Integer>{

}
