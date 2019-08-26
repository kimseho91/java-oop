package com.bitcamp.services;

import com.bitcamp.domains.CellPhoneBean;
import com.bitcamp.domains.IPhoneBean;
import com.bitcamp.domains.PhoneBean;

/**
 * 기능정의
 * 1. 집전화기로 통화
 * 2. 2G폰 통화
 * 3. 아이폰 통화
 * **/
public interface PhoneService {

	public String homePhone(PhoneBean param);
	public String cellPhone(CellPhoneBean param);
	public String IPhone(IPhoneBean param);
}
