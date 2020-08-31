package Day6;

public class Task1 {
    public static void main(String[] args) {
        Car Car = new Car();
        Car.year = 2000;
        Car.color = "black";
        Car.model = "Audi";
        Car.speak();
        int yearCar = Car.calculateYearsDifference();
        System.out.println("Year difference is "+yearCar);
        Motorbike Motorbike = new Motorbike();
        Motorbike.year = 2010;
        Motorbike.color = "white";
        Motorbike.model = "Yamaha";
        Motorbike.speak();
        int yearMotorbike = Motorbike.calculateYearsDifference();
        System.out.println("Year difference is "+yearMotorbike);
    }
}

class Car {
    int year;
    String color;
    String model;

    void speak() {
        System.out.println("This is car");
    }

    int calculateYearsDifference() {
        int years = 2015 - year;
        return years;
    }
}

class Motorbike {
    int year;
    String color;
    String model;

    void speak() {
        System.out.println("This is Motorbike");
    }

    int calculateYearsDifference() {
        int years = 2020 - year;
        return years;
    }
}


