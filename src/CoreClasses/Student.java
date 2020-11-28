/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreClasses;

import AssistingClasses.StudentAssignment;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author eon_A
 */
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int tuitionFees;
    private ArrayList<StudentAssignment> listOfAssignmentsPerStudentPerCourse=new ArrayList<>();

    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        
        
        
    }

    public ArrayList<StudentAssignment> getListOfAssignmentsPerStudentPerCourse() {
        return listOfAssignmentsPerStudentPerCourse;
    }

    public void setListOfAssignmentsPerStudentPerCourse(ArrayList<StudentAssignment> listOfAssignmentsPerStudentPerCourse) {
        this.listOfAssignmentsPerStudentPerCourse = listOfAssignmentsPerStudentPerCourse;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}';
    }
    
    
    
    
}
