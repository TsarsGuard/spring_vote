package com.victor.spring_vote.service.inf;

import com.victor.spring_vote.entity.Candida;

import java.util.List;


public interface ICandidaService {
    void insert(Candida can);

    List<Candida> show();
}
