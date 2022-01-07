package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {
    int Class;
    char section;
    public List<Student> students;

    public Class(int Class, char section) {
        this.Class = Class;
        this.section = section;
        this.students = new ArrayList<>();
    }
    public boolean add_Student(String student_name,int roll_number,String fathers_name,String dob)
    {
        Student student = new Student(student_name,roll_number,fathers_name,dob);
        if(findstudent(student))
        {
            return false;
        }
        students.add(student);
        return true;
    }
    public boolean sort()
    {
        Collections.sort(students);
        return true;
    }
    public boolean findstudent(Student student)
    {
        for (Student s : students)
        {
            if(s.compareTo(student)==0)
                return true;

        }
        return false;
    }
    public void printstudents()
    {
        for (Student s :students)
        {
            System.out.print(s.getName()+"\t");
        }
    }
}
