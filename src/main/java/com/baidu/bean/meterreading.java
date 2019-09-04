package com.baidu.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-19-15:06
 */
@Component
public class meterreading {
    private int meterreadingid;
    private String meternumber;
    private int electricmeternumber;
    private String meterreadingstarttime;
    private String meterreadingendtime;
    private float nowmeternumber;
    private float lastmeternumber;
    private String createtime;
    private String creater;
    private String createway;
    private String updater;
    private String updatetime;
    private String meterreadingway;

    public meterreading() {
    }

    public meterreading(int meterreadingid, String meternumber, int electricmeternumber, String meterreadingstarttime, String meterreadingendtime, float nowmeternumber, float lastmeternumber, String createtime, String creater, String createway, String updater, String updatetime, String meterreadingway) {
        this.meterreadingid = meterreadingid;
        this.meternumber = meternumber;
        this.electricmeternumber = electricmeternumber;
        this.meterreadingstarttime = meterreadingstarttime;
        this.meterreadingendtime = meterreadingendtime;
        this.nowmeternumber = nowmeternumber;
        this.lastmeternumber = lastmeternumber;
        this.createtime = createtime;
        this.creater = creater;
        this.createway = createway;
        this.updater = updater;
        this.updatetime = updatetime;
        this.meterreadingway = meterreadingway;
    }

    public int getMeterreadingid() {
        return meterreadingid;
    }

    public void setMeterreadingid(int meterreadingid) {
        this.meterreadingid = meterreadingid;
    }

    public String getMeternumber() {
        return meternumber;
    }

    public void setMeternumber(String meternumber) {
        this.meternumber = meternumber;
    }

    public int getElectricmeternumber() {
        return electricmeternumber;
    }

    public void setElectricmeternumber(int electricmeternumber) {
        this.electricmeternumber = electricmeternumber;
    }

    public String getMeterreadingstarttime() {
        return meterreadingstarttime;
    }

    public void setMeterreadingstarttime(String meterreadingstarttime) {
        this.meterreadingstarttime = meterreadingstarttime;
    }

    public String getMeterreadingendtime() {
        return meterreadingendtime;
    }

    public void setMeterreadingendtime(String meterreadingendtime) {
        this.meterreadingendtime = meterreadingendtime;
    }

    public float getNowmeternumber() {
        return nowmeternumber;
    }

    public void setNowmeternumber(float nowmeternumber) {
        this.nowmeternumber = nowmeternumber;
    }

    public float getLastmeternumber() {
        return lastmeternumber;
    }

    public void setLastmeternumber(float lastmeternumber) {
        this.lastmeternumber = lastmeternumber;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCreateway() {
        return createway;
    }

    public void setCreateway(String createway) {
        this.createway = createway;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getMeterreadingway() {
        return meterreadingway;
    }

    public void setMeterreadingway(String meterreadingway) {
        this.meterreadingway = meterreadingway;
    }

    @Override
    public String toString() {
        return "meterreading{" +
                "meterreadingid=" + meterreadingid +
                ", meternumber='" + meternumber + '\'' +
                ", electricmeternumber=" + electricmeternumber +
                ", meterreadingstarttime='" + meterreadingstarttime + '\'' +
                ", meterreadingendtime='" + meterreadingendtime + '\'' +
                ", nowmeternumber=" + nowmeternumber +
                ", lastmeternumber=" + lastmeternumber +
                ", createtime='" + createtime + '\'' +
                ", creater='" + creater + '\'' +
                ", createway='" + createway + '\'' +
                ", updater='" + updater + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", meterreadingway='" + meterreadingway + '\'' +
                '}';
    }
}
