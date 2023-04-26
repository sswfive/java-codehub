package basic;

public class ConversionDemo {
    public static void main(String[] args){
        // 自动类型转换
        double a = 10;
        System.out.println(a);

        byte b = 10;
        short c = b;
        int d = b;

//        char e = b;  //类型不兼容

        // 强制类型转换
        int k = (int)66.66;
    }
}
