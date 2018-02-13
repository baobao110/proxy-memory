package com.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.proxy.service.service;

public class proxy implements InvocationHandler{
	
	private Object object; 
	
	public proxy(Object object) {
		this.object=object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("-----begin------");
		Object result=method.invoke(object, args);
		System.out.println("-----end-----");
		return result;
	}
	
	//这里的动态代理方法很特别
	

}
