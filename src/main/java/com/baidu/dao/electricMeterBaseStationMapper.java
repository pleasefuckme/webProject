package com.baidu.dao;

import com.baidu.bean.electricmeterbasestation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-25-21:00
 */
@Repository
public interface electricMeterBaseStationMapper {
    /**
     * 查询全部抄表信息
     *
     * @return
     */
    List<electricmeterbasestation> QueryAll();

    /**
     *  插入一条记录
     * @param  electricmeterbasestation
     * @return
     */
    int Add(electricmeterbasestation electricmeterbasestation);
    /**
          * 修改一条数据
          * @param electricmeterbasestation
          * @return
          */
    int Update(electricmeterbasestation electricmeterbasestation);

    /**
     //     * 通过主键删除一条记录
     //     * @param
     //     * @return
     //     */
    int Delete(int electricmeterbasestationid);

    List<electricmeterbasestation> QueryById(int basestationnumber);

//    /**
//     * 通过电表编号查询对应电表编号的最后一条抄表信息
//     *
//     * @param electricmeternumber
//     * @return
//     */
//    meterreading QueryLastByElectricMeterNumber(int electricmeternumber);
//
//
//    /**
//     * 查询最后一条数据
//     * @return
//     */
//    meterreading QueryLast();
//
//
//
//
//
//    /**
//     * 得到所有有记录的电表编号
//     * @return
//     */
//    List<QueryVo> getelectricmeternumbers();
//    /**
//     * 得到所有录入记录方式
//     * @return
//     */
//    List<QueryVo> getmeterreadingways();
//    /**
//     * 通过条件查询抄表信息
//     *
//     * @param queryVo
//     * @return
//     */
//    List<meterreading> QueryByMore(QueryVo queryVo);
}
