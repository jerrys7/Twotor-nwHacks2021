import java.util.Map;

public class Person{
    private String FirstName;
    private String LastName;
    private int grade;
    private int age;
    private Map<String, Integer> coursesTaken;
    private String school;
    private String[] coursesInterested;
    private String[] subjectsInterested;
    private boolean transcriptVerified;
    private double rating;

    public Person(String FirstName, String LastName, int grade, int age, Map<String, Integer> coursesTaken, String school,
                  String[] coursesInterested, String[] subjectsInterested, boolean transcriptVerified, double rating) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.grade = grade;
        this.age = age;
        this.coursesInterested = coursesInterested;
        this.coursesTaken = coursesTaken;
        this.school = school;
        this.coursesInterested = coursesInterested;
        this.subjectsInterested = subjectsInterested;
        this.transcriptVerified = transcriptVerified;
        this.rating = rating;
    }

    public Map<String, Integer> getCoursesTaken() {
        return this.coursesTaken;
    }

    public String[] getCoursesInterested() {
        return this.coursesInterested;
    }

    public String[] getSubjectsInterested() {
        return this.subjectsInterested;
    }

    public boolean isValid() {
        return transcriptVerified;
    }

    public boolean eval() {
        return (rating <= 2.5);
    }

}