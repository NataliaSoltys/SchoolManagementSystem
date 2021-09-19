package people;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private String firstName;
    private String LastName;
    private LocalDate birthDate;
    private int classGroup;
    private double averageGrade;

    public Student(String firstName, String lastName, LocalDate birthDate, int classGroup, double averageGrade) {
        this.firstName = firstName;
        LastName = lastName;
        this.birthDate = birthDate;
        this.classGroup = classGroup;
        this.averageGrade = averageGrade;
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

    public int getClassGroup() {
        return classGroup;
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

    public void setClassGroup(int classGroup) {
        this.classGroup = classGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getClassGroup() == student.getClassGroup() && Double.compare(student.getAverageGrade(), getAverageGrade()) == 0 && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getBirthDate(), student.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getBirthDate(), getClassGroup(), getAverageGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", birthDate=" + birthDate +
                ", classGroup=" + classGroup +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
