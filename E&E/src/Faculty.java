import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private static List<Faculty> facultyList = new ArrayList<>();
    private List<Group> group = new ArrayList<>();
    private List<String> subjects = new ArrayList<>();

    public static List<Faculty> getFacultyList() {
        return facultyList;
    }

    public List<Group> getGroup() {
        return group;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}
