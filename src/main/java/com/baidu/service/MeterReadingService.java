package com.baidu.service;

import com.baidu.bean.QueryVo;
import com.baidu.bean.electricmeterrecords;
import com.baidu.bean.meterreading;
import com.baidu.dao.electricMeterRecordsMapper;
import com.baidu.dao.meterReadingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-21-18:32
 */
@Service
public class MeterReadingService {

    @Autowired
    private electricMeterRecordsMapper electricMeterRecordsMapper;
    @Autowired
    private meterReadingMapper meterReadingMapper;


    /**
     * Service层查询meterreading(抄表)表全部
     *
     * @return json字符串
     * @throws IOException
     */
    public List<meterreading> QueryAll() throws IOException {
        List<meterreading> meterreadings = meterReadingMapper.QueryAll();
        System.out.println(meterreadings);
        return meterreadings;
    }

    /**
     *  Service层添加一条符合要求的记录
     * @param meterreading
     * @return
     * @throws IOException
     */
    public int Add(meterreading meterreading) throws IOException {
        int issuccess = 0;
        //获得电表编号
        List<electricmeterrecords> electricmeterrecords = electricMeterRecordsMapper.QueryById(meterreading.getElectricmeternumber());
        //判断电表是否存在
        if (!electricmeterrecords.isEmpty()) {
            //判断是否查到数据
            meterreading meterreading1 = meterReadingMapper.QueryLastByElectricMeterNumber(meterreading.getElectricmeternumber());
            if (meterreading1 != null) {
//                上次的本次表数
                float nowmeternumber = meterreading1.getNowmeternumber();
//                本次的上次表数
                float lastmeternumber = meterreading.getLastmeternumber();
                //存在则比对电表两次字数
                if ( lastmeternumber== nowmeternumber) {
                    meterreading.setCreater("tom");
                    meterreading.setCreateway("byhand");
                    meterreading.setMeterreadingway("hand");
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String s = dateTimeFormatter.format(LocalDateTime.now());
                    System.out.println(s);
                    meterreading.setCreatetime(s);
                    issuccess = meterReadingMapper.Add(meterreading);
                    return issuccess;
                } else{
                    //电表字数不匹配
                    return -2;
                }


            } else {
                meterreading.setCreater("tom");
                meterreading.setCreateway("byhand");
                meterreading.setMeterreadingway("hand");
                String s = DateTimeFormatter.ofPattern("yyyy-MM-DD").format(LocalDateTime.now());
                meterreading.setCreatetime(s);
                issuccess = meterReadingMapper.Add(meterreading);
                return issuccess;
            }

        } else {
            //电表不存在
            return -1;
        }
//        int electricmeternumber = meterreading.getElectricmeternumber();
//
//        float lastmeternumber = meterreading.getLastmeternumber();

    }

    /**
     * Service层查询最后一条记录
     * @return
     * @throws IOException
     */
    public meterreading QueryLast() throws IOException {
        meterreading meterreading = meterReadingMapper.QueryLast();
        return meterreading;
    }

    /**
     * Service层修改一条记录
     * @param meterreading
     * @return
     * @throws IOException
     */
    public int Update(meterreading meterreading) throws IOException {
        int issuccess = 0;
        //获得电表编号
        List<electricmeterrecords> electricmeterrecords = electricMeterRecordsMapper.QueryById(meterreading.getElectricmeternumber());
        //判断电表是否存在
        if (!electricmeterrecords.isEmpty()) {
            //判断是否查到数据
            meterreading meterreading1 = meterReadingMapper.QueryLastByElectricMeterNumber(meterreading.getElectricmeternumber());
            if (meterreading1 != null) {
//                上次的本次表数
//                本次的上次表数
                //存在则比对电表两次字数
                meterreading.setUpdater("batty");
                String s = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now());
                meterreading.setUpdatetime(s);
                issuccess = meterReadingMapper.Update(meterreading);
                    return issuccess;
            } else {
                return issuccess;
            }

        } else {
            //电表不存在
            return -1;
        }
    }

    /**
     * 删除一条记录
     * @param meterreadingid
     * @return
     * @throws IOException
     */
    public int Delete(int meterreadingid) throws IOException {
        int issuccess = 0;
        issuccess = meterReadingMapper.Delete(meterreadingid);
        return issuccess;
    }
    public int upload(List<meterreading> list){
        int issuccess = 0;
            issuccess = meterReadingMapper.upload(list);
        return issuccess;
    }

    public ArrayList<List<QueryVo>> Selects() throws IOException {
        ArrayList<List<QueryVo>> queryVos = new ArrayList<>();
        List<QueryVo> list1 = meterReadingMapper.getelectricmeternumbers();
        List<QueryVo> list2 = meterReadingMapper.getmeterreadingways();
        queryVos.add(list1);
        queryVos.add(list2);
        return queryVos;
    }

    public List<meterreading> QueryByMore(QueryVo queryVo) throws IOException {
        List<meterreading> meterreadings = meterReadingMapper.QueryByMore(queryVo);
        return meterreadings;
    }
}
