package com.baidu.bean;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-19-14:55
 */
@Component
public class electricmeterbasestation {
    private int electricmeterbasestationid;
    private int basestationnumber;
    private String placethebasestation;
    private String meterinstallationtime;
    private int electricmeternumber;
    private String contacts;
    private float electricitymeterinit;
    private String isservice;
    private String note;
    private String mainlyprovidedlinenumber;
    private String validity;
    private String expirationdate;


    public electricmeterbasestation() {
    }

    public electricmeterbasestation(int electricmeterbasestationid, int basestationnumber, String placethebasestation, String meterinstallationtime, int electricmeternumber, String contacts, float electricitymeterinit, String isservice, String note, String mainlyprovidedlinenumber, String validity, String expirationdate) {
        this.electricmeterbasestationid = electricmeterbasestationid;
        this.basestationnumber = basestationnumber;
        this.placethebasestation = placethebasestation;
        this.meterinstallationtime = meterinstallationtime;
        this.electricmeternumber = electricmeternumber;
        this.contacts = contacts;
        this.electricitymeterinit = electricitymeterinit;
        this.isservice = isservice;
        this.note = note;
        this.mainlyprovidedlinenumber = mainlyprovidedlinenumber;
        this.validity = validity;
        this.expirationdate = expirationdate;
    }

    public int getElectricmeterbasestationid() {
        return electricmeterbasestationid;
    }

    public void setElectricmeterbasestationid(int electricmeterbasestationid) {
        this.electricmeterbasestationid = electricmeterbasestationid;
    }

    public int getBasestationnumber() {
        return basestationnumber;
    }

    public void setBasestationnumber(int basestationnumber) {
        this.basestationnumber = basestationnumber;
    }

    public String getPlacethebasestation() {
        return placethebasestation;
    }

    public void setPlacethebasestation(String placethebasestation) {
        this.placethebasestation = placethebasestation;
    }

    public String getMeterinstallationtime() {
        return meterinstallationtime;
    }

    public void setMeterinstallationtime(String meterinstallationtime) {
        this.meterinstallationtime = meterinstallationtime;
    }

    public int getElectricmeternumber() {
        return electricmeternumber;
    }

    public void setElectricmeternumber(int electricmeternumber) {
        this.electricmeternumber = electricmeternumber;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public float getElectricitymeterinit() {
        return electricitymeterinit;
    }

    public void setElectricitymeterinit(float electricitymeterinit) {
        this.electricitymeterinit = electricitymeterinit;
    }

    public String getIsservice() {
        return isservice;
    }

    public void setIsservice(String isservice) {
        this.isservice = isservice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMainlyprovidedlinenumber() {
        return mainlyprovidedlinenumber;
    }

    public void setMainlyprovidedlinenumber(String mainlyprovidedlinenumber) {
        this.mainlyprovidedlinenumber = mainlyprovidedlinenumber;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    @Override
    public String toString() {
        return "electricmeterbasestation{" +
                "electricmeterbasestationid=" + electricmeterbasestationid +
                ", basestationnumber=" + basestationnumber +
                ", placethebasestation='" + placethebasestation + '\'' +
                ", meterinstallationtime='" + meterinstallationtime + '\'' +
                ", electricmeternumber=" + electricmeternumber +
                ", contacts='" + contacts + '\'' +
                ", electricitymeterinit=" + electricitymeterinit +
                ", isservice='" + isservice + '\'' +
                ", note='" + note + '\'' +
                ", mainlyprovidedlinenumber='" + mainlyprovidedlinenumber + '\'' +
                ", validity='" + validity + '\'' +
                ", expirationdate='" + expirationdate + '\'' +
                '}';
    }
}
