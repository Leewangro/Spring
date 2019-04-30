package com.springbook.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTv 객체 생성");
	}
		
	public void powerOn() {
		System.out.println("엘지티비 ----전원 켠다.");
	}

	public void powerOff() {
		System.out.println("엘지티비 ----전원 끊다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}