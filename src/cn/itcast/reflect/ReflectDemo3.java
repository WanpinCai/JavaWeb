package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        /**
         * 1,获取构造方法们
         */
        Class personClass = Person.class;

        Constructor constructor = personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("zhang san",23);
        System.out.println(person);

        System.out.println("----------");
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);

//        constructor1.setAccessible(true);

    }
}
