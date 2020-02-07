package com.demo.biz.mapper.base;

import com.demo.biz.entity.base.CifEntUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CifEntUserMapper {
    int deleteByPrimaryKey(String euserId);

    int insert(CifEntUser record);

    int insertSelective(CifEntUser record);

    CifEntUser selectByPrimaryKey(String euserId);

    int updateByPrimaryKeySelective(CifEntUser record);

    int updateByPrimaryKey(CifEntUser record);
}