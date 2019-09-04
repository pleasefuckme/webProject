package com.baidu.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-19-15:19
 */
@Component
public class monthlycheck {
    private int monthlycheckid;
    private String numberafterverification;
    private String meternumber;
    private float lastmeternumber;
    private float meternumberupto;
    private String ischange;
    private float deductmeternumber;
    private float realmeternumber;
    private Date createtime;
    private String creater;
    private String updater;
    private Date updatetime;
    private Date monthofsettlement;
    private String state;


    public monthlycheck() {
    }

    public monthlycheck(int monthlycheckid, String numberafterverification, String meternumber, float lastmeternumber, float meternumberupto, String ischange, float deductmeternumber, float realmeternumber, Date createtime, String creater, String updater, Date updatetime, Date monthofsettlement, String state) {
        this.monthlycheckid = monthlycheckid;
        this.numberafterverification = numberafterverification;
        this.meternumber = meternumber;
        this.lastmeternumber = lastmeternumber;
        this.meternumberupto = meternumberupto;
        this.ischange = ischange;
        this.deductmeternumber = deductmeternumber;
        this.realmeternumber = realmeternumber;
        this.createtime = createtime;
        this.creater = creater;
        this.updater = updater;
        this.updatetime = updatetime;
        this.monthofsettlement = monthofsettlement;
        this.state = state;
    }

    public int getMonthlycheckid() {
        return monthlycheckid;
    }

    public void setMonthlycheckid(int monthlycheckid) {
        this.monthlycheckid = monthlycheckid;
    }

    public String getNumberafterverification() {
        return numberafterverification;
    }

    public void setNumberafterverification(String numberafterverification) {
        this.numberafterverification = numberafterverification;
    }

    public String getMeternumber() {
        return meternumber;
    }

    public void setMeternumber(String meternumber) {
        this.meternumber = meternumber;
    }

    public float getLastmeternumber() {
        return lastmeternumber;
    }

    public void setLastmeternumber(float lastmeternumber) {
        this.lastmeternumber = lastmeternumber;
    }

    public float getMeternumberupto() {
        return meternumberupto;
    }

    public void setMeternumberupto(float meternumberupto) {
        this.meternumberupto = meternumberupto;
    }

    public String getIschange() {
        return ischange;
    }

    public void setIschange(String ischange) {
        this.ischange = ischange;
    }

    public float getDeductmeternumber() {
        return deductmeternumber;
    }

    public void setDeductmeternumber(float deductmeternumber) {
        this.deductmeternumber = deductmeternumber;
    }

    public float getRealmeternumber() {
        return realmeternumber;
    }

    public void setRealmeternumber(float realmeternumber) {
        this.realmeternumber = realmeternumber;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getMonthofsettlement() {
        return monthofsettlement;
    }

    public void setMonthofsettlement(Date monthofsettlement) {
        this.monthofsettlement = monthofsettlement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "monthlycheck{" +
                "monthlycheckid=" + monthlycheckid +
                ", numberafterverification='" + numberafterverification + '\'' +
                ", meternumber='" + meternumber + '\'' +
                ", lastmeternumber=" + lastmeternumber +
                ", meternumberupto=" + meternumberupto +
                ", ischange='" + ischange + '\'' +
                ", deductmeternumber=" + deductmeternumber +
                ", realmeternumber=" + realmeternumber +
                ", createtime=" + createtime +
                ", creater='" + creater + '\'' +
                ", updater='" + updater + '\'' +
                ", updatetime=" + updatetime +
                ", monthofsettlement=" + monthofsettlement +
                ", state='" + state + '\'' +
                '}';
    }
}

