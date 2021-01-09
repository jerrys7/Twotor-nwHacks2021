import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Person implements Comparable{
    public static ArrayList<Person> users = new ArrayList<>();
    private String FirstName;
    private String LastName;
    private int grade;
    private int age;
    private Map<String, Integer> coursesTakenMap;
    private Set<String> coursesTaken;
    private String school;
    private Set<String> coursesInterested;
    private String[] subjectsInterested;
    private boolean transcriptVerified;
    private double rating;
    private Set<String> matches = new HashSet<>();

    public Person(String FirstName, String LastName, int grade, int age, Map<String, Integer> coursesTakenMap,
                  Set<String> coursesTaken, String school, Set<String> coursesInterested, String[] subjectsInterested,
                  boolean transcriptVerified, double rating) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.grade = grade;
        this.age = age;
        this.coursesInterested = coursesInterested;
        this.coursesTakenMap = coursesTakenMap;
        this.school = school;
        this.coursesInterested = coursesInterested;
        this.subjectsInterested = subjectsInterested;
        this.transcriptVerified = transcriptVerified;
        this.rating = rating;
        users.add(this);
    }

    public Map<String, Integer> getCoursesTakenMap() {
        return this.coursesTakenMap;
    }

    public Set<String> getCoursesInterested() {
        return this.coursesInterested;
    }

    public String[] getSubjectsInterested() {
        return this.subjectsInterested;
    }

    public boolean isValid() {
        return transcriptVerified && eval();
    }

    public boolean eval() {
        return (rating <= 2.5);
    }

    public Set<String> getCoursesTaken() {
        return coursesTaken;
    }

    public void setMatches(Set<String> s) {
        matches = s;
    }

    public Set<String> getMatches() {
        return matches;
    }

    public void addMatch(String s) {
        matches.add(s);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}