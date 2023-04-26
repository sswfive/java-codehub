package basic;

public class OperationDemo {
    public static void main(String[] args){
          int a = 10;
          int b = 3;

          System.out.println(a + b);
          System.out.println(a - b);
          System.out.println(a / b);
          System.out.println(a % b);
          // 除法得到的事商 取余得到的是余数

        // 整数相除只能得到整数，要得到小叔，必须有浮点数
          System.out.println(10.0 / 3);

          int c = 10;
          char d = 'A';
          // d = 'a';
          // d = '0';
          System.out.println(c + d);

          // char ch = c + d;
          int j = c + d;
          System.out.println(j);

           //int k = 10 +3.14;  // char 类型会被自动提升为int类型
          double f = 10 +13.4;



    }
}
