package com.springbook.biz;

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

public class LgTV implements TV {

	public void powerOn() {
		System.out.println("����Ƽ�� ----���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("����Ƽ�� ----���� �Ҵ�.");
	}

	public void volumeUp() {
		System.out.println("����Ƽ�� ----���� �Ҵ�.");
	}

	public void volumeDown() {
		System.out.println("����Ƽ�� ----���� �Ҵ�.");
	}

}