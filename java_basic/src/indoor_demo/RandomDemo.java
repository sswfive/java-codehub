package indoor_demo;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args){
        Random r = new Random();
        int num = r.nextInt(100);
            //System.out.println(num);

        /*
        for(int i=0; i<10; i++){
            int a = r.nextInt(10);
            System.out.println("number: " + num);
        }
         */

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入你需要猜的数：");
            int guessNumber = sc.nextInt();
            if(guessNumber < num){
                System.out.println("你猜的数字：" + guessNumber + "小了");
            }else if(guessNumber > num){
                System.out.println("你猜的数字：" + guessNumber + "大了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }

        }
    }
}

