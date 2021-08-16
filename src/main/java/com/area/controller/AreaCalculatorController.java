package com.area.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.area.service.AreaCalculatorService;

@RestController
@RequestMapping("/calculate")
public class AreaCalculatorController {

	@Autowired
	AreaCalculatorService areaCalculatorService;
		@PostMapping("/area")
		public ResponseEntity<?> getArea(@RequestBody String request) {
			try {
			if(request != null) {
				JSONObject response = areaCalculatorService.calculateArea(request);
			return new ResponseEntity<>(response, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>("Please provide the request body", HttpStatus.BAD_REQUEST);
			}
			} catch(Exception e) {
				return new ResponseEntity<>("Invalid JSON request", HttpStatus.BAD_REQUEST);
				
			}
		}

}
