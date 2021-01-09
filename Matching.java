import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Matching {
    public ArrayList<Person> persons;

    public Matching(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void generateGraph() {
        for (int k = 0; k < persons.size(); k++) {
            Person p = persons.get(k);
            Set<String> pCoursesInterested = p.getCoursesInterested();
            Set<String> pCoursesTaken = p.getCoursesTaken();
            for (int j = k + 1; j < persons.size(); j++) {
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
}
