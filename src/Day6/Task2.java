package Day6;

public class Task2 {
    public static void main(String[] args) {
        Plane Plane = new Plane();
        Plane.manufacturer = "Boeng";
        Plane.year = 2019;
        Plane.length = 50;
        Plane.weight = 50000;
        Plane.fuelVolumeInTank = 0;
    }
}

class Plane {
    String manufacturer;
    int year;
    int length;
    int weight;
    int fuelVolumeInTank;

    public Plane() {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuelVolumeInTank = fuelVolumeInTank;

    }

    void Info() {
        System.out.println(manufacturer + year + length + weight + fuelVolumeInTank);
    }

    void fillUp() {
        fuelVolumeInTank + dozapravka;
    }
}