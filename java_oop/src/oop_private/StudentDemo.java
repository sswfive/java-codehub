package oop_private;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "leon";
        st.setAge(30);
        st.getAge();
        System.out.println("----");
        st.setAge(-10);
        st.show();
    }
}
