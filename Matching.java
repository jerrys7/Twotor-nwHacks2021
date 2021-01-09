import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Matching {
    public ArrayList<Person> persons;

    public Matching(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void generateMatch(Person p) {
        Set<String> pCoursesInterested = p.getCoursesInterested();
        Set<String> pCoursesTaken = p.getCoursesTaken();
        Set<Match> matches = new HashSet<>();
        for (int j = 0; j < persons.size(); j++) {
            Person t = persons.get(j);
            Set<String> tCoursesInterested = t.getCoursesInterested();
            Set<String> tCoursesTaken = t.getCoursesTaken();
            String courseToBeAdded;
            int result = -2;
            for (String pCourse : pCoursesInterested) {
                if (tCoursesTaken.contains(pCourse)) {
                    result++;
                    courseToBeAdded = pCourse;
                }
            }
            if (result == -1) {
                for (String tCourse: tCoursesInterested) {
                    if (pCoursesTaken.contains(tCourse)) {
                        result++;
                        break;
                    }
                }
            }
        }

    }
}
