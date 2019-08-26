package com.bitcamp.serviceimpls;

import com.bitcamp.domains.CellPhoneBean;
import com.bitcamp.domains.IPhoneBean;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.services.PhoneService;

public class PhoneServiceImpl implements PhoneService{

	@Override
	public String homePhone(PhoneBean param) {
		return param.toString();
	}

	@Override
	public String cellPhone(CellPhoneBean param) {
		return param.toString();
	}

	@Override
	public String IPhone(IPhoneBean param) {
		return param.toString();
	}

}
