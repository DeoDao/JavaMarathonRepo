package Day6;

public class Task2 {
    public static void main(String[] args) {
        Plane Plane = new Plane("Boeng", 50, 2000, 10000);
        Plane.setYear(2011);
        Plane.setLength(60);
        Plane.fillUp(2000);
        Plane.fillUp(4000);
    }
}

 class Plane {

            private String manufacturer;
            private int year;
            private int length;
            private int weight;
            private int fuelVolumeInTank;

            public Plane(String manufacturer, int year, int length, int weight) {
                this.manufacturer = manufacturer;
                this.year = year;
                this.length = length;
                this.weight = weight;
            }


            public String getManufacturer() {
                return manufacturer;
            }

            public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getFuelVolumeInTank() {
                return fuelVolumeInTank;
            }

            public void setFuelVolumeInTank(int fuelVolumeInTank) {
                this.fuelVolumeInTank = fuelVolumeInTank;
            }

            public void Info() {
                System.out.println("Изготовитель " + manufacturer + ", Год выпуска: " + year + ", Длина" + length + ", Вес " + weight + "Количество топлива в баке " + fuelVolumeInTank);
            }

            public void fillUp(int InputFuel) {
                fuelVolumeInTank = fuelVolumeInTank + InputFuel;
            }

        }
        // Ошибка по топливу
