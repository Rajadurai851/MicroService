package com.example.AdminVillage.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class ClientVillageEntity {
	@Id
	@GeneratedValue

	
	String Villagename;
	String Streetname;
	Long Population;
	public String getVillagename() {
		return Villagename;
	}
	public void setVillagename(String villagename) {
		Villagename = villagename;
	}
	public String getStreetname() {
		return Streetname;
	}
	public void setStreetname(String streetname) {
		Streetname = streetname;
	}
	public Long getPopulation() {
		return Population;
	}
	public void setPopulation(Long population) {
		Population = population;
	}
	
	
}
