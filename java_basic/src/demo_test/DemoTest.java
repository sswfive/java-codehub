package demo_test;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
        /*while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入星期数: ");
            int week = sc.nextInt();
            if (week < 1 || week > 7) {
                System.out.println("输入的星期数错误，请重新输入！！！");
            } else if (week == 1) {
                System.out.println("今天是周" + week + ", 活动是：跑步");
            } else if (week == 2) {
                System.out.println("今天是周" + week + ", 活动是：游泳");
            } else if (week == 3) {
                System.out.println("今天是周" + week + ", 活动是：慢跑");
            } else if (week == 4) {
                System.out.println("今天是周" + week + ", 活动是：动感单车");
            } else if (week == 5) {
                System.out.println("今天是周" + week + ", 活动是：拳击");
            } else if (week == 6) {
                System.out.println("今天是周" + week + ", 活动是：爬山");
            } else {
                System.out.println("今天是周" + week + ", 活动是：好好吃一顿");
            }
        }*/

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入星期数: ");
            int week = sc.nextInt();
            switch (week){
                case 1:
                    System.out.println("今天是周" + week + ", 活动是：跑步");
                    break;
                case 2:
                    System.out.println("今天是周" + week + ", 活动是：游泳");
                    break;
                case 3:
                    System.out.println("今天是周" + week + ", 活动是：慢跑");
                    break;
                case 4:
                    System.out.println("今天是周" + week + ", 活动是：动感单车");
                    break;
                case 5:
                    System.out.println("今天是周" + week + ", 活动是：拳击");
                    break;
                case 6:
                    System.out.println("今天是周" + week + ", 活动是：爬山");
                    break;
                case 7:
                    System.out.println("今天是周" + week + ", 活动是：好好吃一顿");
                    break;
                default:
                    System.out.println("输入的星期数错误，请重新输入！！！");
            }
        }
    }

}
