public class Person{
    private String FirstName;
    private String LastName;
    private String[] coursesTaken;
    private String school;
    private String[] coursesInterested;

    public Person(String FirstName, String LastName, String[] coursesTaken, String school, String[] coursesInterested) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.coursesInterested = coursesInterested;
        this.coursesTaken = coursesTaken;
        this.school = school;
        this.coursesInterested = coursesInterested;
    }

    public String[] getCoursesTaken() {
        return this.coursesTaken;
    }

    public String[] getCoursesInterested() {
        return this.coursesInterested;
    }

}