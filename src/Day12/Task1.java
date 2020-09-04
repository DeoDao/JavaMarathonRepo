package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> Cars = new ArrayList<>();
        Cars.add ("car1");
        Cars.add ("car2");
        Cars.add ("car3");
        Cars.add ("car4");
        Cars.add ("car5");
        Cars.add(2,"car K");
        Cars.remove(0);
        System.out.println(Cars);
    }
}
