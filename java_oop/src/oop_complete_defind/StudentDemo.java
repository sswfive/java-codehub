package oop_complete_defind;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
        s1.setAge(30);
        s1.setName("ssw1");
        s1.show();

        Student s2 = new Student("ssw", 30);
        s2.show();


    }
}
