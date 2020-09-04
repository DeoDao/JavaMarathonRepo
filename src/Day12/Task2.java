package Day12;
//2. Создать новый список, заполнить его четными числами
// от 0 до 30 и от 300 до 350. Вывести список.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            if (numbers.get(i) % 2 == 0) ;
            {
                numbers.add(i);

                System.out.println(numbers);
            }
        }
    }
}
