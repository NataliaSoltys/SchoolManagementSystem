package people;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class StaffPerson {

    private String firstName;
    private String LastName;
    private LocalDate birthDate;
    private int salaryWanted;
    private StaffSpecialities speciality;

    public StaffPerson(String firstName, String lastName, LocalDate birthDate, int salaryWanted, StaffSpecialities speciality) {
        this.firstName = firstName;
        LastName = lastName;
        this.birthDate = birthDate;
        this.salaryWanted = salaryWanted;
        this.speciality = speciality;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getSalaryWanted() {
        return salaryWanted;
    }

    public StaffSpecialities getSpeciality() {
        return speciality;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setSalaryWanted(int salaryWanted) {
        this.salaryWanted = salaryWanted;
    }

    public void setSpeciality(StaffSpecialities speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "StaffPerson{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", birthDate=" + birthDate +
                ", salaryWanted=" + salaryWanted +
                ", speciality=" + speciality +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StaffPerson)) return false;
        StaffPerson that = (StaffPerson) o;
        return getSalaryWanted() == that.getSalaryWanted() && Objects.equals(getFirstName(),
                that.getFirstName()) && Objects.equals(getLastName(),
                that.getLastName()) && Objects.equals(getBirthDate(),
                that.getBirthDate()) && getSpeciality() == that.getSpeciality();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getBirthDate(), getSalaryWanted(), getSpeciality());
    }
}
