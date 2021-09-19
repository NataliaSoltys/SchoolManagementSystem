package people;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class TeacherPerson {

    private String firstName;
    private String LastName;
    private LocalDate birthDate;
    private BigDecimal salaryWanted;
    private TeacherSpecialities speciality;

    public TeacherPerson(String firstName, String lastName, LocalDate birthDate, BigDecimal salaryWanted, TeacherSpecialities speciality) {
        this.firstName = firstName;
        LastName = lastName;
        this.birthDate = birthDate;
        this.salaryWanted = salaryWanted;
        this.speciality = speciality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public BigDecimal getSalaryWanted() {
        return salaryWanted;
    }

    public void setSalaryWanted(BigDecimal salaryWanted) {
        this.salaryWanted = salaryWanted;
    }

    public TeacherSpecialities getSpeciality() {
        return speciality;
    }

    public void setSpeciality(TeacherSpecialities speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeacherPerson)) return false;
        TeacherPerson that = (TeacherPerson) o;
        return Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getBirthDate(), that.getBirthDate()) && Objects.equals(getSalaryWanted(), that.getSalaryWanted()) && getSpeciality() == that.getSpeciality();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getBirthDate(), getSalaryWanted(), getSpeciality());
    }

    @Override
    public String toString() {
        return "TeacherPerson{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", birthDate=" + birthDate +
                ", salaryWanted=" + salaryWanted +
                ", speciality=" + speciality +
                '}';
    }
}
