package com.demo.biz.mapper.base;

import com.demo.biz.entity.base.UsUserInfo;
import com.demo.biz.entity.base.UsUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsUserInfoMapper {
    long countByExample(UsUserInfoExample example);

    int deleteByExample(UsUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsUserInfo record);

    int insertSelective(UsUserInfo record);

    List<UsUserInfo> selectByExample(UsUserInfoExample example);

    UsUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsUserInfo record, @Param("example") UsUserInfoExample example);

    int updateByExample(@Param("record") UsUserInfo record, @Param("example") UsUserInfoExample example);

    int updateByPrimaryKeySelective(UsUserInfo record);

    int updateByPrimaryKey(UsUserInfo record);
}