package Day7;

class Plane {
    private int length;

    public Plane(int length) {
        this.length = length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public static void compareAirplanes(Plane airplane1, Plane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) ;
        System.out.println("Первый самолёт длинее");
    if ( airplane1.getLength() < airplane2.getLength()){
        System.out.println("Второй самолёт длинее");
    }else{
        System.out.println("Длины самолётов равны");
}
}
}

