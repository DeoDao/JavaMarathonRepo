package Day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";
        long before = System.currentTimeMillis();
        for (int i=0; i<= 20000; i++)
            numbers += i + " ";
        long after = System.currentTimeMillis();
        System.out.print("Время выполнения цикла с классом StringBuilder: " + (after-before));
        System.out.print(numbers);

        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<= 20000; i++)

        sb.append(i).append(" ");
        after = System.currentTimeMillis();
        System.out.print("Время выполнения цикла с классом StringBuilder: " + (after-before));
        System.out.print(sb);
}
}


