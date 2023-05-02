package Method_demo;


public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();
        getMax();
        System.out.println("---带参数的方法---");
        isEvenNumber2(5);
        isEvenNumber2(18);
        getMax1(10, 30);
        getMax1(10, 5);
        System.out.println("---带返回值的方法---");
        boolean a = isEvenNumber3(3);
        boolean b = isEvenNumber3(6);
        System.out.println(a);
        System.out.println(b);
        System.out.println("---方法类型void---");
        method1();
        method2();
        method3();
        System.out.println("---方法的重载---");
        /*
            方法重载和返回值无关
        */
        int res1 = sum(10, 20);
        System.out.println(res1);
        double res2 = sum(10.0, 15.0);
        System.out.println(res2);
        int res3 = sum(1,2,3);
        System.out.println(res3);
        System.out.println("---方法的重载compare---");
        System.out.println(compare(10, 20));
        System.out.println(compare((byte)10, (byte)10));
        System.out.println(compare(10L, 15L));


    }

    public static void isEvenNumber() {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void isEvenNumber2(int number) {
        if (number % 2 == 0) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static boolean isEvenNumber3(int number){
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void getMax() {
        int a = 25;
        int b = 20;
        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }
    }

    public static void getMax1(int a, int b){
        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }
    }

    public static void method1(){
        System.out.println("void方法可以return 空");
        return;
    }
    public static void method2(){
        System.out.println("void 方法没有返回值");
    }
    public static void method3(){
        System.out.println("void 方法若有返回值将报错");
//        return 1;
    }

    public static int sum(int a, int b){
        System.out.println("---exec int---");
        return a + b;
    }

    public static double sum(double a, double b){
        System.out.println("---exec double---");
        return a + b;
    }
    public static int sum(int a, int b, int c){
        System.out.println("---exec int---");
        return a + b + c;
    }

    public static boolean compare(int a, int b){
        System.out.println("---exec int---");
        return a == b;
    }

    public static boolean compare(long a, long b){
        System.out.println("---exec long---");
        return a == b;
    }

    public static boolean compare(byte a, byte b){
        System.out.println("---exec byte---");
        return a == b;
    }




}
