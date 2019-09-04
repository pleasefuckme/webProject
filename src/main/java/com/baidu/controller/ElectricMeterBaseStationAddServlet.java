package com.baidu.controller;

import com.baidu.bean.electricmeterbasestation;
import com.baidu.service.ElectricMeterBaseStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-21-9:49
 */
@Controller
@RequestMapping("/ElectricMeterBaseStation")
public class ElectricMeterBaseStationAddServlet extends HttpServlet {

    @Autowired
    private ElectricMeterBaseStationService electricMeterBaseStationService;

    /**
     *
     * @param electricmeterbasestation
     */
    @RequestMapping("/Add")
    @ResponseBody
    public String Add( electricmeterbasestation electricmeterbasestation) {
        try {
            int issuccess = electricMeterBaseStationService.Add(electricmeterbasestation);
            return issuccess+"";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "0";
    }

    @RequestMapping("/Delete")
    @ResponseBody
    public String Delete(@RequestParam("electricmeterbasestationid") int electricmeterbasestationid){
        int issuccess = 0;
        try {
            issuccess = electricMeterBaseStationService.Delete(electricmeterbasestationid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuccess+"";
    }
    @RequestMapping("/QueryAll")
    @ResponseBody
    public List<electricmeterbasestation> QueryAll(){
        List<electricmeterbasestation> electricmeterbasestations = null;
        try {
            electricmeterbasestations = electricMeterBaseStationService.QueryAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return electricmeterbasestations;
    }
    @RequestMapping("/QueryByNumber")
    @ResponseBody
    public List<electricmeterbasestation> QueryByNumber(@RequestParam("basestationnumber") int basestationnumber){
        List<electricmeterbasestation> electricmeterbasestations = null;
         electricmeterbasestations = electricMeterBaseStationService.QueryById(basestationnumber);
        return electricmeterbasestations;
    }
    @RequestMapping("/Update")
    @ResponseBody
    public String Update( electricmeterbasestation electricmeterbasestation){
        int issuccess=0;
        try {
            issuccess = electricMeterBaseStationService.Update(electricmeterbasestation);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return issuccess+"";
    }

}
