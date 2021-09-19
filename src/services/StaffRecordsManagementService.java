package services;

import people.StaffPerson;
import people.StaffSpecialities;

import java.math.BigDecimal;

public interface StaffRecordsManagementService {

    StaffPerson hireStaff(StaffPerson staffPerson);

    String fireStaff(StaffPerson staffPerson);

    void changeSpeciality(StaffPerson staffPerson, StaffSpecialities staffSpecialities);

    BigDecimal raiseSalary(StaffPerson staffPerson, BigDecimal salary);
}
