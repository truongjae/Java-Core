package Annotation;

import Annotation.Converter.Demo1;

@MyAnnotation
public class Demo {
    private String name;
    private Integer age;
    private Boolean sex;

    public Demo1 getDemo1() {
        return demo1;
    }

    public void setDemo1(Demo1 demo1) {
        this.demo1 = demo1;
    }

    private Demo1 demo1;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", demo1=" + demo1 +
                '}';
    }
}
