package com.wsj.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // ����������һ������
@Component // �Ѹ��ཻ��IOC��������
public class LoginAspect {

	// �����÷�����һ��ǰ��֪ͨ����Ŀ�귽��ǰִ��
	@Before("execution (public int com.wsj.spring.aop.impl.ArithmeticCalculatorImpl.*(int,int))")
	public void beforeMethod(JoinPoint joinPoint) {
		// ��ȡĿ�귽����
		String methodName = joinPoint.getSignature().getName();

		// ��ȡĿ�귽������
		List<Object> args = Arrays.asList(joinPoint.getArgs());
//		Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " begin with " + args);
	}

	// �����÷�����һ������֪ͨ�������Ƿ������쳣���÷�������ִ�У�
	@After("execution (public int com.wsj.spring.aop.impl.ArithmeticCalculatorImpl.*(int,int))")
	private void afterMethod(JoinPoint joinPoint) {
		// ��ȡĿ�귽����
		String methodName = joinPoint.getSignature().getName();

		// ��ȡĿ�귽������
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " after with " + args);
	}
}
