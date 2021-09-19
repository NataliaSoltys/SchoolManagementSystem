package services;

import people.StaffPerson;
import people.StaffSpecialities;
import people.TeacherPerson;
import people.TeacherSpecialities;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface TeacherRecordsManagementService {

    StaffPerson hireTeacher(TeacherPerson teacherPerson);

    String fireTeacher(TeacherPerson teacherPerson);

    TeacherSpecialities changeSpeciality(TeacherSpecialities teacherSpecialities);

    BigInteger raiseSalary(BigInteger salary);
}
