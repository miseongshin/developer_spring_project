package com.drengineer.spring.member.dao;


import com.drengineer.spring.member.Member;

public interface IMemberDao {
	
	int memberInsert(Member member);
	Member memberSelect(Member member);
	//void memberUpdate();
	//void memberDelete();
	
}
