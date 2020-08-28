package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLenght = scanner.nextInt();

        Random random = new Random();
        int [] array = new int [arrayLenght];


        for(int i = 0; i<array.length; i++)
            array[i] = random.nextInt(10);

            System.out.println(Arrays.toString(array));

        System.out.println(arrayLenght);
        int counter8 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>8)
                counter8++;
        }
        System.out.println(counter8);
        int counter1 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]==1)
                counter1++;}
            System.out.println(counter1);

    int counter0dd = 0;
        for (int i = 0; i < array.length; i++){
        if (array[i]% 2!=0)
            counter0dd++;}

        System.out.println(counter0dd);
            int counterEven = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0)
                    counterEven++;
            }
                System.out.println(counter0dd);

                int sum = 0;
                for (int i = 0; i<arrayLenght; i++){
                    sum+=array[i];
                    System.out.println(sum);
                }

            }
        }






