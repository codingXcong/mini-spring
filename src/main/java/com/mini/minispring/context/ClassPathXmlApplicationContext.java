package com.mini.minispring.context;

import com.mini.minispring.beans.*;
import com.mini.minispring.core.ClassPathXmlResource;
import com.mini.minispring.core.Resource;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author codingxcong
 * @date 2023-06-09
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

    private BeanFactory beanFactory;

    //构造器获取外部配置，解析出Bean的定义，形成内存映像
    public ClassPathXmlApplicationContext(String fileName) {
        Resource resource = new ClassPathXmlResource(fileName);
        BeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        this.beanFactory = beanFactory;
    }

    @Override
    public Object getBean(String beanName) throws NoSuchBeanDefinitionException {
        return this.beanFactory.getBean(beanName);
    }

    @Override
    public void registerDefinition(BeanDefinition beanDefinition) {
        this.beanFactory.registerDefinition(beanDefinition);
    }

}
