import people.StaffPerson;
import people.StaffSpecialities;
import services.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        TeacherRecordsManagementService teacherRecordsManagementService = new TeacherRecordsManagementServiceImpl();
        StudentRecordsManagementService studentRecordsManagementService = new StudentRecordsManagementServiceImpl();
        StaffRecordsManagementService staffRecordsManagementService = new StaffRecordsManagementServiceImpl();



    }

    public static void menu() {

    }
}
