package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.BanJi;

@Mapper
public interface BanJiMapper {
	
	/**
	 * Insert class info to class table
	 * 
	 * @param banji class need to insert
	 */
	void insertBanJi(BanJi banji);
	
	/**
	 * Query class
	 * @return List of all classes
	 */
	List<BanJi> queryBanJi(BanJi banji);
	
	/**
	 * Query class by id
	 * @param cid class id
	 * @return List of class of cid
	 */
	//List<BanJi> queryBanJiById(Integer cid);
	
	void deleteBanJi(Integer cid);
	
	void updateBanJi(BanJi banji);
}
