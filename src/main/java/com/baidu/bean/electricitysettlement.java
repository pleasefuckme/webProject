package com.baidu.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-19-14:44
 */
@Component
public class electricitysettlement {
    private int electricitysettlementid;
    private String settlementnumber;
    private String Checkthenumber;
    private int chargeammeter;
    private float unitprice;
    private float totalmoney;
    private float realprice;
    private String payway;
    private String isinvoice;
    private String ein;
    private String companyname;
    private String contacts;
    private String contactnumber;
    private String bank;
    private String creater;
    private Date createtime;
    private String updater;
    private Date updatetime;
    private String state;

    public electricitysettlement() {
    }

    public electricitysettlement(int electricitysettlementid, String settlementnumber, String checkthenumber, int chargeammeter, float unitprice, float totalmoney, float realprice, String payway, String isinvoice, String ein, String companyname, String contacts, String contactnumber, String bank, String creater, Date createtime, String updater, Date updatetime, String state) {
        this.electricitysettlementid = electricitysettlementid;
        this.settlementnumber = settlementnumber;
        Checkthenumber = checkthenumber;
        this.chargeammeter = chargeammeter;
        this.unitprice = unitprice;
        this.totalmoney = totalmoney;
        this.realprice = realprice;
        this.payway = payway;
        this.isinvoice = isinvoice;
        this.ein = ein;
        this.companyname = companyname;
        this.contacts = contacts;
        this.contactnumber = contactnumber;
        this.bank = bank;
        this.creater = creater;
        this.createtime = createtime;
        this.updater = updater;
        this.updatetime = updatetime;
        this.state = state;
    }

    public int getElectricitysettlementid() {
        return electricitysettlementid;
    }

    public void setElectricitysettlementid(int electricitysettlementid) {
        this.electricitysettlementid = electricitysettlementid;
    }

    public String getSettlementnumber() {
        return settlementnumber;
    }

    public void setSettlementnumber(String settlementnumber) {
        this.settlementnumber = settlementnumber;
    }

    public String getCheckthenumber() {
        return Checkthenumber;
    }

    public void setCheckthenumber(String checkthenumber) {
        Checkthenumber = checkthenumber;
    }

    public int getChargeammeter() {
        return chargeammeter;
    }

    public void setChargeammeter(int chargeammeter) {
        this.chargeammeter = chargeammeter;
    }

    public float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public float getRealprice() {
        return realprice;
    }

    public void setRealprice(float realprice) {
        this.realprice = realprice;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

    public String getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(String isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "electricitysettlement{" +
                "electricitysettlementid=" + electricitysettlementid +
                ", settlementnumber='" + settlementnumber + '\'' +
                ", Checkthenumber='" + Checkthenumber + '\'' +
                ", chargeammeter=" + chargeammeter +
                ", unitprice=" + unitprice +
                ", totalmoney=" + totalmoney +
                ", realprice=" + realprice +
                ", payway='" + payway + '\'' +
                ", isinvoice='" + isinvoice + '\'' +
                ", ein='" + ein + '\'' +
                ", companyname='" + companyname + '\'' +
                ", contacts='" + contacts + '\'' +
                ", contactnumber='" + contactnumber + '\'' +
                ", bank='" + bank + '\'' +
                ", creater='" + creater + '\'' +
                ", createtime=" + createtime +
                ", updater='" + updater + '\'' +
                ", updatetime=" + updatetime +
                ", state='" + state + '\'' +
                '}';
    }
}
