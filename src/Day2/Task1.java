package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество этажей");
        {
            int x = s.nextInt();

            if (x > 0 && x < 4){
                System.out.println("Малоэтажный дом");
            }if (x > 4 && x < 9){
                System.out.println("Среднеэтажный дом");
            }if (x > 9){
                System.out.println("Многоэтажный дом");
            }if (x < 0){
                System.out.println("Введено не верное значение количества этажей");
            }
        }
    }
}