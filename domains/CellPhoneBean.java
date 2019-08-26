package com.bitcamp.domains;

/**
 * 생산자명 company 
 * 통화내용 call 
 * 수신자 receiver 
 * 문자 text
 * 전화기형태 KIND -> 상수: 집전화기, 2G폰, 아이폰, 안드로이드폰
 * 나는 삼성에서 만든 셀룰러폰를 사용해서 길동이에게 안녕이라고 문자했다.
 **/
public class CellPhoneBean extends PhoneBean{
	public final static String KIND = "셀룰러폰";
	private String text;
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}

@Override
	public String toString() {
		return String.format("나는 %s에서 만든 %s을 사용해서 %s에게 %s이라고 문자했다.",super.getCompany(),KIND,super.getReceiver(),text);
	}
}
