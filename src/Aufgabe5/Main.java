package Aufgabe5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Student student1 = new Student(1810653831,"Thomas Dorfer",2018);
        //Student student2 = new Student(1810653832,"Jürgen Würgen",2018);
        //Student student3 = new Student(1810653833,"Hans Wurst",2018);

        List<Student> students = new ArrayList<>();
        //students.add(student1);
        //students.add(student2);
        //students.add(student3);

        students.add(new Student(1810653831,"Thomas Dorfer",2018));
        students.add(new Student(1810653832,"Jürgen Würgen",2018));
        students.add(new Student(1810653833,"Hans Wurst",2018));

        for (Student eintrag : students)
        {
            System.out.println(eintrag + "eintrag");
        }



        /*
        List<Student> students = new ArrayList<>();
        for (int i = 0; i <3;i++)
        {

            students.add(new Student(181065300, JOptionPane.showInputDialog("Geben Sie den Namen des " + i +
                                    " Studenten ein."),Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Geben Sie den Jahregang ein: "))));
        }
        Student student = new Student();
        for (int j = 0; j<3;j++)
        {
            student = students.get(j);
            System.out.println(student.toString());
        }
        */
    }
}
