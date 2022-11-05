package com.example.car.Entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "engine")
public class EngineEntity {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int engineid;
	private String cc;
	public int getEngineid() {
		return engineid;
	}
	public void setEngineid(int engineid) {
		this.engineid = engineid;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public int getNoCylinder() {
		return noCylinder;
	}
	public void setNoCylinder(int noCylinder) {
		this.noCylinder = noCylinder;
	}
	public String getWieght() {
		return wieght;
	}
	public void setWieght(String wieght) {
		this.wieght = wieght;
	}
	private int noCylinder;
	private String wieght;
	@OneToMany(mappedBy ="engine",cascade = CascadeType.ALL)
	List <CarEntity> cr = new ArrayList <> ();
	

}
