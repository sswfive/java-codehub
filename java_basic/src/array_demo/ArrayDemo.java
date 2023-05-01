package array_demo;
/*
    数组：是一种用于存储多个相同类型数据的存储结构
    定义：
        数据类型[] 数组名；
    初始化：
        动态初始化：
            初始化时只指定数组长度，由系统未数组分配初始值
            数据类型[] 变量名 = new 数据类型[数组长度]
        静态初始化
*/

import static jdk.nashorn.internal.objects.NativeMath.min;
import static sun.swing.MenuItemLayoutHelper.max;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("...Hello  Array...");
        System.out.println("...动态初始化数组...");
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("...数组取值与修改值...");
        arr[0] = 100;
        arr[2] = 200;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("...赋值给一个数组...");
        int[] arr2 = arr;
        System.out.println(arr2);
        arr2[2] = 333;
        System.out.println(arr[2]);

        System.out.println("...静态初始化数组...");
        int[] arr3 = {1,2,3};
        System.out.println(arr3);
        System.out.println(arr3[1]);
        System.out.println("...数组遍历...");
        int[] arr4 = {11,2,33,4,55};
        for(int i=0; i<arr4.length; i++){
            System.out.println(arr4[i]);
        }
        System.out.println("...数组最值...");
        int[] arr5 = {44,5,666,45};
        System.out.println(max(arr5));
        System.out.println(min(arr5));
    }
}
