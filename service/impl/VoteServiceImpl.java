//package com.victor.spring_vote.service.impl;
//
//import com.victor.spring_vote.dao.IUserDao;
//import com.victor.spring_vote.dao.VoteDao;
//import com.victor.spring_vote.entity.VoteResult;
//import com.victor.spring_vote.entity.Voter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class VoteServiceImpl implements VoteDao {
//
//	@Autowired
//	@Qualifier("u")
//	private IUserDao udao;
//
//	@Autowired
//	@Qualifier("v")
//	private VoteDao votedao;
//
//	public void insert(Voter can) {
////		User u = UserUtil.getLoguser();
//		votedao.insert(can);
////		udao.update_flag(u.getId());
//	}
//
//	public List<VoteResult> showResult() {
//
//		return votedao.showResult();
//	}
//
//}
