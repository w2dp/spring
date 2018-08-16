package com.w2dp.one;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * .
 * Created by liuying on 2018/8/16.
 */
public class BeanFactoryTest {


    @Test
    public void testBean(){
        BeanFactory bf= new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");

        System.out.println(myTestBean.getTestStr());
    }
}
