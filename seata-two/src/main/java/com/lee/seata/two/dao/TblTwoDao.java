package com.lee.seata.two.dao;

import com.lee.seata.two.entity.TblTwo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblTwoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TblTwo record);

    int insertSelective(TblTwo record);

    TblTwo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblTwo record);

    int updateByPrimaryKey(TblTwo record);
}