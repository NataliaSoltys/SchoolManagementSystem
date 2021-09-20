import people.StaffPerson;
import people.StaffSpecialities;
import services.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentRecordsManagementServiceImpl.classes.put(1, Collections.emptyList());
        StudentRecordsManagementServiceImpl.classes.put(2, Collections.emptyList());
        StudentRecordsManagementServiceImpl.classes.put(3, Collections.emptyList());
        StudentRecordsManagementServiceImpl.classes.put(4, Collections.emptyList());

        int decision = Menu.showWelcome();

        Menu.decision(decision);

    }

}
