package com.simpletech.webanalytics.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.simpletech.webanalytics.model.Url;
import com.simpletech.webanalytics.dao.base.BaseDaoMybatisMYSQLImpl.MybatisMultiDao;


/**
 * 数据库表t_url的mapper接口
 * @author 树朾
 * @date 2015-12-11 18:11:55 中国标准时间
 */
public interface UrlMapper extends MybatisMultiDao<Url>{

	/**
	 * 插入一条新数据
	 * @param model 添加的数据
	 * @return 改变的行数
	 */
	@Insert("INSERT INTO t_url ( id , idsite , idsubsite , create_time , update_time , hash , hash_title , url ) VALUES ( #{id} , #{idsite} , #{idsubsite} , #{createTime} , #{updateTime} , #{hash} , #{hashTitle} , #{url} )")
	int insert(Url model);
	/**
	 * 根据ID删除
	 * @param id 数据的主键ID
	 * @return 改变的行数
	 */
	@Delete("DELETE FROM t_url WHERE id=#{id}")
	int delete(@Param("id") Object id);
	/**
	 * 更新一条数据
	 * @param model 更新的数据
	 * @return 改变的行数
	 */
	@Update("UPDATE t_url SET id=#{id} , idsite=#{idsite} , idsubsite=#{idsubsite} , create_time=#{createTime} , update_time=#{updateTime} , hash=#{hash} , hash_title=#{hashTitle} , url=#{url} WHERE id=#{id} ")
	int update(Url model);
	/**
	 * 统计全部出数据
	 * @return 统计数
	 */
	@Select("SELECT COUNT(*) FROM t_url")
	int countAll();
	/**
	 * 根据ID获取
	 * @param id 主键ID
	 * @return null 或者 主键等于id的数据
	 */
	@Select("SELECT id , idsite , idsubsite , create_time createTime , update_time updateTime , hash , hash_title hashTitle , url FROM t_url WHERE id=#{id}")
	Url findById(@Param("id") Object id);
	/**
	 * 获取全部数据
	 * @return 全部数据列表
	 */
	@Select("SELECT id , idsite , idsubsite , create_time createTime , update_time updateTime , hash , hash_title hashTitle , url FROM t_url ${order}")
	List<Url> findAll(@Param("order") String order);
	/**
	 * 分页查询数据
	 * @param limit 最大返回
	 * @param start 起始返回
	 * @return 分页列表数据
	 */
	@Select("SELECT id , idsite , idsubsite , create_time createTime , update_time updateTime , hash , hash_title hashTitle , url FROM t_url ${order} LIMIT ${start},${limit}")
	List<Url> findByPage(@Param("order") String order,@Param("limit") int limit,@Param("start") int start);
	/**
	 * 选择性删除
	 * @param where SQL条件语句
	 * @return 改变的行数
	 */
	@Delete("DELETE FROM t_url ${where}")
	int deleteWhere(@Param("where") String where);
	/**
	 * 根据属性值删除
	 * @param propertyName 数据库列名
	 * @param value 值
	 * @return 改变的行数
	 */
	@Delete("DELETE FROM t_url WHERE ${propertyName}=#{value}")
	int deleteByPropertyName(@Param("propertyName") String propertyName,@Param("value") Object value);
	/**
	 * 选择性统计
	 * @param where SQL条件语句
	 * @return 统计数
	 */
	@Select("SELECT COUNT(*) FROM t_url ${where}")
	int countWhere(@Param("where") String where);
	/**
	 * 根据属性统计
	 * @param propertyName 数据库列名
	 * @param value 值
	 * @return 统计数
	 */
	@Select("SELECT COUNT(*) FROM WHERE ${propertyName}=#{value}")
	int countByPropertyName(@Param("propertyName") String propertyName,@Param("value") Object value);
	/**
	 * 选择性查询
	 * @param where SQL条件语句
	 * @return 符合条件的列表数据
	 */
	@Select("SELECT id , idsite , idsubsite , create_time createTime , update_time updateTime , hash , hash_title hashTitle , url FROM t_url ${where} ${order}")
	List<Url> findWhere(@Param("order") String order,@Param("where") String where);
	/**
	 * 选择性分页查询
	 * @param where SQL条件语句
	 * @param limit 最大返回
	 * @param start 起始返回
	 * @return 符合条件的列表数据
	 */
	@Select("SELECT id , idsite , idsubsite , create_time createTime , update_time updateTime , hash , hash_title hashTitle , url FROM t_url ${where} ${order} LIMIT ${start},${limit}")
	List<Url> findWhereByPage(@Param("order") String order,@Param("where") String where,@Param("limit") int limit,@Param("start") int start);
	/**
	 * 根据属性查询
	 * @param propertyName 数据库列名
	 * @param value 值
	 * @return 返回符合条件的数据列表
	 */
	@Select("SELECT id , idsite , idsubsite , create_time createTime , update_time updateTime , hash , hash_title hashTitle , url FROM t_url WHERE ${propertyName}=#{value} ${order}")
	List<Url> findByPropertyName(@Param("order") String order,@Param("propertyName") String propertyName,@Param("value") Object value);
}