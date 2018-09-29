package com.victor.spring_vote.dao;

import com.victor.spring_vote.entity.Candida;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("iCandidaDao")
public interface ICandidaDao {
	void insert(Candida can);
	List<Candida> show();
}
