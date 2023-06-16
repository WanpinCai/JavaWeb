package cn.itcast.annotation;


import java.util.Date;

@SuppressWarnings("all")//压制所有的警告
public class AnnoDemo2 {

    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated//表示内容已过时，但不删除，仍可使用
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //替代show1的方法
    }
    public void demo(){
        show1();
        Date date = new Date();
    }

}
