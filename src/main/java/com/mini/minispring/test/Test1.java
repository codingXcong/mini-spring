package com.mini.minispring.test;

import com.mini.minispring.beans.NoSuchBeanDefinitionException;
import com.mini.minispring.context.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) throws NoSuchBeanDefinitionException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService)ctx.getBean("aservice");
        aService.sayHello();
    } 
} 