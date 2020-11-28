/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreClasses;

import CoreClasses.Assignment;
import CoreClasses.Course;
import CoreClasses.Student;
import CoreClasses.Trainer;
import java.util.ArrayList;

/**
 *
 * @author eon_A
 */
public class SchoolCourse {
    private Course course;
    private ArrayList<Student> listOfStudentsPerCourse=new ArrayList<>();
    private ArrayList<Assignment> listOfAssignmentsPerCourse=new ArrayList<>();
    private ArrayList<Trainer> listOfTrainersPerCourse=new ArrayList<>();

    
    
    public SchoolCourse() {
    }
     
    
    public SchoolCourse(Course course) {
        this.course = course;
    } 
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getListOfStudentsPerCourse() {
        return listOfStudentsPerCourse;
    }

    public void setListOfStudentsPerCourse(ArrayList<Student> listOfStudentsPerCourse) {
        this.listOfStudentsPerCourse = listOfStudentsPerCourse;
    }

    public ArrayList<Assignment> getListOfAssignmentsPerCourse() {
        return listOfAssignmentsPerCourse;
    }

    public void setListOfAssignmentsPerCourse(ArrayList<Assignment> listOfAssignmentsPerCourse) {
        this.listOfAssignmentsPerCourse = listOfAssignmentsPerCourse;
    }

    public ArrayList<Trainer> getListOfTrainersPerCourse() {
        return listOfTrainersPerCourse;
    }

    public void setListOfTrainersPerCourse(ArrayList<Trainer> listOfTrainersPerCourse) {
        this.listOfTrainersPerCourse = listOfTrainersPerCourse;
    }

    @Override
    public String toString() {
        return "SchoolCourse{" + "course=" + course + ", listOfStudentsPerCourse=" + listOfStudentsPerCourse + ", listOfAssignmentsPerCourse=" + listOfAssignmentsPerCourse + ", listOfTrainersPerCourse=" + listOfTrainersPerCourse + '}';
    }
    
    
    
}
