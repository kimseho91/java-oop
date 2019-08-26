package com.bitcamp.serviceimpls;

import com.bitcamp.domains.ScheduleBean;
import com.bitcamp.services.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService{
	private  ScheduleBean[]  schedules;
	private int count;
	
	public  ScheduleServiceImpl() {
		 schedules = new  ScheduleBean[10];
		 count = 0;
	}

}
