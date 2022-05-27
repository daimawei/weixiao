package com.weixiao.Service.lmpl;

import com.weixiao.Pc;
import com.weixiao.Service.PcService;
import com.weixiao.dao.PcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//标记这个类为spring容器的bean
@Component("PcService")
public class PcServiceImpl implements PcService {

    //自动装配
    @Autowired
    private PcService pcService;


    //方法重写
    @Override
    public List<Pc> selectPcByName(Pc pc) {
        return pcService.selectPcByName(pc);
    }
}




