package com.example.madrassa_app;


public class Student {
    private String name;

    private String class1;

    private String age;

    public Student(String name, String class1,String age) {
        this.name = name;
        this.class1=class1;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ",class1="+class1+",age="+age+"]";
    }

}
