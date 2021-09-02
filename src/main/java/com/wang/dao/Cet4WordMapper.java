package com.wang.dao;

import com.wang.entity.Cet4Word;
import com.wang.entity.Cet4WordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Cet4WordMapper {


    long countByExample(Cet4WordExample example);

    int deleteByExample(Cet4WordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cet4Word record);

    int insertSelective(Cet4Word record);

    List<Cet4Word> selectByExample(Cet4WordExample example);

    Cet4Word selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cet4Word record, @Param("example") Cet4WordExample example);

    int updateByExample(@Param("record") Cet4Word record, @Param("example") Cet4WordExample example);

    int updateByPrimaryKeySelective(Cet4Word record);

    int updateByPrimaryKey(Cet4Word record);
}