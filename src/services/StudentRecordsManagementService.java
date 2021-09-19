package services;

import people.Student;

public interface StudentRecordsManagementService {

    void addStudentToClass(Student student, int currentClass);
    void letStudentGoToUpperClass(Student student);
}
