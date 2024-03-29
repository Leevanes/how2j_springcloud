package com.lee.seata.three.dao;

import com.lee.seata.three.entity.TblThree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblThreeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TblThree record);

    int insertSelective(TblThree record);

    TblThree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblThree record);

    int updateByPrimaryKey(TblThree record);
}