package oop_construct_method;

public class StudentDemo {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.show();
        Student st2 = new Student("james");
        st2.show();
        Student st3 = new Student(25);
        st3.show();
        Student st4 = new Student("ssw", 29);
        st4.show();
    }
}
