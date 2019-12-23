package com.shenruan.factory;

import java.util.ResourceBundle;

/**
 * 读取配置文件,反射创建对象,返回创建对象(支持任何类型的)
 */
public class BeanFactory {
    private static ResourceBundle bundle;
    //实例化bundle
    static{
        bundle=ResourceBundle.getBundle("bean");
    }
    /**
     * 根据传入参数,在配置文件中获取全限定类名,并且反射创建对象,返回
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        try {
            String beanPath = bundle.getString(beanName);
            return Class.forName(beanPath).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
