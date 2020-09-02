package Day8;


public class Airplane {

        private String manufacturer;
        private int year;
        private int length;
        private int weight;


        public Airplane(String manufacturer, int year, int length, int weight) {
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


    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }
}
