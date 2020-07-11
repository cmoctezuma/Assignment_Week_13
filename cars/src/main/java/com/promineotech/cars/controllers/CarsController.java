package com.promineotech.cars.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {
	List<String> cars = new ArrayList<>();

	@RequestMapping(value = "api/models", method = RequestMethod.GET)
	public List<String> getCars() {
		return cars;
	}

	@RequestMapping(value = "api/models", method = RequestMethod.POST)
	public String addcar(@RequestBody String car) {
		cars.add(car);

		return "Successfully added";
	}

	@RequestMapping(value = "api/models/{name}", method = RequestMethod.DELETE)
	public boolean deleteCar(@PathVariable String name) {
		return cars.remove(name);
	}
}
