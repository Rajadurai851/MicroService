package com.example.ClientVillage.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ClientVillage.entity.ClientVillageEntity;




@RestController
public class ClientVillageController {

	
	@PostMapping(path="/Store/Update")
	public String storedata(ClientVillageEntity villageentity)
	{
		return "data saved successfully";
	}
	
}
