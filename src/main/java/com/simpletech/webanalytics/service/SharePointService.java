package com.simpletech.webanalytics.service;

import java.util.List;

import com.simpletech.webanalytics.model.SharePoint;
import com.simpletech.webanalytics.service.base.BaseService;

/**
 * 数据库表t_share_point的Service接口层
 * @author 树朾
 * @date 2015-10-15 18:13:55 中国标准时间
 */
public interface SharePointService extends BaseService<SharePoint> {

	/**
	 * 插入一条新数据
	 * @param model 添加的数据
	 * @return 改变行数
	 */
	int insert(SharePoint model) throws Exception;
	/**
	 * 根据ID删除
	 * @param id 主键ID
	 */
	int delete(Object id) throws Exception;
	/**
	 * 更新一条数据
	 * @param model 需要更新数据
	 * @return 改变行数
	 */
	int update(SharePoint model) throws Exception;
	/**
	 * 统计全部出数据
	 * @return 全部数据量
	 */
	int countAll() throws Exception;
	/**
	 * 根据ID获取
	 * @param id 主键ID
	 * @return 数据对象 or null
	 */
	SharePoint findById(Object id) throws Exception;
	/**
	 * 获取全部数据
	 * @return 全部所有数据
	 */
	List<SharePoint> findAll() throws Exception;
	/**
	 * 分页查询数据
	 * @param limit 分页最大值
	 * @param start 开始编号
	 * @return 分页列表数据
	 */
	List<SharePoint> findByPage(int limit, int start) throws Exception;
	
}