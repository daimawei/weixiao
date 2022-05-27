package com.weixiao.Test;


import com.weixiao.Biage;
import com.weixiao.JdbcTemplateTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcTemplateTest BiageService = context.getBean("biageService",JdbcTemplateTest.class);


        Biage b1 = new Biage();
        for(int i =0; i <= 10000; i++){

            b1.setName("小明");
            b1.setType("程序员");
            b1.setSchool("修真院");

            System.out.println(i);
        }


        BiageService.add(b1);


    }
}
