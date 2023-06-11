package com.mini.minispring.beans;

import com.mini.minispring.core.Resource;
import org.dom4j.Element;

/**
 * 将解析好的xml转换成BeanDefinition
 * @author codingxcong
 * @date 2023-06-11
 */
public class XmlBeanDefinitionReader {
    BeanFactory beanFactory;

    public XmlBeanDefinitionReader(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void loadBeanDefinitions(Resource resource) {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            String id = element.attributeValue("id");
            String className = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition(id, className);
            this.beanFactory.registerDefinition(beanDefinition);
        }
    }
}
