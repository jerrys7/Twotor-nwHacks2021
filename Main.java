import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("calc", 100);
        m.put("chem", 69);
        Set<String> s = new HashSet<>();
        s.add("calc");
        s.add("chem");
        Set<String> coursesInterested = new HashSet<>();
        s.add("english");
        Person a = new Person("jerry", "sun", 10, 12, m, s, "bmss",
                coursesInterested, true, 5);

    }
}
