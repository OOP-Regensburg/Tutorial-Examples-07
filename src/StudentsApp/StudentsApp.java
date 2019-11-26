package StudentsApp;

import java.util.Scanner;

public class StudentsApp {

    private int MAX_NUMBER_OF_STUDENTS = 3;
    private Student[] students;

    public StudentsApp() {
        students = new Student[MAX_NUMBER_OF_STUDENTS];
    }

    public void readData() {
        for (int i = 0; i < students.length; i++) {
            students[i] = createStudentObject();
        }
    }

    public void printData() {
        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            System.out.println("#" + currentStudent.getID() + " " + currentStudent);
        }
    }

    private Student createStudentObject() {
        Student student;
        System.out.println("Bitte gib die Informationen für den nächsten Studierenden ein.");
        String name = readString("Name: ");
        double grade = readDouble("Note: ");
        String isMaster = readString("Master-Studierender (ja/nein): ");
        if (isMaster.equals("ja")) {
            double bachelorGrade = readDouble("Note (Bachelor): ");
            student = new MasterStudent(name, grade, bachelorGrade);
        } else {
            student = new Student(name, grade);
        }
        return student;
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static double readDouble(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
