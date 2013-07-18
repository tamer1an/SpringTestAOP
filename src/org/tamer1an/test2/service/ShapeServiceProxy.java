package org.tamer1an.test2.service;

import org.tamer1an.test2.aspect.LoggingAspect;
import org.tamer1an.test2.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
