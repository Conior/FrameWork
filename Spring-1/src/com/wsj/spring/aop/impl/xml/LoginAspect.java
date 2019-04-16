package com.wsj.spring.aop.impl.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

public class LoginAspect {

	public void beforeMethod(JoinPoint joinPoint) {
		// ��ȡĿ�귽����
		String methodName = joinPoint.getSignature().getName();

		// ��ȡĿ�귽������
		List<Object> args = Arrays.asList(joinPoint.getArgs());
//		Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " begin with " + args);
	}

	public void afterMethod(JoinPoint joinPoint) {
		// ��ȡĿ�귽����
		String methodName = joinPoint.getSignature().getName();

		// ��ȡĿ�귽������
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " after with " + args);
	}
	
	public void returnMethod(JoinPoint joinPoint) {
		// ��ȡĿ�귽����
		String methodName = joinPoint.getSignature().getName();

		// ��ȡĿ�귽������
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " return with " + args);
	}
	
	public void exceptionMethod(JoinPoint joinPoint) {
		// ��ȡĿ�귽����
		String methodName = joinPoint.getSignature().getName();
		
		// ��ȡĿ�귽������
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();
		
		System.out.println("The method " + methodName + " exception with " + args);
	}
	
	public void aroundMethod(JoinPoint joinPoint) {
		// ��ȡĿ�귽����
		String methodName = joinPoint.getSignature().getName();
		
		// ��ȡĿ�귽������
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();
		
		System.out.println("The method " + methodName + " around with " + args);
	}
}
