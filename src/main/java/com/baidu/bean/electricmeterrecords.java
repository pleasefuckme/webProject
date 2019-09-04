package com.baidu.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-19-15:01
 */
@Component
public class electricmeterrecords {
    private  int electricmeterrecordsid;
    private Date timebuying;
    private float Initialnumberofmeters;
    private int electricmeternumber;
    private Date validity;
    private String metersupplier;
    private String metertype;
    private Date timeofmeterdelivery;
    private float electricmetercost;
    private String remark;
    private String accessory;
    private String Meteroftype;
    private String electricmetercharacteristics;
    private String state;

    public electricmeterrecords() {
    }

    public electricmeterrecords(int electricmeterrecordsid, Date timebuying, float initialnumberofmeters, int electricmeternumber, Date validity, String metersupplier, String metertype, Date timeofmeterdelivery, float electricmetercost, String remark, String accessory, String meteroftype, String electricmetercharacteristics, String state) {
        this.electricmeterrecordsid = electricmeterrecordsid;
        this.timebuying = timebuying;
        Initialnumberofmeters = initialnumberofmeters;
        this.electricmeternumber = electricmeternumber;
        this.validity = validity;
        this.metersupplier = metersupplier;
        this.metertype = metertype;
        this.timeofmeterdelivery = timeofmeterdelivery;
        this.electricmetercost = electricmetercost;
        this.remark = remark;
        this.accessory = accessory;
        Meteroftype = meteroftype;
        this.electricmetercharacteristics = electricmetercharacteristics;
        this.state = state;
    }

    public int getElectricmeterrecordsid() {
        return electricmeterrecordsid;
    }

    public void setElectricmeterrecordsid(int electricmeterrecordsid) {
        this.electricmeterrecordsid = electricmeterrecordsid;
    }

    public Date getTimebuying() {
        return timebuying;
    }

    public void setTimebuying(Date timebuying) {
        this.timebuying = timebuying;
    }

    public float getInitialnumberofmeters() {
        return Initialnumberofmeters;
    }

    public void setInitialnumberofmeters(float initialnumberofmeters) {
        Initialnumberofmeters = initialnumberofmeters;
    }

    public int getElectricmeternumber() {
        return electricmeternumber;
    }

    public void setElectricmeternumber(int electricmeternumber) {
        this.electricmeternumber = electricmeternumber;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public String getMetersupplier() {
        return metersupplier;
    }

    public void setMetersupplier(String metersupplier) {
        this.metersupplier = metersupplier;
    }

    public String getMetertype() {
        return metertype;
    }

    public void setMetertype(String metertype) {
        this.metertype = metertype;
    }

    public Date getTimeofmeterdelivery() {
        return timeofmeterdelivery;
    }

    public void setTimeofmeterdelivery(Date timeofmeterdelivery) {
        this.timeofmeterdelivery = timeofmeterdelivery;
    }

    public float getElectricmetercost() {
        return electricmetercost;
    }

    public void setElectricmetercost(float electricmetercost) {
        this.electricmetercost = electricmetercost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getMeteroftype() {
        return Meteroftype;
    }

    public void setMeteroftype(String meteroftype) {
        Meteroftype = meteroftype;
    }

    public String getElectricmetercharacteristics() {
        return electricmetercharacteristics;
    }

    public void setElectricmetercharacteristics(String electricmetercharacteristics) {
        this.electricmetercharacteristics = electricmetercharacteristics;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "electricmeterrecords{" +
                "electricmeterrecordsid=" + electricmeterrecordsid +
                ", timebuying=" + timebuying +
                ", Initialnumberofmeters=" + Initialnumberofmeters +
                ", electricmeternumber=" + electricmeternumber +
                ", validity=" + validity +
                ", metersupplier='" + metersupplier + '\'' +
                ", metertype='" + metertype + '\'' +
                ", timeofmeterdelivery=" + timeofmeterdelivery +
                ", electricmetercost=" + electricmetercost +
                ", remark='" + remark + '\'' +
                ", accessory='" + accessory + '\'' +
                ", Meteroftype='" + Meteroftype + '\'' +
                ", electricmetercharacteristics='" + electricmetercharacteristics + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
