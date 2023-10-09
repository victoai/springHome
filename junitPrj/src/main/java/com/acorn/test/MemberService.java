package com.acorn.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	@Autowired
	MemberDAO dao;		 

	public  ArrayList<String> test() {
		return dao.test();
	}
	
	public  ArrayList<Member> list() {
		return dao.select();
	}
	
}
