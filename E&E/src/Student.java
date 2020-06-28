import Exceptions.NoSubjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, List<Integer>> academicPerformance = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<Integer>> getAcademicPerformance() {
        try {
            if (academicPerformance.keySet().isEmpty()) {
                throw new NoSubjects("отсутствие предметов у студента");
            }
        }
        catch (NoSubjects e) {
            System.out.println(e.getMessage());
        }
        return academicPerformance;
    }

    public void setAcademicPerformance(Map<String, List<Integer>> academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
}
