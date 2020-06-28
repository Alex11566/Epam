import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> currentGroup = new ArrayList<>();

    public List<Student> getCurrentGroup() {
        return currentGroup;
    }

    public void addStudent(String name){
        currentGroup.add(new Student(name));
    }
}
