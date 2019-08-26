package com.bitcamp.serviceimpls;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.AdminService;

public class AdminServiceImpl implements AdminService {
	private MemberBean[] members;
	private int count;

	public AdminServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}

	@Override
	public String list() {
		String msg = "";
		for (int i = 0; i < count; i++) {
			msg += members[i].toString() + ", \n";
		}
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (id.equals(members[i].getId())) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int j = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(this.members[i].getName())) {
				j++;
			}
		}
		MemberBean[] members = new MemberBean[j];
		j = 0;
		for (int i = 0; i < count; i++) {

			if (name.equals(this.members[i].getName())) {
				members[j] = this.members[i];
				j++;

				if (members.length == j) {
					break;
				}

			}
			members[i] = this.members[i];
		}
		return members;
	}

	@Override
	public String countAll() {
		String result = "";
		return result = String.format("총회원수: %d", count);
	}

}
