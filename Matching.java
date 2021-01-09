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
        for (Person t: persons) {
            if (t.compareTo(p) != 0) {
                Set<String> tCoursesInterested = t.getCoursesInterested();
                Set<String> tCoursesTaken = t.getCoursesTaken();
                Set<String> interestedAndOffered = new HashSet<>();
                Set<String> offeredAndInterested = new HashSet<>();
                /** check one way */
                for (String pCourse : pCoursesInterested) {
                    if (tCoursesTaken.contains(pCourse)) {
                        interestedAndOffered.add(pCourse);
                    }
                }
                for (String tCourse: tCoursesInterested) {
                    if (pCoursesTaken.contains(tCourse)) {
                        offeredAndInterested.add(tCourse);
                    }
                }
                if (interestedAndOffered.size() > 0 && offeredAndInterested.size() > 0) {
                    Match m = new Match(t, offeredAndInterested, interestedAndOffered);
                    matches.add(m);
                }
            }
        }

    }
}
