package indoor_demo;

public class ForDemo {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i<=5; i++){
            sum += i;
        }
        System.out.println("Sum: " + sum);

        int s = 0;
        for(int a=1; a<=100; a++){
            if(a % 2 == 0){
                s += a;
            }
        }
        System.out.println("100以内的偶数和为: " + s);

        // 判断水仙花数
        for(int t=100; t<1000; t++){
            int ge = t % 10;
            int shi = t / 10 % 10;
            int bai = t / 10 / 10 % 10;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == t){
                System.out.println("1000以内的水仙花数为：" + t);
            }
        }
    }
}

