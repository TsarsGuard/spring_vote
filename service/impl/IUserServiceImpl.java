//package com.victor.spring_vote.service.impl;
//
//
//import com.victor.spring_vote.dao.IUserDao;
//import com.victor.spring_vote.dao.VoteDao;
//import com.victor.spring_vote.entity.User;
//import com.victor.spring_vote.service.inf.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//@Service
//public class IUserServiceImpl  implements UserService{
//
//	@Autowired
//	@Qualifier("u")
//	private IUserDao udao;
//
//	@Autowired
//	@Qualifier("v")
//	private VoteDao vdao;
//
//	public void insert(User record) {
//		udao.insert(record);
//	}
//
//	public void update_flag(String id) {
//		udao.update_flag(id);
//	}
//
//	public User getUser(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//}
