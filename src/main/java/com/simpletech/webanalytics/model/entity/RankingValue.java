package com.simpletech.webanalytics.model.entity;

/**
 * ����ͳ��ֵ
 * Created by Administrator on 2015/9/29.
 */
public class RankingValue {

    private String name;        //��������
    private String remark;      //���б�ע
    private int uv;             //�����û���
    private int visit;          //visit ��
    private int pv;             //pv ��
    private int ip;             //pv ��
    private float ruv;          //�����û� ռ��
    private float rvisit;       //visit ռ��
    private float rpv;          //pv ռ��
    private float rip;          //ip ռ��

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public float getRip() {
        return rip;
    }

    public void setRip(float rip) {
        this.rip = rip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getVisit() {
        return visit;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public float getRuv() {
        return ruv;
    }

    public void setRuv(float ruv) {
        this.ruv = ruv;
    }

    public float getRvisit() {
        return rvisit;
    }

    public void setRvisit(float rvisit) {
        this.rvisit = rvisit;
    }

    public float getRpv() {
        return rpv;
    }

    public void setRpv(float rpv) {
        this.rpv = rpv;
    }
}
