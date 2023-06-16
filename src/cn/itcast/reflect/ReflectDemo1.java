package cn.itcast.reflect;

import cn.itcast.domain.Person;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {

        /**
         * 用于配置文件，读取文件，加载类
         */
        Class cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);

        /**
         * 多用于参数的传递
         */
        Class cls2 = Person.class;
        System.out.println(cls2);

        /**
         * 多用于对象获取字节码的方式
         */
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);

    }
}
