package com.neuedu.examsys.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Banji;

@Mapper
public interface BanjiMapper {
	public void insertBanji(Banji bj);
	public List<Banji> queryBanji();
	public List<Banji> selectBanji(Integer id);
	public void deleteBanji(Integer id);
	public void updateBanji(Banji bj);
}
