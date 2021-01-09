import java.util.Map;

public class Person{
    private String FirstName;
    private String LastName;
    private int grade;
    private Map<String, Integer> coursesTaken;
    private String school;
    private String[] coursesInterested;
    private String[] subjectsInterested;
    private boolean transcriptVerified;

    public Person(String FirstName, String LastName, int grade, Map<String, Integer> coursesTaken, String school,
                  String[] coursesInterested, String[] subjectsInterested, boolean transcriptVerified) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.grade = grade;
        this.coursesInterested = coursesInterested;
        this.coursesTaken = coursesTaken;
        this.school = school;
        this.coursesInterested = coursesInterested;
        this.subjectsInterested = subjectsInterested;
        this.transcriptVerified = transcriptVerified;
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

}