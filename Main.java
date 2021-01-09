import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("calc", 100);
        m.put("chem", 69);
        Map<String, Integer> m2 = new HashMap<>();
        m.put("english", 90);
        m.put("bio", 95);
        Set<String> s = new HashSet<>();
        s.add("calc");
        s.add("chem");
        Set<String> s2 = new HashSet<>();
        s2.add("english");
        s2.add("bio");
        Set<String> coursesInterested = new HashSet<>();
        s.add("english");
        Set<String> coursesInterested2 = new HashSet<>();
        s.add("calc");
        Person a = new Person("jerry", "sun", 10, 12, m, s, "bmss",
                coursesInterested, true, 5);
        Person b = new Person("Eric", "Zhou", 12, 13, m2, s2, "ubc",
                coursesInterested2, true, 4.9);
    }
}
