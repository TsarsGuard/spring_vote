package com.victor.spring_vote.service.impl;

import com.victor.spring_vote.dao.ICandidaDao;
import com.victor.spring_vote.entity.Candida;
import com.victor.spring_vote.service.inf.ICandidaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("candidaServiceImpl")
public class CandidaServiceImpl implements ICandidaService {

	@Resource(name="iCandidaDao")
	private ICandidaDao iCandidaDao;

	public void insert(Candida can) {

		iCandidaDao.insert(can);
	}

	public List<Candida> show() {
		List<Candida> list=iCandidaDao.show();
		return list;
	}



}
