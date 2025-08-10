import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo{
    public static void main(String[] args) {
        Map<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.Monday, "rr");
        enumMap.put(Day.Tuesday, "kk");
        enumMap.put(Day.Friday, "dd");
        System.out.println(enumMap);
    }
}
//no hashing
//faster than hashmap
//memory efficient

enum Day {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
