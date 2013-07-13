package org.tamer1an.test2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class LoggingAspect {

	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("Advice run, on Get method");
		
	}
	
	@Before("within(org.tamer1an.test2.model.Triangle)")
	public void SecondAdvice(JoinPoint joinPoint){
		System.out.println("Advice 2 is run, on" + joinPoint.toString());
		
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	@Pointcut("within(org.tamer1an.test2.model.Circle)")
	public void allCircleMethods(){}
}
