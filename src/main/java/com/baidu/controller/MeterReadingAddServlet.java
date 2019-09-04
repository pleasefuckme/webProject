package com.baidu.controller;

import com.baidu.bean.QueryVo;
import com.baidu.bean.meterreading;
import com.baidu.service.MeterReadingService;
import com.google.gson.Gson;
import org.openxmlformats.schemas.drawingml.x2006.chart.STLegendPos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-21-9:49
 */
@Controller
@RequestMapping("/MeterReading")
public class MeterReadingAddServlet {

    @Autowired
    private MeterReadingService meterReadingService;

    @Autowired
    private Gson gson;

    @RequestMapping("/Add")
    @ResponseBody
    public String Add(meterreading meterreading){
        int issuccess = 0;
        try {
            issuccess = meterReadingService.Add(meterreading);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(issuccess);
        return ""+issuccess;
    }

    @RequestMapping("/Delete")
    @ResponseBody
    public String Delete(int meterreadingid) {
        int issuccess = 0;
        try {
            issuccess = meterReadingService.Delete(meterreadingid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuccess+"";
    }


    @RequestMapping("/QueryAll")
    @ResponseBody
    public List<meterreading> QueryAll() {
        List<meterreading> meterreadings = null;
        try {
            meterreadings = meterReadingService.QueryAll();
            System.out.println(meterreadings);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meterreadings;
    }
    @RequestMapping("/QueryByMore")
    @ResponseBody
    public List<meterreading> QueryByMore(QueryVo queryVo) {
        List<meterreading> meterreadings = null;
        if (!"".equals(queryVo.getCreatetime())){
            queryVo.setCreatetime("%"+queryVo.getCreatetime()+"%");
        }else {
            queryVo.setCreatetime(null);
        }
        if("".equals(queryVo.getMeterreadingway())){
            queryVo.setMeterreadingway(null);
        }
        try {
            meterreadings = meterReadingService.QueryByMore(queryVo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meterreadings;
    }
    @RequestMapping("/QueryLast")
    @ResponseBody
    public meterreading QueryLast() {
        meterreading meterreading = null;
        try {
             meterreading = meterReadingService.QueryLast();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(meterreading);
        return meterreading;
    }
    @RequestMapping("/Selects")
    @ResponseBody
    public ArrayList<List<QueryVo>> Selects() {
        ArrayList<List<QueryVo>> selects = null;
        try {
            selects = meterReadingService.Selects();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(selects);
        return selects;
    }
    @RequestMapping("/Update")
    @ResponseBody
    public String Update(meterreading meterreading) {
        int issuccess = 0;
        try {
            issuccess= meterReadingService.Update(meterreading);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuccess+"";
    }



}














