/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndivPro_Zografos_Part_a;

import static IndivPro_Zografos_Part_a.ManualDataMethods.date;
import static IndivPro_Zografos_Part_a.OptionsMenu.listOfAssignments;
import static IndivPro_Zografos_Part_a.OptionsMenu.listOfCourses;
import static IndivPro_Zografos_Part_a.OptionsMenu.listOfSchoolCourses;
import static IndivPro_Zografos_Part_a.OptionsMenu.listOfStudentMoreThanOneCourses;
import static IndivPro_Zografos_Part_a.OptionsMenu.listOfStudents;
import static IndivPro_Zografos_Part_a.OptionsMenu.listOfTrainers;
import CoreClasses.Assignment;
import CoreClasses.Course;
import CoreClasses.SchoolCourse;
import CoreClasses.Student;
import CoreClasses.Trainer;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author eon_A
 */
public class SupportMethods {

//*******************************Print Methods**************************
    // Prints Courses, maybe this isn't actually needed (I believe SchoolCourse.getCourse will do the same job)
    public static void printListOfCourses() {
        for (Course x : listOfCourses) {
            System.out.println((listOfCourses.indexOf(x) + 1) + ")" + x);
            System.out.println();
        }
    }

    // Prints SchoolCourses
    public static void printListOfSchoolCourses() {
        for (SchoolCourse x : listOfSchoolCourses) {
            System.out.println((listOfSchoolCourses.indexOf(x) + 1) + ")" + x.getCourse());
            System.out.println();
        }
    }

    // Prints Students
    public static void printListOfStudent() {
        for (Student x : listOfStudents) {
            System.out.println((listOfStudents.indexOf(x) + 1) + ")" + x);
            System.out.println();
        }
    }

    // Prints Assignments
    public static void printListOfAssignments() {
        for (Assignment x : listOfAssignments) {
            System.out.println((listOfAssignments.indexOf(x) + 1) + ")" + x);
            System.out.println();
        }
    }

    // Prints Trainers
    public static void printListOfTrainers() {
        for (Trainer x : listOfTrainers) {
            System.out.println((listOfTrainers.indexOf(x) + 1) + ")" + x);
            System.out.println();
        }
    }

