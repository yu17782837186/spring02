package com.ning.test;

import com.ning.pojo.Airport;
import com.ning.service.impl.AirportServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] names = ac.getBeanDefinitionNames();
//        for (String name: names) {
//            System.out.println(name);
//        }
        AirportServiceImpl bean = ac.getBean("airportService", AirportServiceImpl.class);
        List<Airport> list = bean.show();
        System.out.println(list);
    }
}
