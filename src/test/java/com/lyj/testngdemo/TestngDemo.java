package com.lyj.testngdemo;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * 测试testng报告例子
 *
 * @author yingjie.liu
 * @create 2018-03-23 13:24
 **/
public class TestngDemo {
    private static Logger logger = Logger.getLogger(TestngDemo.class);
    @Test
    public void testDemo01(){
        logger.info("testDemo01......");
        System.out.println("testDemo01...");
    }
    @Test
    public void testDemo02(){
        logger.info("testDemo02......");
        System.out.println("testDemo02...");
    }
    @Test
    public void testDemo03(){
        logger.info("testDemo03......");
        System.out.println("testDemo03...");
    }
    @Test
    public void testDemo04(){
        logger.info("testDemo04......");
        System.out.println("testDemo04...");
    }
    @Test
    public void testDemo05(){
        logger.info("testDemo05......");
        System.out.println("testDemo05...");
    }
}
