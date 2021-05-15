package za.ac.cput.student;
/*
Siphosethu Manisi 219039380
captures student details
 */
import java.util.Objects;

public class Student {
    private String name, surname;
    private int studentNum;

    public Student(String name, String surname, int studentNum) {
        this.name = name;
        this.surname = surname;
        this.studentNum = studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}
