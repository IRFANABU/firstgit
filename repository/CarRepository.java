package com.example.car.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.car.Entity.CarEntity;
public interface CarRepository extends JpaRepository<CarEntity, Integer>{
	@Query(value= "select * from car inner join engine on car.id =engine.engineid" ,nativeQuery=true )
	public List <CarEntity> getbyid();
		
		
	}

