package org.tamer1an.test2;

import org.springframework.context.support.AbstractApplicationContext;
import org.tamer1an.test2.service.FactoryService;
import org.tamer1an.test2.service.ShapeService;

public class AopMain {

	private static AbstractApplicationContext ctx;

	/*
	 * @param args
	 */
	public static void main(String[] args) { // ApplicationContext 
		
//		ctx = new ClassPathXmlApplicationContext("spring.xml");
//		ctx.registerShutdownHook();	
//		ShapeService shapeService = (ShapeService) ctx.getBean("shapeService", ShapeService.class);
		
		FactoryService factoryService = new FactoryService();		
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");		
		shapeService.getCircle();
	}
}
