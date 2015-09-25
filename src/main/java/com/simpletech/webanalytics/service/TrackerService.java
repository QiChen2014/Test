package com.simpletech.webanalytics.service;

import com.simpletech.webanalytics.model.entity.JsDetect;
import com.simpletech.webanalytics.model.entity.JsEvent;

/**
 * JS̽�� ���շ���
 * Created by Administrator on 2015/9/22.
 */
public interface TrackerService {
    /**
     * JS̽��ҳ��ͳ��
     * @param idsite ��վID
     * @param detect ҳ��������ն���
     * @throws Exception
     */
    void trackerPageView(String idsite, JsDetect detect) throws Exception;

    /**
     * JS̽���¼�ͳ��
     * @param idsite ��վID
     * @param event �¼��������ն���
     * @throws Exception
     */
    void trackerEvent(String idsite, JsEvent event) throws Exception;
}
