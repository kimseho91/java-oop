package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.services.AdminService;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.serviceimpls.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		AdminService adminservice = new AdminServiceImpl();
		MemberBean member = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n " 
												+ "1.회원목록\n " 
												+ "2.아이디검색\n " 
												+ "3.이름검색\n " 
												+ "4.전체회원수")) {
			case "0":

				return;
			case "1":
				JOptionPane.showMessageDialog(null, adminservice.list());
				break;
			case "2":
				String searchId = JOptionPane.showInputDialog("검색 ID");
				JOptionPane.showMessageDialog(null, adminservice.findById(searchId));
				break;
			case "3":
				String searchName = JOptionPane.showInputDialog("이름 검색");
				JOptionPane.showMessageDialog(null, adminservice.findByName(searchName));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, adminservice.countAll());
				break;

			default:
				break;
			}
		}
	}
}
/** <관리자기능>
* 1. 회원목록
* 2. 아이디검색
* 3. 이름검색
* 4. 전체 회원수
**/