package Day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike Motorbike = new Motorbike(2020, "white", "Yamaha");
    }
}

class Motorbike{
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        System.out.println("Year 2020, color white, model Yamaha" );
        this.year = year;
        this.color = color;
        this.model = model;
    }
}