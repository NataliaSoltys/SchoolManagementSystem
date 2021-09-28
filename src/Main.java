import services.*;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        StudentRecordsManagementServiceImpl.classes.put(1, Collections.emptyList());
        StudentRecordsManagementServiceImpl.classes.put(2, Collections.emptyList());
        StudentRecordsManagementServiceImpl.classes.put(3, Collections.emptyList());
        StudentRecordsManagementServiceImpl.classes.put(4, Collections.emptyList());

        System.out.println("Welcome to Roosevelt High School. It's a pleasure to have you here.");

        int decision = 0;
        while (decision != 4) {
            decision = Menu.overallDecision();
            Menu.decision(decision);
        }

    }

}
