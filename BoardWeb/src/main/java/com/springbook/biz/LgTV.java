package com.springbook.biz;

import org.springframework.stereotype.Component;

/*
 * public class LgTV {
 * 
 * public void turnOn() { System.out.println("LgTV ----������ Ų��"); } public void
 * turnOff() { System.out.println("LgTV ----������ ����"); } public void soundUp() {
 * System.out.println("LgTV ----�Ҹ��� �ø���"); } public void soundDown() {
 * System.out.println("LgTV ----�Ҹ��� ������"); }
 * 
 * }
 */
@Component("tv")
public class LgTV implements TV {
	public LgTV() {
		System.out.println("LgTv ��ü ����");
	}
	
	public void powerOn() {
		System.out.println("����Ƽ�� ----���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("����Ƽ�� ----���� ����.");
	}

	public void volumeUp() {
		System.out.println("����Ƽ�� ----�Ҹ��� ���δ�.");
	}

	public void volumeDown() {
		System.out.println("����Ƽ�� ----�Ҹ��� ���δ�.");
	}

}