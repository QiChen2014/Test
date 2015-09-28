package com.simpletech.webanalytics.service;

import com.simpletech.webanalytics.model.constant.Period;
import com.simpletech.webanalytics.model.entity.PeriodValue;

import java.util.Date;
import java.util.List;

/**
 * ͳ��API Service
 * Created by Administrator on 2015/9/25.
 */
public interface StatisticsService {


    /**
     * Visitͳ�����ݻ�ȡAPI
     * @param idsite ��վID
     * @param period ʱ������
     * @param start ��ʼʱ�� javaʱ��longֵ ��new Date().getTime()
     * @param end ����ʱ�� javaʱ��longֵ ��new Date().getTime()
     * @return PVͳ������ {status:[true|false],data:[{time,date,val},...]}
     */
    List<PeriodValue> visit(String idsite, Period period, Date start, Date end) throws Exception;
    /**
     * PVͳ�����ݻ�ȡAPI
     * @param idsite ��վID
     * @param period ʱ������
     * @param start ��ʼʱ�� javaʱ��longֵ ��new Date().getTime()
     * @param end ����ʱ�� javaʱ��longֵ ��new Date().getTime()
     * @return PVͳ������ {status:[true|false],data:[...]}
     */
    List<PeriodValue> pageView(String idsite, Period period, Date start, Date end) throws Exception;

    /**
     * UVͳ�����ݻ�ȡAPI
     * @param idsite ��վID
     * @param period ʱ������
     * @param start ��ʼʱ�� javaʱ��longֵ ��new Date().getTime()
     * @param end ����ʱ�� javaʱ��longֵ ��new Date().getTime()
     * @return PVͳ������ {status:[true|false],data:[...]}
     */
    List<PeriodValue> uniqueVisitor(String idsite, Period period, Date start, Date end) throws Exception;

    /**
     * IPͳ�����ݻ�ȡAPI
     * @param idsite ��վID
     * @param period ʱ������
     * @param start ��ʼʱ�� javaʱ��longֵ ��new Date().getTime()
     * @param end ����ʱ�� javaʱ��longֵ ��new Date().getTime()
     * @return IPͳ������ {status:[true|false],data:[{time,date,val},...]}
     */
    List<PeriodValue> internetProtocol(String idsite, Period period, Date start, Date end) throws Exception;

}
