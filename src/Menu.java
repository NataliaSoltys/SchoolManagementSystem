import services.*;

import java.util.Scanner;

public class Menu {
    static TeacherRecordsManagementService teacherRecordsManagementService = new TeacherRecordsManagementServiceImpl();
    static StudentRecordsManagementService studentRecordsManagementService = new StudentRecordsManagementServiceImpl();
    static StaffRecordsManagementService staffRecordsManagementService = new StaffRecordsManagementServiceImpl();

    public static int showWelcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Roosevelt High School. It's a pleasure to have you here.");
        System.out.print("Press 1 if you're interested in managing students or 2 if you want to check staff, or 3 - teachers: ");
        int decide = scanner.nextInt();
        System.out.println();
        return decide;
    }

    public static void studentManaging() {
        System.out.println("Welcome to Student Managing System. ");
        studentRecordsManagementService.showStudentMenu();

    }

    public static void staffManaging() {
        System.out.println("Welcome to Staff Managing System. ");
    }

    public static void teacherManaging() {
        System.out.println("Welcome to Teacher Managing System. ");
    }

    public static void decision(int decision) {
        switch (decision) {
            case 1:
                Menu.studentManaging();
                break;
            case 2:
                Menu.staffManaging();
                break;
            case 3:
                Menu.teacherManaging();
                break;
            default:
                System.out.println("You entered wrong number. Try again.");
                Scanner scanner = new Scanner(System.in);
                int numberDecision = scanner.nextInt();
                Menu.decision(numberDecision);
        }
    }
}
