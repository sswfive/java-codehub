package oop_this;

public class Student {
    //String name;
    //int age;
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        //age = a;
        if(age>100 || age<0){
            System.out.println("你输入的年龄有误，请重新输入。。。");
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }


    public void show(){
        System.out.println(name + ',' + age);
    }
}
