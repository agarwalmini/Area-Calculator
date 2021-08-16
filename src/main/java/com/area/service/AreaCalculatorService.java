package com.area.service;

import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.area.model.Circle;
import com.area.model.Rectangle;
import com.area.model.Shape;
import com.area.model.Square;

@Service
public class AreaCalculatorService {

	public JSONObject calculateArea(String request) throws Exception {
		JSONObject response = new JSONObject();
		JSONParser parser = new JSONParser();

		Object obj;
		try {
			obj = parser.parse(request);
		

		JSONObject jsonObject = (JSONObject) obj;
		
		//AreaRequestModel response = new AreaRequestModel();

		for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
		    String key = (String) iterator.next();
		    Shape shape;
			//request.getKey();
			JSONObject value = (JSONObject) jsonObject.get(key);
			String shapeType = (String) value.get("type");
			double val = 0.00;
			switch(shapeType) {
			case "circle":
				double rad = (double)value.get("radius");
				shape = new Circle(rad);
				
				val = shape.area();
				break;
			case "square":
				double side = (double)value.get("side");
				shape = new Square(side);
				val = shape.area();
				break;
			case "rectangle":
				double l = (double)value.get("l");
				double b = (double)value.get("b");
				shape = new Rectangle(l, b);
				val = shape.area();
				break;
			default:
				val = 0;
				break;
				
			}
			response.put(key, val);
			//response.setKey(key);
			//response.setValue(val);
		}
		
		
		//return response;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new Exception();
		}
		return response;
		
	}

}
