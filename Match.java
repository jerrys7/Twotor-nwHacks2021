import java.util.Set;

public class Match {
    private Person p;
    private Set<String> courseToTeach;
    private Set<String> courseToLearn;

    public Match(Person p, Set<String> courseToTeach, Set<String> courseToLearn) {
        this.p = p;
        this.courseToLearn = courseToLearn;
        this.courseToTeach = courseToTeach;
    }
}
