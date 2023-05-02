package arraylist_demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("python");

        array.add(1, "java");
        System.out.println("array: " + array);
        System.out.println("size:" + array.size());
        array.remove("java");
        System.out.println("array: " + array);
        array.set(2, "go");
        System.out.println("array: " + array);
    }

}
