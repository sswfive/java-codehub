package oop_basic;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "xiaoming";
        st.age = 18;
        System.out.println(st.name);
        System.out.println(st.age);
        st.study();
        st.doHomeWork();
    }
}
