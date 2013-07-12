package org.tamer1an.test2.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect 
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void LoggingAdvice(){
		System.out.println("Advice run, on Get method");
		
	}
}
