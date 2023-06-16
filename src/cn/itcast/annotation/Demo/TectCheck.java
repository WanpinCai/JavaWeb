package cn.itcast.annotation.Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 *
 * 当main方法执行后，会自动执行被检测的所有方法（加了注解的方法），判断方法是否有异常，记录到文件中
 */
public class TectCheck {
    public static void main(String[] args) throws IOException {

        Calculator c = new Calculator();

        //2，获取字节码文件对象
        Class cls = c.getClass();

        //3，获取所有方法
        Method[] methods = cls.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for(Method method : methods){
            //4，判断方法上是否有Check的注解
            if(method.isAnnotationPresent(Check.class)){
                //5，有，执行
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //6，捕获异常
                    //记录到文件中
                    number ++;

                    bw.write(method.getName()+"method is wrong");
                    bw.newLine();
                    e.printStackTrace();
                    bw.write("异常的名称:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("---------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现 "+number+" 次异常");

        bw.flush();
        bw.close();


    }
}
