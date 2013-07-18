package org.tamer1an.test2.service;

import org.tamer1an.test2.model.Circle;
import org.tamer1an.test2.model.Triangle;

public class FactoryService {


	public Object getBean (String beanType){
		if (beanType.equals("shapeService")) return new ShapeService();
		if (beanType.equals("circle")) return new Circle();
		if (beanType.equals("triangle")) return new Triangle();
		
		return null;
		
	}
		
}
