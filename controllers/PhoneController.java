package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.CellPhoneBean;
import com.bitcamp.domains.IPhoneBean;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.serviceimpls.PhoneServiceImpl;
import com.bitcamp.services.PhoneService;

public class PhoneController {
	public static void main(String[] args) {
		PhoneService phoneService = new PhoneServiceImpl();
		PhoneBean phoneBean = null;
		CellPhoneBean celphonebean = null;
		IPhoneBean iphonebean = null;
		String[] arr = null;
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료, 1.집전화기, 2.2G폰 , 3.아이폰")) {
			case "0":
				return;
			case "1": 
				arr = JOptionPane
								.showInputDialog("생산자명,통화내용,수신자")
								.split(",");
				phoneBean = new PhoneBean();
				phoneBean.setCompany(arr[0]);
				phoneBean.setCall(arr[1]);
				phoneBean.setReceiver(arr[2]);
				JOptionPane.showMessageDialog(null, phoneService.homePhone(phoneBean));
				break;
			case"2":
				arr = JOptionPane
								.showInputDialog("생산자명,통화내용,수신자")
								.split(",");
				celphonebean = new CellPhoneBean();
				celphonebean.setCompany(arr[0]);
				celphonebean.setText(arr[1]);
				celphonebean.setReceiver(arr[2]);
				JOptionPane.showMessageDialog(null, phoneService.cellPhone(celphonebean));
				break;
			case"3":
				arr = JOptionPane
								.showInputDialog("생산자명,통화내용,수신자")
								.split(",");
				iphonebean = new IPhoneBean();
				iphonebean.setCompany(arr[0]);
				iphonebean.setSearch(arr[1]);
				iphonebean.setReceiver(arr[2]);
				JOptionPane.showMessageDialog(null, phoneService.IPhone(iphonebean));
				break;
			default:
				break;
			}
		}
	}
}