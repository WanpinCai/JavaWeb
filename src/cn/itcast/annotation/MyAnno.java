package cn.itcast.annotation;

/**
 * 自定义注解
 */
public @interface MyAnno {
    int show1();//抽象的方法定义为属性
    String name() default "zhang san";
/*    String show2();

    Person per();
    MyAnno2 anno2();

    String strs();*/
}
