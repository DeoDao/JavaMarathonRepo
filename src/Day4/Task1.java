package Day4;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = new int [10];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
    }
}
}