package com.proxy.test;

import java.lang.reflect.Proxy;

import com.proxy.proxy.proxy;
import com.proxy.service.service;
import com.proxy.service.serviceImple;

public class test {

	public static void main(String[] args) {
		serviceImple a=new serviceImple();
		service b=(service)Proxy.newProxyInstance(test.class.getClassLoader(), a.getClass().getInterfaces(), new proxy(a));
		b.login();
		
	}
	//动态代理感觉需要强记
}
