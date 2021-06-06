import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars);
//     }
// }


public class Main {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();
        for (String word : args)
            s.add(word);
        System.out.println(s);
    }
}
