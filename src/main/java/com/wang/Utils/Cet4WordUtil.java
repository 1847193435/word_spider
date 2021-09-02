package com.wang.Utils;

import com.wang.entity.Cet4Word;
import com.wang.service.Cet4WordService;
import com.wang.service.impl.Cet4WordServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cet4WordUtil {
    public static void addCet4Word(Cet4Word cet4Word){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Cet4WordService cet4WordService = context.getBean(Cet4WordServiceImpl.class);
        int i = cet4WordService.insertCet4Word(cet4Word);
        if (i<=0){
            System.out.println("datasource error");
        }
    }
}
