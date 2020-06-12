package com.rk.springbootdemo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Models {
	
	public Models() {
		super();
	}
	public Models(String name, String type, String engine, String onRoadPrice) {
		super();
		this.name = name;
		this.type = type;
		this.engine = engine;
		this.onRoadPrice = onRoadPrice;
	}
	@Id
	private String name;
	private String type;
	private String engine;
	private String onRoadPrice;
	
	//Models Model1 = new Models(model X, electric, v4, $32332);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getonRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(String onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
}
