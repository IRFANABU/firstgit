package com.example.car.Entity;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name ="car")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CarEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String model;
	private String brand;
	private String color;
	private int price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="engineid")
	private EngineEntity engine;

}
