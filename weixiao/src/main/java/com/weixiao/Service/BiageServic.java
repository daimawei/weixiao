package com.weixiao.Service;

import com.weixiao.Biage;
import com.weixiao.JdbcTemplateTest;

import javax.xml.soap.SOAPPart;

public class BiageServic extends JdbcTemplateTest {

    private Biage biage;

    public void setBiage(Biage biage) {
        this.biage = biage;
    }

    public int add(Biage biage){
        System.out.println("添加业务逻辑处理。。。");
        return add(biage);
    }
}

