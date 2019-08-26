package com.bitcamp.serviceimpls;

import com.bitcamp.domains.SubjectBean;
import com.bitcamp.services.SubjectService;

public class SubjectServiceImpl implements SubjectService {
	private SubjectBean[] subjects;
	private int count;

	public SubjectServiceImpl() {
		subjects = new SubjectBean[10];
		count = 0;
	}
}
