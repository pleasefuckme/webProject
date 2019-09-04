package com.baidu.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-19-15:10
 */
@Component
public class metersandsettlement {
    private int metersandsettlementid;
    private String metersettlementnumber;
    private int electricmeternumber;
    private float unitprice;
    private float price;
    private float lastaccountbalance;
    private float amountofpayment;
    private Date createtime;
    private String creater;
    private Date updatetime;
    private String updater;
    private String ispostpone;
    private float init;
    private String reinitexplain;
    private String accessory;
    private String isinit;
    private String state;

    public metersandsettlement() {
    }

    public metersandsettlement(int metersandsettlementid, String metersettlementnumber, int electricmeternumber, float unitprice, float price, float lastaccountbalance, float amountofpayment, Date createtime, String creater, Date updatetime, String updater, String ispostpone, float init, String reinitexplain, String accessory, String isinit, String state) {
        this.metersandsettlementid = metersandsettlementid;
        this.metersettlementnumber = metersettlementnumber;
        this.electricmeternumber = electricmeternumber;
        this.unitprice = unitprice;
        this.price = price;
        this.lastaccountbalance = lastaccountbalance;
        this.amountofpayment = amountofpayment;
        this.createtime = createtime;
        this.creater = creater;
        this.updatetime = updatetime;
        this.updater = updater;
        this.ispostpone = ispostpone;
        this.init = init;
        this.reinitexplain = reinitexplain;
        this.accessory = accessory;
        this.isinit = isinit;
        this.state = state;
    }

    public int getMetersandsettlementid() {
        return metersandsettlementid;
    }

    public void setMetersandsettlementid(int metersandsettlementid) {
        this.metersandsettlementid = metersandsettlementid;
    }

    public String getMetersettlementnumber() {
        return metersettlementnumber;
    }

    public void setMetersettlementnumber(String metersettlementnumber) {
        this.metersettlementnumber = metersettlementnumber;
    }

    public int getElectricmeternumber() {
        return electricmeternumber;
    }

    public void setElectricmeternumber(int electricmeternumber) {
        this.electricmeternumber = electricmeternumber;
    }

    public float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getLastaccountbalance() {
        return lastaccountbalance;
    }

    public void setLastaccountbalance(float lastaccountbalance) {
        this.lastaccountbalance = lastaccountbalance;
    }

    public float getAmountofpayment() {
        return amountofpayment;
    }

    public void setAmountofpayment(float amountofpayment) {
        this.amountofpayment = amountofpayment;
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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getIspostpone() {
        return ispostpone;
    }

    public void setIspostpone(String ispostpone) {
        this.ispostpone = ispostpone;
    }

    public float getInit() {
        return init;
    }

    public void setInit(float init) {
        this.init = init;
    }

    public String getReinitexplain() {
        return reinitexplain;
    }

    public void setReinitexplain(String reinitexplain) {
        this.reinitexplain = reinitexplain;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getIsinit() {
        return isinit;
    }

    public void setIsinit(String isinit) {
        this.isinit = isinit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "metersandsettlement{" +
                "metersandsettlementid=" + metersandsettlementid +
                ", metersettlementnumber='" + metersettlementnumber + '\'' +
                ", electricmeternumber=" + electricmeternumber +
                ", unitprice=" + unitprice +
                ", price=" + price +
                ", lastaccountbalance=" + lastaccountbalance +
                ", amountofpayment=" + amountofpayment +
                ", createtime=" + createtime +
                ", creater='" + creater + '\'' +
                ", updatetime=" + updatetime +
                ", updater='" + updater + '\'' +
                ", ispostpone='" + ispostpone + '\'' +
                ", init=" + init +
                ", reinitexplain='" + reinitexplain + '\'' +
                ", accessory='" + accessory + '\'' +
                ", isinit='" + isinit + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
