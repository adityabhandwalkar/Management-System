package school_management;

import java.util.ArrayList;
import java.util.List;

/**
 * School consist of  many students
 */
public class mangementSystem {
    private List<teacher >teachers ;
    private  List<student> students ;
    private static int totalMoneyearned;
    private static int totalMoneyspent;
    //List<Float> numbers = new ArrayList<>();


    public mangementSystem(List<school_management.teacher> teacher, List<school_management.student> student) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyearned = 0;
        totalMoneyspent  = 0;
    }

    public List<school_management.teacher> getTeacher() {
        return teachers;
    }

    public List<school_management.student> getStudent() {
        return students;
    }

    public int getTotalMoneyearned() {
        return totalMoneyearned;
    }

    public int getTotalMoneyspent() {
        return totalMoneyspent;
    }

    /**
     * add teacher to the school
     * @param teacher
     */
    public void addTeacher(teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(student student) {
        students.add(student);
    }

    public static void updateTotalMoneyearned(int Moneyearned) {
        totalMoneyearned+= Moneyearned;
    }

    /**
     * money spent by school on salaries of teacher.
     * @param Moneyspent
     */
    public static void updateTotalMoneyspent(int Moneyspent) {
        totalMoneyearned-= Moneyspent;
    }
}
