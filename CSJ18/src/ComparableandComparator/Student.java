package ComparableandComparator;

import java.util.List;

public class Student implements Comparable<Student>{

    String name;
    int rollnumber;
    String fathers_name;
    String dob;

    public Student(String name, int rollnumber, String fathers_name, String dob) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.fathers_name = fathers_name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public String getFathers_name() {
        return fathers_name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollnumber-o.rollnumber;
    }
}
