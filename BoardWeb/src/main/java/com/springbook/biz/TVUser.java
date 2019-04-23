package com.springbook.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	/*
	 * public static void main(String[] args) { TV tv = new LgTV(); // TV tv = new
	 * SamsungTV();
	 * 
	 * tv.powerOn(); tv.volumeUp(); tv.volumeDown(); tv.powerOff();
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { BeanFactory factory = new
	 * BeanFactory(); TV tv = (TV)factory.getBean(args[0]); tv.powerOn();
	 * tv.powerOff(); tv.volumeUp(); tv.volumeDown(); }
	 */
	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		TV tv = (TV) factory.getBean("tv"); // applicationContext에서 id가 tv인 bean 객체를 생성해서 호출할 때 TV타입으로 형변환해서 호출
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3 .Spring 컨테이너 종료
		factory.close();

	}
}
