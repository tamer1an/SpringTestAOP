package org.tamer1an.test2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.tamer1an.test2.model.Circle;

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
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exeptionAdvice(String name, RuntimeException ex){  // Exception Ex
		System.out.println("args(String) " +name);
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void strArgMethods(String name, String returnString){		
		System.out.println("args(String) " +name);
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	@Pointcut("within(org.tamer1an.test2.model.Circle)")
	public void allCircleMethods(){}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
