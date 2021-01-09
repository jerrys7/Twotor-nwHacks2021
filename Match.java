import java.util.Set;

public class Match {
    private Person p;
    private Set<String> courseToTeach;
    private Set<String> courseToLearn;
    private Set<Pair> pairs;

    public Match(Person p, Set<String> courseToTeach, Set<String> courseToLearn, Set<Pair> pairs) {
        this.p = p;
        this.courseToLearn = courseToLearn;
        this.courseToTeach = courseToTeach;
        this.pairs = pairs;
    }

    public void makePairs() {
        for (String course1 : courseToTeach) {
            for (String course2 : courseToLearn) {
                if (course1.equals(course2)) {
                    Pair p = new Pair(course1, course2);
                    pairs.add(p);
                }
            }
        }
    }

}
