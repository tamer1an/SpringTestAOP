package org.tamer1an.test2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAspect {

	public Object myAround(ProceedingJoinPoint proceedingJoinPoint){	
		Object returnValue = null;	
		try {
			System.out.println("---- Before around ----");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("---- After around ----");
		} catch (Throwable e) {
			System.out.println("---- After throwing ----");  //	e.printStackTrace();		
		}		
		System.out.println("---- After finaly ----");	
		return returnValue;
	}

	public void loggingAdvice(){
		System.out.println("Aspect run!");
	}
}


/*
 * Aspect examples
 * 
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}	
	
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
	

	@Around("@annotation(org.tamer1an.test2.aspect.Loggable)") //	@Around("allGetters()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint){	
		Object returnValue = null;
		
		try {
			System.out.println("---- Before around ----");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("---- After around ----");
		} catch (Throwable e) {
			System.out.println("---- After throwing ----");  //	e.printStackTrace();		
		}		
		System.out.println("---- After finaly ----");	
		return returnValue;
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

*/
