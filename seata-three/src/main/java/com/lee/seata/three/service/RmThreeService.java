package com.lee.seata.three.service;

import com.lee.seata.three.dao.TblThreeDao;
import com.lee.seata.three.entity.TblThree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yueyi2019
 */
@Service
public class RmThreeService {
	@Autowired
	TblThreeDao mapper;
	
	public String rm3() {
		
		TblThree o = new TblThree();
		o.setId(3);
		o.setName("rm3");
		mapper.insertSelective(o);
		
		return "";
	}
}