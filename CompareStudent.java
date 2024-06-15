import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class CompareStudent {
    public static void main(String[] args) {

        Comparator<Student> comp = new Comparator<Student>() {

            public int compare(Student t1, Student t2) {
                //compare by age
                // if(t1.age > t2.age)
                //     return 1;
                // else
                //     return -1;
                //compare by name
                return t1.name.compareTo(t2.name);
            }
        };

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(62,"Kritika"));
        students.add(new Student(94,"Diya"));
        students.add(new Student(45,"Gyanu"));
        students.add(new Student(48,"Basant"));
        students.add(new Student(29,"Kridip"));

        // System.out.println(students);
        //if we want to make work above code we should implement Comparable

        Collections.sort(students,comp);
        for(Student s: students) {
            System.out.println(s);
        }
    }
}