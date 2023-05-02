package oop_construct_method;

public class Student {
    private String name;
    private int age;

    //构造方法,本质上使用的是重载的机制
    public Student() {
    }  //无参构造方法

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + ',' + age);
    }
}
