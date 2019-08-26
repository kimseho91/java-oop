package com.bitcamp.services;

import com.bitcamp.domains.MemberBean;
/**
 * 요구사항 (기능정의)
 * <사용자기능> 
 * 1. 회원가입 
 * 2. 마이페이지 
 * 3. 비밀번호 수정 
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 로그인
 **/
public interface MemberService {
	public String Join(MemberBean param);

	public String getMyPage(MemberBean param);

	public String changePassword(MemberBean param);

	public String withdraw(MemberBean param);

	public String existId(String id);

	public String login(MemberBean param);
}