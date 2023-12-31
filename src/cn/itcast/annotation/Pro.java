package cn.itcast.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();
    String methodName();

    /*
    public class PeoImpl implements Pro{
        public String className(){
        return "cn.itcast.annotation.Demo1";
        }
        public String methodName(){
        return "show";
        }
    }
     */
}
