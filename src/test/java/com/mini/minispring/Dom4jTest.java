package com.mini.minispring;
import java.net.URL;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * https://blog.csdn.net/qq_37855749/article/details/127197625
 * @author codingxcong
 * @date 2023-06-10
 */
public class Dom4jTest {

    @Test
    public void test() {
        System.out.println(System.getProperty("user.dir"));

        Document doc = loadXml("./example.xml");
        readNodeInfo(doc);
    }

    // 加载xml文件
    public static Document loadXml(String xmlFilePath) {
        SAXReader saxReader = new SAXReader();
        try {
            return saxReader.read(xmlFilePath);
        } catch (Exception e) {
            throw new RuntimeException("load xml error", e);
        }
    }

    // 读取节点信息
    public static void readNodeInfo(Document doc) {
        Element rootElement = doc.getRootElement();
        // 获取根节点名称
        System.out.println("Root Element Name : " + rootElement.getName());

        // 遍历子节点
        List<Element> childElements = rootElement.elements();
        for (Element child : childElements) {
            System.out.println("Child Element Name : " + child.getName()
                    + ", Text : " + child.getTextTrim());
        }
    }
}



