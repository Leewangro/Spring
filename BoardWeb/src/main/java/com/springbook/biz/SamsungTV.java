package com.springbook.biz;

/*
 * public class SamsungTV {
 * 
 * public void powerOn() { System.out.println("SmasungTV ----전원을 킨다"); }
 * 
 * public void powerOff() { System.out.println("SmasungTV ----전원을 끈다"); }
 * 
 * public void volumeUp() { System.out.println("SmasungTV ----소리를 올린다"); }
 * 
 * public void volumeDown() { System.out.println("SmasungTV ----소리를 내린다"); }
 * 
 * }
 */

/*
 * public class SamsungTV implements TV { public SamsungTV() {
 * System.out.println("====>삼성티비 객체 생성"); }
 * 
 * public void powerOn() { System.out.println("삼성티비 ----전원 켠다."); }
 * 
 * public void powerOff() { System.out.println("삼성티비 ----전원 끈다."); }
 * 
 * public void volumeUp() { System.out.println("삼성티비 ----소리를 올린다."); }
 * 
 * public void volumeDown() { System.out.println("삼성티비 ----소리를 내린다."); }
 * 
 * }
 */

/*
 * public class SamsungTV { public SamsungTV() {
 * System.out.println("====>삼성티비 객체 생성"); } }
 */

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("====>삼성티비(1) 객체 생성");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("====>삼성티비(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("====>삼성티비(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("삼성티비 ----전원 켠다. (가격 : " + price + ")");
	}

	public void powerOff() {
		System.out.println("삼성티비 ----전원 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("삼성티비 ---소리를 올린다");
	}

	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("삼성티비 ----소리를 내린다.");
	}

}