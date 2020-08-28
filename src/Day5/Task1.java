package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car Car = new Car();
        Car.setYear(2015);
        Car.setColor("");
        Car.setModel("");
        System.out.println("" + Car.getYear());
        System.out.println("Black" + Car.getColor());
        System.out.println("Audi" + Car.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String CarColor) {
        color = CarColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String CarModel) {
        model = CarModel;
    }

    public String getModel() {
        return model;
    }
}


