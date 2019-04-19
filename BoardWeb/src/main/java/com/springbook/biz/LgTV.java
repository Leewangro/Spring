package com.springbook.biz;

/*
 * public class LgTV {
 * 
 * public void turnOn() { System.out.println("LgTV ----전원을 킨다"); } public void
 * turnOff() { System.out.println("LgTV ----전원을 끈다"); } public void soundUp() {
 * System.out.println("LgTV ----소리를 올린다"); } public void soundDown() {
 * System.out.println("LgTV ----소리를 내린다"); }
 * 
 * }
 */

public class LgTV implements TV {

	public void powerOn() {
		System.out.println("엘지티비 ----전원 켠다.");
	}

	public void powerOff() {
		System.out.println("엘지티비 ----전원 켠다.");
	}

	public void volumeUp() {
		System.out.println("엘지티비 ----전원 켠다.");
	}

	public void volumeDown() {
		System.out.println("엘지티비 ----전원 켠다.");
	}

}