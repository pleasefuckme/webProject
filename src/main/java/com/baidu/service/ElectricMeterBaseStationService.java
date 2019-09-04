package com.baidu.service;

import com.baidu.bean.electricmeterbasestation;
import com.baidu.bean.electricmeterrecords;
import com.baidu.dao.electricMeterBaseStationMapper;
import com.baidu.dao.electricMeterRecordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-21-18:32
 */
@Service
public class ElectricMeterBaseStationService {
    @Autowired
    private electricMeterBaseStationMapper electricMeterBaseStationMapper;
    @Autowired
    private electricMeterRecordsMapper electricMeterRecordsMapper;

    /**
     * Service层查询meterreading(抄表)表全部
     *
     * @return json字符串
     * @throws IOException
     */
    public List<electricmeterbasestation> QueryAll() throws IOException {
        List<electricmeterbasestation> electricmeterbasestations = electricMeterBaseStationMapper.QueryAll();
        return electricmeterbasestations;
    }



    /**
     *  Service层添加一条符合要求的记录
     * @param electricmeterbasestation
     * @return
     * @throws IOException
     */
    public int Add(electricmeterbasestation electricmeterbasestation) throws IOException {
        int issuccess = 0;
        //获得电表编号
        List<electricmeterrecords> electricmeterrecords = electricMeterRecordsMapper.QueryById(electricmeterbasestation.getElectricmeternumber());
        //判断电表是否存在
        if (!electricmeterrecords.isEmpty()) {
                    issuccess = electricMeterBaseStationMapper.Add(electricmeterbasestation);
                    return issuccess;
        } else {
            //电表不存在
            return -1;
        }
    }
    /**
          * Service层修改一条记录
          * @param electricmeterbasestation
          * @return
          * @throws IOException
          */
    public int Update(electricmeterbasestation electricmeterbasestation) throws IOException {
        int issuccess = 0;
        //获得电表编号
        List<electricmeterrecords> electricmeterrecords = electricMeterRecordsMapper.QueryById(electricmeterbasestation.getElectricmeternumber());
        //判断电表是否存在
        if (!electricmeterrecords.isEmpty()) {
                issuccess = electricMeterBaseStationMapper.Update(electricmeterbasestation);
                    return issuccess;
        } else {
            //电表不存在
            return -1;
        }
    }
    /**
          * 删除一条记录
          * @param electricmeterbasestationid
          * @return
          * @throws IOException
          */
    public int Delete(int electricmeterbasestationid) throws IOException {
        int issuccess = 0;
        issuccess = electricMeterBaseStationMapper.Delete(electricmeterbasestationid);
        return issuccess;
    }

    public List<electricmeterbasestation> QueryById(int basestationnumber){
        System.out.println(basestationnumber);
        List<electricmeterbasestation> electricmeterbasestations = electricMeterBaseStationMapper.QueryById(basestationnumber);
        System.out.println(electricmeterbasestations);
        return electricmeterbasestations;
    }
}
