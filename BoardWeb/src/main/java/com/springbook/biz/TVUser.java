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
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
		TV tv = (TV) factory.getBean("tv"); // applicationContext���� id�� tv�� bean ��ü�� �����ؼ� ȣ���� �� TVŸ������ ����ȯ�ؼ� ȣ��
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3 .Spring �����̳� ����
		factory.close();

	}
}
