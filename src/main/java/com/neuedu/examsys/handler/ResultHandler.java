package com.neuedu.examsys.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import com.neuedu.examsys.domain.Result;
public class ResultHandler extends BaseTypeHandler<Result>{
	/**
	 * 用于通过字段名获取字段数据时，如何把数据库类型转换为对应的Java类型
	 */
	@Override
	public Result getNullableResult(ResultSet rs, String columnName) throws SQLException {
		String key = rs.getString(columnName);
		if(rs.wasNull()) {
			return null;
		} else {
			return Result.getResultByKey(key);
		}
	}

	/**
	 * 定义通过字段索引获取字段数据时，把数据库类型转为Java类型
	 */
	@Override
	public Result getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		String key = rs.getString(columnIndex);
		if(rs.wasNull()) {
			return null;
		} else {
			return Result.getResultByKey(key);
		}
	}

	/**
	 * 定义调用存储过程后，把数据库类型转换为Java类型
	 */
	@Override
	public Result getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		String key = cs.getString(columnIndex);
		if(cs.wasNull()){
			return null;
		} else {
			return Result.getResultByKey(key);
		}
	}

	/**
	 * 设置把Java类型转为对应数据库类型
	 */
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Result param, JdbcType jdbcType) throws SQLException {
		ps.setString(i, param.getKey());
		
	}
}
