package com.baidu.dao;


import com.baidu.bean.QueryVo;
import com.baidu.bean.meterreading;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-21-11:04
 */
@Repository
public interface meterReadingMapper {
    /**
     * 查询全部抄表信息
     *
     * @return
     */
    List<meterreading> QueryAll();




    /**
     * 通过电表编号查询对应电表编号的最后一条抄表信息
     *
     * @param electricmeternumber
     * @return
     */
    meterreading QueryLastByElectricMeterNumber(int electricmeternumber);

    /**
     *  插入一条记录
     * @param meterreading
     * @return
     */
    int Add(meterreading meterreading);

    /**
     * 查询最后一条数据
     * @return
     */
    meterreading QueryLast();

    /**
     * 修改一条数据
     * @param meterreading
     * @return
     */
    int Update(meterreading meterreading);

    /**
     * 通过主键删除一条记录
     * @param meterreadingid
     * @return
     */
    int Delete(int meterreadingid);

    /**
     * 得到所有有记录的电表编号
     * @return
     */
    List<QueryVo> getelectricmeternumbers();
    /**
     * 得到所有录入记录方式
     * @return
     */
    List<QueryVo> getmeterreadingways();
    /**
     * 通过条件查询抄表信息
     *
     * @param queryVo
     * @return
     */
    List<meterreading> QueryByMore(QueryVo queryVo);


    int upload(List<meterreading> list);
}
