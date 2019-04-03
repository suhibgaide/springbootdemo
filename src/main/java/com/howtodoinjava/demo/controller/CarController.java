package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {
	@RequestMapping("/")
	public List<Car> getCars() {
		List<Car> CarList = new ArrayList<Car>();
		CarList.add(new Car(1, "BMW X6 4WD", "BMW CORPORATION"));
		return CarList;
	}
}