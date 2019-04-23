package com.springbook.biz;

/*
 * public class SamsungTV {
 * 
 * public void powerOn() { System.out.println("SmasungTV ----������ Ų��"); }
 * 
 * public void powerOff() { System.out.println("SmasungTV ----������ ����"); }
 * 
 * public void volumeUp() { System.out.println("SmasungTV ----�Ҹ��� �ø���"); }
 * 
 * public void volumeDown() { System.out.println("SmasungTV ----�Ҹ��� ������"); }
 * 
 * }
 */

/*
 * public class SamsungTV implements TV { public SamsungTV() {
 * System.out.println("====>�ＺƼ�� ��ü ����"); }
 * 
 * public void powerOn() { System.out.println("�ＺƼ�� ----���� �Ҵ�."); }
 * 
 * public void powerOff() { System.out.println("�ＺƼ�� ----���� ����."); }
 * 
 * public void volumeUp() { System.out.println("�ＺƼ�� ----�Ҹ��� �ø���."); }
 * 
 * public void volumeDown() { System.out.println("�ＺƼ�� ----�Ҹ��� ������."); }
 * 
 * }
 */

/*
 * public class SamsungTV { public SamsungTV() {
 * System.out.println("====>�ＺƼ�� ��ü ����"); } }
 */

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("====>�ＺƼ��(1) ��ü ����");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("====>�ＺƼ��(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("====>�ＺƼ��(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("�ＺƼ�� ----���� �Ҵ�. (���� : " + price + ")");
	}

	public void powerOff() {
		System.out.println("�ＺƼ�� ----���� ����.");
	}

	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("�ＺƼ�� ---�Ҹ��� �ø���");
	}

	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("�ＺƼ�� ----�Ҹ��� ������.");
	}

}