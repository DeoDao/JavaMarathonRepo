package Day2;

import java.util.Scanner;

public class Task3 {
    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = s.nextInt();
        System.out.println("Введите второе число");
        int b = s.nextInt();
        System.out.printf("Первое число: %d, второе число: %d", a, b);
        int i = a;
        while(i <= b){
            if (i % 5 ==0 && i % 10 !=0 && i !=a && i !=b) {
                System.out.println(i);
            }
            i = i+1;
        }
    }
}