    // Prints Students per course 
    public static void printListOfStudentsPerCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~Please select a course to see the Students~~~~~~~~~");
        boolean caseCheck = false;
        String flag = "Y";
        do {
            if (flag.equalsIgnoreCase("Y")) {
                SchoolCourse chosenSchoolCourse = schoolCourseSelection();
                for (int i = 0; i < chosenSchoolCourse.getListOfStudentsPerCourse().size(); i++) {
                    System.out.println((i + 1) + ") " + chosenSchoolCourse.getListOfStudentsPerCourse().get(i));
                    System.out.println("");
                }
            } else if (flag.equalsIgnoreCase("N")) {

                return;

            } else {

                System.err.println("Invalid Answer, type: Y or N");

            }
            System.out.println("Do you want to check another Course? (Y / N)");
            flag = input.nextLine();
        } while (caseCheck == false);
    }

    // Prints Trainers per course        
    public static void printListOfTrainersPerCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~Select the course to see the Trainers~~~~~~~~~");
        boolean caseCheck = false;
        String flag = "Y";
        do {
            if (flag.equalsIgnoreCase("Y")) {
                SchoolCourse chosenSchoolCourse = schoolCourseSelection();
                for (int i = 0; i < chosenSchoolCourse.getListOfTrainersPerCourse().size(); i++) {
                    System.out.println((i + 1) + ") " + chosenSchoolCourse.getListOfTrainersPerCourse().get(i));
                    System.out.println("");
                }
            } else if (flag.equalsIgnoreCase("N")) {
                return;
            } else {

                System.err.println("Invalid Answer, type: Y or N");

            }
            System.out.println("Do you want to check another Course? (Y / N)");
            flag = input.nextLine();
        } while (caseCheck == false);

    }

    // Prints Assingnments per course 
    public static void printListOfAssignmentsPerCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~Select the course to see the Assignments~~~~~~~~~");
        boolean caseCheck = false;
        String flag = "Y";
        do {
            if (flag.equalsIgnoreCase("Y")) {
                SchoolCourse chosenSchoolCourse = schoolCourseSelection();
                for (int i = 0; i < chosenSchoolCourse.getListOfAssignmentsPerCourse().size(); i++) {
                    System.out.println((i + 1) + ") " + chosenSchoolCourse.getListOfAssignmentsPerCourse().get(i));
                    System.out.println("");
                }
            } else if (flag.equalsIgnoreCase("N")) {
                return;
            } else {

                System.err.println("Invalid Answer, type: Y or N");

            }
            System.out.println("Do you want to check another Course? (Y / N)");
            flag = input.nextLine();
        } while (caseCheck == false);
    }

    // Prints Assignment Per Students
    public static void printListOfAssignmentsPerStudentPerCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~Select the student to see the Assignments~~~~~~~~~");
        boolean caseCheck = false;
        String flag = "Y";
        do {
            if (flag.equalsIgnoreCase("Y")) {
                Student chosenStudent = studentSelection();
                for (int i = 0; i < chosenStudent.getListOfAssignmentsPerStudentPerCourse().size(); i++) {
                    System.out.println((i + 1) + ") " + chosenStudent.getListOfAssignmentsPerStudentPerCourse().get(i));
                    System.out.println("");
                }
            } else if (flag.equalsIgnoreCase("N")) {
                return;
            } else {

                System.err.println("Invalid Answer, type: Y or N");

            }
            System.out.println("Do you want to check another Student? (Y / N)");
            flag = input.nextLine();
        } while (caseCheck == false);
    }

    public static void printlistOfStudentMoreThanOneCourses() {
        for (Student x : new HashSet<Student>(listOfStudentMoreThanOneCourses)) {
            System.out.println(x);
            System.out.println();
        }

    }

//*******************************Validation Methods**************************    
    public static int validateInputArrayList(int x, ArrayList list) {
        Scanner input = new Scanner(System.in);
        if (x <= list.size() && x > 0) {
            return x;
        } else {
            System.err.println("Wrong input - the list has " + list.size() + " elements");
            return validateInputArrayList(input.nextInt(), list);
        }
    }

    public static int validatePositive(int x) {
        Scanner input = new Scanner(System.in);
        if (x <= 0) {
            System.err.println("Please, insert positive number");
            return validatePositive(input.nextInt());
        } else {
            return x;
        }
    }

    public static String valPartFullTime(String x) { 
        Scanner input = new Scanner(System.in);
        if (x.equalsIgnoreCase("Full Time") || x.equalsIgnoreCase("Part Time")) {
            return x;
        } else {
            System.err.println("You should type \"Full Time\" or \"Part Time\":");
            return valPartFullTime(input.nextLine());
        }

    }

    // Check if static date value can parse(date)
    public static void valDate() {
        Scanner input = new Scanner(System.in);
        try {
            LocalDate dateObj = LocalDate.parse(date);
        } catch (DateTimeParseException ex) {
            System.err.println("Invalid date, please insert a valid date with pattern yyyy-MM-dd");
            date = input.next();
            valDate();
        }
    }

//*******************************Select Methods************************** 
    // User selects a Course to save specific Students, Trainers , Assignments
    public static SchoolCourse schoolCourseSelection() {
        Scanner input = new Scanner(System.in);
        printListOfSchoolCourses();
        int choice = validateInputArrayList(input.nextInt(), listOfSchoolCourses);
        return listOfSchoolCourses.get(choice - 1);

    }

    public static Student studentSelection() {
        Scanner input = new Scanner(System.in);
        printListOfStudent();
        int choice = validateInputArrayList(input.nextInt(), listOfStudents);
        return listOfStudents.get(choice - 1);

    }

}
