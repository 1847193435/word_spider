package com.wang.service.impl;

import com.wang.dao.Cet4WordMapper;
import com.wang.entity.Cet4Word;
import com.wang.service.Cet4WordService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cet4WordServiceImpl implements Cet4WordService {

    @Autowired
    private SqlSession sqlSession;

    public int insertCet4Word(Cet4Word cet4Word) {
        Cet4WordMapper cet4WordMapper = sqlSession.getMapper(Cet4WordMapper.class);
        return cet4WordMapper.insert(cet4Word);
    }
}
