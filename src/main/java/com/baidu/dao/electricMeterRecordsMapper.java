package com.baidu.dao;


import com.baidu.bean.electricmeterrecords;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-23-13:35
 */
@Repository
public interface electricMeterRecordsMapper {
    /**
     *  通过id查询电表
     * @param electricmeternumber
     * @return
     */
    List<electricmeterrecords> QueryById(int electricmeternumber);
}
