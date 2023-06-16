package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化方法
     * 用于资源申请，所有测试方法在自信之前都会测试该方法
     */
    @Before
    public void init(){
        System.out.println("init....");
    }
    /**
     * 释放资源方法
     * 在所有测试方法执行后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close");
    }
    /**
     * test add method
     */

    @Test
    public void testAdd(){
//        System.out.println("I am excuted");
        Calculator c = new Calculator();
        int result = c.add(1,2);
        System.out.println(result);
        //断言操作
        Assert.assertEquals(3,result);
    }

    @Test
    public void testSub(){
//        System.out.println("I am excuted");
        Calculator c = new Calculator();
        int result = c.sub(1,2);
        System.out.println("testSub...");
        //断言操作
        Assert.assertEquals(-1,result);
    }
}
