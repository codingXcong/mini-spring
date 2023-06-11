package com.mini.minispring.beans;

/**
 * @author codingxcong
 * @date 2023-06-11
 */
public interface BeanFactory {
    Object getBean(String beanName) throws NoSuchBeanDefinitionException;
    void registerDefinition(BeanDefinition beanDefinition);
}
