/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreMethods;

import AssistingClasses.SchoolCourse;
import CoreClasses.Assignment;
import CoreClasses.Course;
import CoreClasses.Student;
import CoreClasses.Trainer;

import static CoreMethods.OptionsMenu.listOfAssignments;
import static CoreMethods.OptionsMenu.listOfCourses;
import static CoreMethods.OptionsMenu.listOfSchoolCourses;
import static CoreMethods.OptionsMenu.listOfStudentMoreThanOneCourses;
import static CoreMethods.OptionsMenu.listOfStudents;
import static CoreMethods.OptionsMenu.listOfTrainers;
import AssistingClasses.StudentAssignment;
import java.time.LocalDate;

/**
 *
 * @author eon_A
 */
public class SyntheticDataMethods {
    
    public static void botFiller(){
        
    //Course #1    
    Course c1 = new Course("CB12", "Java", "Full Time",LocalDate.parse("2020-10-11"),LocalDate.parse("2021-01-10"));
    listOfCourses.add(c1);
    SchoolCourse sc1 = new SchoolCourse (c1);
    listOfSchoolCourses.add(sc1);
    
    Trainer t1 = new Trainer("Vladimiros", "Fotiadis", "Java");
    listOfTrainers.add(t1);
    sc1.getListOfTrainersPerCourse().add(t1);
    
    Student s1 = new Student("Aris", "Zografos", LocalDate.parse("1987-09-24"), 1000);
    listOfStudents.add(s1);
    sc1.getListOfStudentsPerCourse().add(s1);
    
    Student s2 = new Student("Nick", "Papas", LocalDate.parse("1970-10-12"), 2000);
    listOfStudents.add(s2);
    sc1.getListOfStudentsPerCourse().add(s2);
    
    Student s3 = new Student("Jonh", "Vrettos", LocalDate.parse("1986-11-23"), 2500);
    listOfStudents.add(s3);
    sc1.getListOfStudentsPerCourse().add(s3);
    
    Assignment a1 = new Assignment("Assignment 1", "Exercise 1 Java", LocalDate.parse("2020-11-18"));
    listOfAssignments.add(a1);
    sc1.getListOfAssignmentsPerCourse().add(a1);
        
    Assignment a2 = new Assignment("Assignment 2", "Exercise 2 Java", LocalDate.parse("2020-12-21"));
    listOfAssignments.add(a2);
    sc1.getListOfAssignmentsPerCourse().add(a2);
    
    Assignment a3 = new Assignment("Assignment 3", "Exercise 3 Java", LocalDate.parse("2021-02-10"));
    listOfAssignments.add(a3);
    sc1.getListOfAssignmentsPerCourse().add(a3);
    
    //StudentAssignment Deep Copies
    StudentAssignment sa1 = new StudentAssignment("Assignment 1", "Exercise 1 Java", LocalDate.parse("2020-11-18"),0,0);
    StudentAssignment sa1DC1 = new StudentAssignment(sa1);
    StudentAssignment sa1DC2 = new StudentAssignment(sa1);
    StudentAssignment sa1DC3 = new StudentAssignment(sa1);
    s1.getListOfAssignmentsPerStudentPerCourse().add(sa1DC1);
    s2.getListOfAssignmentsPerStudentPerCourse().add(sa1DC2);
    s3.getListOfAssignmentsPerStudentPerCourse().add(sa1DC3);
    StudentAssignment sa2 = new StudentAssignment("Assignment 2", "Exercise 2 Java", LocalDate.parse("2020-12-21"),0,0);
    StudentAssignment sa2DC1 = new StudentAssignment(sa2);
    StudentAssignment sa2DC2 = new StudentAssignment(sa2);
    StudentAssignment sa2DC3 = new StudentAssignment(sa2);
    s1.getListOfAssignmentsPerStudentPerCourse().add(sa2DC1);
    s2.getListOfAssignmentsPerStudentPerCourse().add(sa2DC2);
    s3.getListOfAssignmentsPerStudentPerCourse().add(sa2DC3);
    StudentAssignment sa3 = new StudentAssignment("Assignment 3", "Exercise 3 Java", LocalDate.parse("2021-02-10"),0,0);
    StudentAssignment sa3DC1 = new StudentAssignment(sa3);
    StudentAssignment sa3DC2 = new StudentAssignment(sa3);
    StudentAssignment sa3DC3 = new StudentAssignment(sa3);
    s1.getListOfAssignmentsPerStudentPerCourse().add(sa3DC1);
    s2.getListOfAssignmentsPerStudentPerCourse().add(sa3DC2);
    s3.getListOfAssignmentsPerStudentPerCourse().add(sa3DC3);
    
    
    //Course #2
    Course c2 = new Course("CB12", "Java", "Part Time",LocalDate.parse("2020-10-11"),LocalDate.parse("2021-03-10"));
    listOfCourses.add(c2);
    SchoolCourse sc2 = new SchoolCourse (c2);
    listOfSchoolCourses.add(sc2);
    
    Trainer t2 = new Trainer("Spyros", "Mavros", "Java");
    listOfTrainers.add(t2);
    sc2.getListOfTrainersPerCourse().add(t2);
    
    Student s4 = new Student("Maria", "Pentagiwtisa", LocalDate.parse("1940-03-29"), 3000);
    listOfStudents.add(s4);
    sc2.getListOfStudentsPerCourse().add(s4);
    
    Student s5 = new Student("Nina", "Williams", LocalDate.parse("1970-04-15"), 4000);
    listOfStudents.add(s5);
    sc2.getListOfStudentsPerCourse().add(s5);
    
    Student s6 = new Student("Manolis", "Mparmpounis", LocalDate.parse("1988-03-10"), 1000);
    listOfStudents.add(s6);
    sc2.getListOfStudentsPerCourse().add(s6);
    
    Assignment a4 = new Assignment("Assignment 4", "Exercise 4 Java", LocalDate.parse("2021-01-14"));
    listOfAssignments.add(a4);
    sc2.getListOfAssignmentsPerCourse().add(a4);
        
    Assignment a5 = new Assignment("Assignment 5", "Exercise 5 Java", LocalDate.parse("2020-11-18"));
    listOfAssignments.add(a5);
    sc2.getListOfAssignmentsPerCourse().add(a5);
    
    Assignment a6 = new Assignment("Assignment 6", "Exercise 6 Java", LocalDate.parse("2020-11-18"));
    listOfAssignments.add(a6);
    sc2.getListOfAssignmentsPerCourse().add(a6);
    
    //StudentAssignment Deep Copies
    StudentAssignment sa4 = new StudentAssignment("Assignment 4", "Exercise 4 Java", LocalDate.parse("2021-01-14"),0,0);
    StudentAssignment sa4DC1 = new StudentAssignment(sa4);
    StudentAssignment sa4DC2 = new StudentAssignment(sa4);
    StudentAssignment sa4DC3 = new StudentAssignment(sa4);
    s4.getListOfAssignmentsPerStudentPerCourse().add(sa4DC1);
    s5.getListOfAssignmentsPerStudentPerCourse().add(sa4DC2);
    s6.getListOfAssignmentsPerStudentPerCourse().add(sa4DC3);
    StudentAssignment sa5 = new StudentAssignment("Assignment 5", "Exercise 5 Java", LocalDate.parse("2020-11-18"),0,0);
    StudentAssignment sa5DC1 = new StudentAssignment(sa5);
    StudentAssignment sa5DC2 = new StudentAssignment(sa5);
    StudentAssignment sa5DC3 = new StudentAssignment(sa5);
    s4.getListOfAssignmentsPerStudentPerCourse().add(sa5DC1);
    s5.getListOfAssignmentsPerStudentPerCourse().add(sa5DC2);
    s6.getListOfAssignmentsPerStudentPerCourse().add(sa5DC3);
    StudentAssignment sa6 = new StudentAssignment("Assignment 6", "Exercise 6 Java", LocalDate.parse("2020-11-18"),0,0);
    StudentAssignment sa6DC1 = new StudentAssignment(sa6);
    StudentAssignment sa6DC2 = new StudentAssignment(sa6);
    StudentAssignment sa6DC3 = new StudentAssignment(sa6);
    s4.getListOfAssignmentsPerStudentPerCourse().add(sa6DC1);
    s5.getListOfAssignmentsPerStudentPerCourse().add(sa6DC2);
    s6.getListOfAssignmentsPerStudentPerCourse().add(sa6DC3);
    
    //Course #3
    Course c3 = new Course("CB12", "C#", "Full Time",LocalDate.parse("2020-10-11"),LocalDate.parse("2021-01-10"));
    listOfCourses.add(c3);
    SchoolCourse sc3 = new SchoolCourse (c3);
    listOfSchoolCourses.add(sc3);
    
    Trainer t3 = new Trainer("Takis", "Mpouras", "C#");
    listOfTrainers.add(t3); 
    sc3.getListOfTrainersPerCourse().add(t3);
    
    Student s7 = new Student("Evangelia", "Mamalaki", LocalDate.parse("1987-07-29"), 2000);
    listOfStudents.add(s7);
    sc3.getListOfStudentsPerCourse().add(s7);
    
    Student s8 = new Student("Nikos", "Chantziapostolou", LocalDate.parse("1986-08-01"), 2500);
    listOfStudents.add(s8);
    sc3.getListOfStudentsPerCourse().add(s8);
    
    Assignment a7 = new Assignment("Assignment 7", "Exercise 1 C#", LocalDate.parse("2020-11-18"));
    listOfAssignments.add(a7);
    sc3.getListOfAssignmentsPerCourse().add(a7);
    
    Assignment a8 = new Assignment("Assignment 8", "Exercise 2 C#", LocalDate.parse("2020-12-20"));
    listOfAssignments.add(a8);
    sc3.getListOfAssignmentsPerCourse().add(a8);
    
    Assignment a9 = new Assignment("Assignment 9", "Exercise 3 C#", LocalDate.parse("2021-02-10"));
    listOfAssignments.add(a9);
    sc3.getListOfAssignmentsPerCourse().add(a9);
    
    //StudentAssignment Deep Copies
    StudentAssignment sa7 = new StudentAssignment("Assignment 7", "Exercise 1 C#", LocalDate.parse("2020-11-18"),0,0);
    StudentAssignment sa7DC1 = new StudentAssignment(sa7);
    StudentAssignment sa7DC2 = new StudentAssignment(sa7);
    s7.getListOfAssignmentsPerStudentPerCourse().add(sa7DC1);
    s8.getListOfAssignmentsPerStudentPerCourse().add(sa7DC2);
    StudentAssignment sa8 = new StudentAssignment("Assignment 8", "Exercise 2 C#", LocalDate.parse("2020-12-20"),0,0);
    StudentAssignment sa8DC1 = new StudentAssignment(sa8);
    StudentAssignment sa8DC2 = new StudentAssignment(sa8);
    s7.getListOfAssignmentsPerStudentPerCourse().add(sa8DC1);
    s8.getListOfAssignmentsPerStudentPerCourse().add(sa8DC2);
    StudentAssignment sa9 = new StudentAssignment("Assignment 9", "Exercise 3 C#", LocalDate.parse("2021-02-10"),0,0);
    StudentAssignment sa9DC1 = new StudentAssignment(sa9);
    StudentAssignment sa9DC2 = new StudentAssignment(sa9);
    s7.getListOfAssignmentsPerStudentPerCourse().add(sa9DC1);
    s8.getListOfAssignmentsPerStudentPerCourse().add(sa9DC2);
     
    //Course #4
    
    Course c4 = new Course("CB12", "C#", "Part Time",LocalDate.parse("2020-10-11"),LocalDate.parse("2021-03-10"));
    listOfCourses.add(c4);   
    SchoolCourse sc4 = new SchoolCourse (c4);
    listOfSchoolCourses.add(sc4);
    
    Trainer t4 = new Trainer("George", "Pasparakis", "C#");
    listOfTrainers.add(t4);
    sc4.getListOfTrainersPerCourse().add(t4);
    
    Student s9 = new Student("Anna", "Mparmpouni", LocalDate.parse("1985-09-25"), 3000);
    listOfStudents.add(s9);
    sc4.getListOfStudentsPerCourse().add(s9);
    
    Student s10 = new Student("Giannis", "Kokkinos", LocalDate.parse("1991-01-03"), 4000);
    listOfStudents.add(s10);
    sc4.getListOfStudentsPerCourse().add(s10);
    
    Assignment a10 = new Assignment("Assignment 10", "Exercise 4 C#", LocalDate.parse("2021-01-14"));
    listOfAssignments.add(a10);
    sc4.getListOfAssignmentsPerCourse().add(a10);
    
    Assignment a11 = new Assignment("Assignment 11", "Exercise 5 C#", LocalDate.parse("2020-11-18"));
    listOfAssignments.add(a11);
    sc4.getListOfAssignmentsPerCourse().add(a11);
    
    Assignment a12 = new Assignment("Assignment 12", "Exercise 6 C#", LocalDate.parse("2021-01-14"));
    listOfAssignments.add(a12);
    sc4.getListOfAssignmentsPerCourse().add(a12);
    
    //StudentAssignment Deep Copies
    StudentAssignment sa10 = new StudentAssignment("Assignment 10", "Exercise 4 C#", LocalDate.parse("2021-01-14"),0,0);
    StudentAssignment sa10DC1 = new StudentAssignment(sa10);
    StudentAssignment sa10DC2 = new StudentAssignment(sa10);
    s9.getListOfAssignmentsPerStudentPerCourse().add(sa10DC1);
    s10.getListOfAssignmentsPerStudentPerCourse().add(sa10DC2);
    
    StudentAssignment sa11 = new StudentAssignment("Assignment 11", "Exercise 5 C#", LocalDate.parse("2020-11-18"),0,0);
    StudentAssignment sa11DC1 = new StudentAssignment(sa11);
    StudentAssignment sa11DC2 = new StudentAssignment(sa11);
    s9.getListOfAssignmentsPerStudentPerCourse().add(sa11DC1);
    s10.getListOfAssignmentsPerStudentPerCourse().add(sa11DC2);
    
    StudentAssignment sa12 = new StudentAssignment("Assignment 12", "Exercise 6 C#", LocalDate.parse("2021-01-14"),0,0);
    StudentAssignment sa12DC1 = new StudentAssignment(sa12);
    StudentAssignment sa12DC2 = new StudentAssignment(sa12);
    s9.getListOfAssignmentsPerStudentPerCourse().add(sa12DC1);
    s10.getListOfAssignmentsPerStudentPerCourse().add(sa12DC2);
    
    
    //Adding Students on more than one Courses
    
    sc1.getListOfStudentsPerCourse().add(s10);
    StudentAssignment sa1DC4 = new StudentAssignment(sa1);
    s10.getListOfAssignmentsPerStudentPerCourse().add(sa1DC4);
    StudentAssignment sa2DC4 = new StudentAssignment(sa2);
    s10.getListOfAssignmentsPerStudentPerCourse().add(sa2DC4);
    StudentAssignment sa3DC4 = new StudentAssignment(sa3);
    s10.getListOfAssignmentsPerStudentPerCourse().add(sa3DC4);
    listOfStudentMoreThanOneCourses.add(s10);
    
    sc2.getListOfStudentsPerCourse().add(s8);
    StudentAssignment sa4DC4 = new StudentAssignment(sa4);
    s8.getListOfAssignmentsPerStudentPerCourse().add(sa4DC4);
    StudentAssignment sa5DC4 = new StudentAssignment(sa5);
    s8.getListOfAssignmentsPerStudentPerCourse().add(sa5DC4);
    StudentAssignment sa6DC4 = new StudentAssignment(sa6);
    s8.getListOfAssignmentsPerStudentPerCourse().add(sa6DC4);
    listOfStudentMoreThanOneCourses.add(s8);
    
    sc3.getListOfStudentsPerCourse().add(s1);
    StudentAssignment sa7DC3 = new StudentAssignment(sa7);
    s1.getListOfAssignmentsPerStudentPerCourse().add(sa7DC3);
    StudentAssignment sa8DC3 = new StudentAssignment(sa8);
    s1.getListOfAssignmentsPerStudentPerCourse().add(sa8DC3);
    StudentAssignment sa9DC3 = new StudentAssignment(sa9);
    s1.getListOfAssignmentsPerStudentPerCourse().add(sa9DC3);
    listOfStudentMoreThanOneCourses.add(s1);
            
    sc4.getListOfStudentsPerCourse().add(s6);
    StudentAssignment sa10DC3 = new StudentAssignment(sa10);
    s6.getListOfAssignmentsPerStudentPerCourse().add(sa10DC3);
    StudentAssignment sa11DC3 = new StudentAssignment(sa11);
    s6.getListOfAssignmentsPerStudentPerCourse().add(sa11DC3);
    StudentAssignment sa12DC3 = new StudentAssignment(sa12);
    s6.getListOfAssignmentsPerStudentPerCourse().add(sa12DC3);
    listOfStudentMoreThanOneCourses.add(s6);
        
    
    }
      
    
   
}
