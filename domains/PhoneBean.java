package com.bitcamp.domains;
/**
 * 생산자명 company
 * 통화내용 call
 * 수신자 receiver
 * 전화기형태 KIND -> 상수: 집전화기, 2G폰, 아이폰, 안드로이드폰
 * 나는 금성에서 만든 집전화기를 사용해서 길동이에게 안녕이라고 통화했다.  
 **/
public class PhoneBean {
	private String company, call, receiver;
	public final static String KIND = "집전화기";
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getCall() {
		return call;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiver() {
		return receiver;
	}
	
	@Override
		public String toString() {
			return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s라고 통화했다.",company,KIND,receiver,call);
		}
}
