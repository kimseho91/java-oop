package com.bitcamp.domains;
/**
 * 나는 애플에서 만든 아이폰를 사용해서 구글에서 뉴스라고 검색 후 길동에게 문자를 보냈다...
* */
public class IPhoneBean extends CellPhoneBean {
	public final static String KIND = "아이폰";
	private String search;
	public void setSearch(String search) {
		this.search = search;
	}
	public String getSearch() {
		return search;
	}
	@Override
	public String toString() {
		return String.format("나는 %s에서 만든 %s을 사용해서 %s를 검색후 "
				+ "%s에게 문자를 보냈다.", super.getCompany(),KIND,search,super.getReceiver());
	}
}
