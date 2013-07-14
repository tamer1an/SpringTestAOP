package org.tamer1an.test2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.tamer1an.test2.model.Circle;
import org.tamer1an.test2.model.Triangle;

@Aspect 
public class LoggingAspect {

	private Circle circle;

	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("Advice run, on Get method");
		
	}
	
	@Before("within(org.tamer1an.test2.model.Triangle)")
	public void SecondAdvice(JoinPoint joinPoint){
		System.out.println("Advice 2 is run, on" + joinPoint.toString());
		System.out.println(joinPoint.getTarget());
//		circle = (Circle) joinPoint.getTarget();	
	}
	
	
	@Before("args(name)")
	public void strArgMethods(String name){		
		System.out.println("args(String) " +name);
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	@Pointcut("within(org.tamer1an.test2.model.Circle)")
	public void allCircleMethods(){}
}
