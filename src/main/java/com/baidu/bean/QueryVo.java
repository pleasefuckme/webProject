package com.baidu.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-18-13:29
 */
@Component
public class QueryVo {
    private int electricmeternumber;
    private String meterreadingway;
    private String createtime;




    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }


    public QueryVo() {
    }

    public QueryVo(int electricmeternumber, String meterreadingway) {
        this.electricmeternumber = electricmeternumber;
        this.meterreadingway = meterreadingway;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "electricmeternumber=" + electricmeternumber +
                ", meterreadingway='" + meterreadingway + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public int getElectricmeternumber() {
        return electricmeternumber;
    }

    public void setElectricmeternumber(int electricmeternumber) {
        this.electricmeternumber = electricmeternumber;
    }

    public String getMeterreadingway() {
        return meterreadingway;
    }

    public void setMeterreadingway(String meterreadingway) {
        this.meterreadingway = meterreadingway;
    }
    //    @Resource(name = "user")
//    private User user;
//    private List<Integer> ids;
//
//    public List<Integer> getIds() {
//        return ids;
//    }
//
//    public void setIds(List<Integer> ids) {
//        this.ids = ids;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
