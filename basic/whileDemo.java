package basic;

public class whileDemo {
    public static void main(String[] args){

        System.out.println("----for----");
        for(int i=1; i<=5; i++){
            System.out.println("HelloWorld");
        }
        System.out.println("----while----");
        int j = 1;
        while(j <= 5) {
            System.out.println("helloworld");
            j++;
        }

        System.out.println("----对折纸张----");
        int count = 0;
        double paper = 0.1;
        int mt = 8844430;
        while(paper <= mt){
            paper *= 2;
            count++;
        }
        System.out.println("对折的次数：" + count);

        System.out.println("----do...while----");
        int w = 1;
        do {
           System.out.println("Hello World");
           w++;
        }while(w <= 5);
    }
}
