package school_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
         teacher chris = new teacher(1,"chris",500);
         teacher moris = new teacher(2,"moris",800);
         student adi = new student(1,"adi",3);
         student ikra = new student(2,"ikra",4);
        List<teacher> teacherList = new ArrayList<>();
        List<student> studentList = new ArrayList<>();
        teacherList.add(chris);
        teacherList.add(moris);
        studentList.add(adi);
        studentList.add(ikra);

        mangementSystem ms = new mangementSystem(teacherList,studentList);
        adi.payfees(5000);
        ikra.payfees(3000);
       // System.out.println(" school has earned $" +" "+ ms.getTotalMoneyearned());
        /**
         * salries
         */
        chris.receivesalary(chris.getSalary());
        System.out.println(" school has spent on  $" +" "+ chris.getSalary() +"  "+"and now they are left with "+ ms.getTotalMoneyearned());
        moris.receivesalary(moris.getSalary());
        System.out.println(" school has spent on  $" +" "+ moris.getSalary() +"  "+"and now they are left with "+ ms.getTotalMoneyearned());
    }
}
