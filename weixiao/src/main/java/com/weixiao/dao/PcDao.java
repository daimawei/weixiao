package com.weixiao.dao;

import com.weixiao.Pc;
import org.springframework.stereotype.Repository;

import java.util.List;

//指定仓库
@Repository("pcDao")
public interface PcDao {


    //查询数据信息列表
    List<Pc>selectPcByName(Pc pc);
}



