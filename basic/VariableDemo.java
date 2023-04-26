package basic;/*
    基本数据类型：
        byte、short int long float double char boolean

    变量的使用：
        取值：变量名
        修改：变量名=变量值
 */

public class VariableDemo {
    public static void main(String[] args){
        // 定义变量
        int a = 5;

        // 输出变量
        System.out.println(a);

        //修改变量
        a = 6;
        System.out.println(a);

        byte b = 10;
        System.out.println(b);

        short c = 100;
        System.out.println(c);

        double d = 13.14;
        System.out.println(d);

        char e = 'a';
        System.out.println(e);

        boolean f = true;
        System.out.println(f);

        long g = 10000000000L;
        System.out.println(g);

        float h = 13.14F;
        System.out.println(h);

    }
}
