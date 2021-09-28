package services;

import people.Student;

import java.time.LocalDate;
import java.util.*;

public class StudentRecordsManagementServiceImpl implements StudentRecordsManagementService {

    public static ArrayList<Student> allStudents = new ArrayList<>();
    public static Map<Integer, List<Student>> classes = new HashMap<>();

//    Map<Integer, List<String>> school = new HashMap<>();
//        school.put(3, List.of("Ola Kola", "Panek", "Pat Mat"));
//        school.put(8, Collections.emptyList());
//        school.put(1, Collections.singletonList("Wiki Miki"));
//        System.out.println(school);

    public int showStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number according to your needs.");
        System.out.println("1 - Show all students in school.");
        System.out.println("2 - Show students in class you are interested in.");
        System.out.println("3 - Add student to class.");
        System.out.println("4 - Add student to school.");
        System.out.println("5 - Proceed student to the next class.");
        System.out.println("6 - Exit Student Managing System.");
        System.out.println("Your answer:  ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                showStudentArray();
                 break;
            case 2:
                showStudentClasses();
                 break;
            case 3:
                addStudentToClass();
                 break;
            case 4:
                addStudentToSchool();
                 break;
            case 5:
                letStudentGoToUpperClass();
                 break;
            case 6:
                 break;
            default:
                System.out.println("Answer is wrong.");
                showStudentMenu();
        }
        return number;
    }

    public void showStudentArray() {
        if (allStudents.isEmpty()) {
            System.out.println("No students to show. ");
            return;
        }

        for (Student student : allStudents) {
            System.out.println("Student no. " + (allStudents.indexOf(student) + 1) + ": "
                    + student.getFirstName() + " "
                    + student.getLastName()
                    + " born at " + student.getBirthDate()
                    + " in class " + student.getClassGroup()
                    + " with average grade " + student.getAverageGrade());

        }
    }

    private void showStudentClasses() {
        if (classes.isEmpty()) {
            System.out.println("No one is signed to any class.");
            return;
        }

        for (int i = 0; i < classes.size(); i++) {
            for (List<Student> student : classes.values()) {
                System.out.print(student);
            }
            System.out.println();
        }

    }

    public void addStudentToClass() {
        System.out.println("Welcome to signing student to class. Available classes: ");
        Set<Integer> integers = classes.keySet();
        for (Integer i : integers) {
            System.out.println(i);
        }
        System.out.println("Type in which class you want to add student to:  ");
        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type in first name of student: ");
        String name = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Type in last name of student: ");
        String lastName = scanner3.nextLine();

        Student student = new Student(name, lastName, LocalDate.now(), decision, 0.0);

        List<Student> preClass = new ArrayList<>(classes.get(decision));
        preClass.add(student);

        classes.put(decision, preClass);
        allStudents.add(student);
    }

    public void addStudentToSchool() {

        System.out.println("Welcome to signing student to school.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in first name of student: ");
        String name = scanner.nextLine();

        System.out.println("Type in last name of student: ");
        String lastName = scanner.nextLine();

        Student student = new Student(name, lastName, LocalDate.now(), 0, 0.0);

        allStudents.add(student);

    }

    public void letStudentGoToUpperClass() {

    }
}
