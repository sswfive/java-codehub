package oop_this;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("leon1");
        st.setAge(30);
        st.getAge();
        System.out.println("----");
        //st.setAge(-10);
        st.show();
    }
}
