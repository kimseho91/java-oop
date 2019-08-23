package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.services.MemberService;
import com.bitcamp.domains.MemberBean;
public class AdminController {
	public static void main(String[] args) {
		MemberService service = new MemberService();
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
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "2":
				String searchId = JOptionPane.showInputDialog("검색 ID");
				member = service.findById(searchId);
				JOptionPane.showMessageDialog(null, member);
				break;
			case "3":
				String searchName = JOptionPane.showInputDialog("검색 이름");
//				member = service.findByName(searchName);
				JOptionPane.showMessageDialog(null, member);
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.countAll());
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