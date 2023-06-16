package cn.itcast.annotation;

@MyAnno(show1 = 1)
//@MyAnno(value = 12, per = Person.P1, anno2 = @MyAnno2, strs = "bbb")
@MyAnno3
public class Worker {

    public String name = "aaa";
    public void show(){

    }
}
