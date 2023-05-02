package oop_private;

public class Student {
    String name;
    //int age;
    private int age;

    public void setAge(int a) {
        //age = a;
        if(a>100 || a<0){
            System.out.println("你输入的年龄有误，请重新输入。。。");
        }else{
            age = a;
        }
    }

    public int getAge(){
        return age;
    }


    public void show(){
        System.out.println(name + ',' + age);
    }
}
