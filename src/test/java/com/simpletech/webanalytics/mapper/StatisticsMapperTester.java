package com.simpletech.webanalytics.mapper;

import com.simpletech.webanalytics.model.Visit;
import com.simpletech.webanalytics.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;

/**
 * 数据库表t_visit的Mapper层测试类
 *
 * @author 树朾
 * @date 2015-09-21 17:03:53 中国标准时间
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class StatisticsMapperTester {

    SimpleDateFormat monthf = new SimpleDateFormat("y-M-d");

    @Autowired
    StatisticsMapper mapper;

    @Test
    public void eventDay() throws Exception {
        Object result = mapper.eventDay(1, "ec", monthf.parse("2015-9-0"), monthf.parse("2015-9-30"),100,0);
        System.out.println(JacksonUtil.toJson(result));
    }

    @Test
    public void cvisit() throws Exception {
        Object result = mapper.countVisit(1, monthf.parse("2015-9-0"), monthf.parse("2015-9-30"));
        System.out.println(JacksonUtil.toJson(result));
    }

    @Test
    public void cuser() throws Exception {
        Object result = mapper.countUsers(1, monthf.parse("2015-9-0"), monthf.parse("2015-9-30"));
        System.out.println(JacksonUtil.toJson(result));
    }

    @Test
    public void event() throws Exception {
        Object result = mapper.event(1, monthf.parse("2015-9-0"), monthf.parse("2015-9-30"), 100, 0);
        System.out.println(JacksonUtil.toJson(result));
    }

    @Test
    public void visit() throws Exception {
        Object result = mapper.visitDay(1, monthf.parse("2015-9-0"), monthf.parse("2015-9-30"));
        System.out.println(JacksonUtil.toJson(result));
    }

    @Test
    public void pv() throws Exception {
        Object result = mapper.pageViewDay(1, monthf.parse("2015-9-0"), monthf.parse("2015-9-30"));
        System.out.println(JacksonUtil.toJson(result));
    }

    @Test
    public void uv() throws Exception {
        Object result = mapper.uniqueVisitorDay(1, monthf.parse("2015-9-0"), monthf.parse("2015-9-30"));
        System.out.println(JacksonUtil.toJson(result));
    }

    @Test
    public void ip() throws Exception {
        Object result = mapper.internetProtocolDay(1, monthf.parse("2015-9-0"), monthf.parse("2015-9-30"));
        System.out.println(JacksonUtil.toJson(result));
    }

}