package com.simpletech.webanalytics.service;

import com.simpletech.webanalytics.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

/**
 * 数据库表t_visit的Service层测试类
 * @author 树朾
 * @date 2015-09-21 17:03:53 中国标准时间
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class IspServiceTester {

	@Autowired
	IspService service;

	@Test
	public void findWhereIsp() throws Exception {
//		Object result = service.findWhereIsp("where location_isp='UNICOM'");
		Object result = service.findWhereIsp("where location_isp is null group by location_ip order by visit_servertime DESC",500,0);
//		service.findWhereIsp("where location_isp=''or location_isp='OTHER'");
		System.out.println(JacksonUtil.toJson(result));
	}
	@Test
	public void ispBatch()throws Exception{
//
		Object result=service.ispBatch("where location_isp is null group by location_ip order by visit_servertime DESC", 100, 0);
////		service.findWhereIsp("where location_isp=''or location_isp='OTHER'");
//		System.out.println(JacksonUtil.toJson(result));
	}

}
