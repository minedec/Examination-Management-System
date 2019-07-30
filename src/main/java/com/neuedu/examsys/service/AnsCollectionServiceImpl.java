package com.neuedu.examsys.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.AnsCollectionMapper;
import com.neuedu.examsys.domain.AnsCollection;

/**
 * 服务实现
 * @author jjd
 *
 */
@Service
public class AnsCollectionServiceImpl implements AnsCollectionService {

	@Autowired
	private AnsCollectionMapper acMapper;
	
	@Override
	public void insertAns(AnsCollection ac) {
		acMapper.insertAns(ac);
	}

	@Override
	public void updateAnsScore(AnsCollection ac) {
		acMapper.updateAnsScore(ac);
	}

	@Override
	public int queryScore(AnsCollection ac) {
		return acMapper.queryScore(ac);
	}

	@Override
	public Map<Integer, Integer> queryScores(AnsCollection ac) {
		Map<Integer, Integer> baseMap = new HashMap<Integer, Integer>();
	    List<Map<Integer, Integer>> baseList = acMapper.queryScores(ac);
	    for (Map<Integer, Integer> map: baseList     //遍历list
	         ) {
	        Integer id = null;
	        Integer score = null;
	        for (Map.Entry<Integer,Integer>  entry:map.entrySet()   //遍历map的key集合 获取对应key的value
	             ) {
	                id =  entry.getKey();
	                score = entry.getValue();
	            baseMap.put(id,score);
	        }
	    }
	    return baseMap;
	}

}
