/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreMethods;

import static CoreMethods.SupportMethods.printListOfAssignments;
import static CoreMethods.SupportMethods.printListOfAssignmentsPerCourse;
import static CoreMethods.SupportMethods.printListOfAssignmentsPerStudentPerCourse;
import static CoreMethods.SupportMethods.printListOfCourses;
import AssistingClasses.SchoolCourse;
import CoreClasses.Assignment;
import CoreClasses.Course;
import CoreClasses.Student;
import CoreClasses.Trainer;
import java.util.ArrayList;
import java.util.Scanner;
import static CoreMethods.SupportMethods.printListOfStudent;
import static CoreMethods.SupportMethods.printListOfStudentsPerCourse;
import static CoreMethods.SupportMethods.printListOfTrainers;
import static CoreMethods.SupportMethods.printListOfTrainersPerCourse;
import static CoreMethods.ManualDataMethods.manualGrader;
import static CoreMethods.SupportMethods.printlistOfStudentMoreThanOneCourses;

/**
 *
 * // * @author eon_A
 */
public class OptionsMenu {

    public static ArrayList<Student> listOfStudents = new ArrayList<>();
    public static ArrayList<Trainer> listOfTrainers = new ArrayList<>();
    public static ArrayList<Assignment> listOfAssignments = new ArrayList<>();
    public static ArrayList<Course> listOfCourses = new ArrayList<>();
    public static ArrayList<SchoolCourse> listOfSchoolCourses = new ArrayList<>();
    public static ArrayList<Student> listOfStudentMoreThanOneCourses = new ArrayList<>();
    static String loopCheck;
    static String loopCheck2;

    public static void indexPage() {
        int counter = 0;
        int choice2;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello!! \nDo you want to input your data manually?\nY / N or type \"exit\" to stop:");
        do {
            String choice = input.next();

            if (choice.equalsIgnoreCase("Y")) {

                System.out.println("~~~~~~~~~Courses, creation~~~~~~~~~");
                ManualDataMethods.inputCourses();

                System.out.println("~~~~~~~~~Students, creation~~~~~~~~~");
                ManualDataMethods.inputStudents();

                System.out.println("~~~~~~~~~Trainers, creation~~~~~~~~~");
                ManualDataMethods.inputTrainers();

                System.out.println("~~~~~~~~~Assignments, creation~~~~~~~~~");
                ManualDataMethods.inputAssignments();

                counter = 10;

            } else if (choice.equalsIgnoreCase("N")) {

                SyntheticDataMethods.botFiller();
                counter = 10;

            } else if (choice.equalsIgnoreCase("exit")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~The Program has been terminated~~~~~~~~~~~~~~~~~~~");
                System.exit(0);   //googled it!
            } else {

                if (counter < 9) {
                    System.err.println("Invalid Answer...\nPlease Try Again or Type \"exit\" to stop " + "\n*****" + (9 - counter) + " Attempts Remaining" + "*****");
                    counter++;
                } else {
                    System.out.println("~~~~~~~~~~~~~~~~~~~The Program has been terminated automatically~~~~~~~~~~~~~~~~~~~");
                    System.exit(0);
                }
            }

        } while (counter < 10);

        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~Options Menu~~~~~~~~~~~~~~~~~~~");
            System.out.println("type 1 to see Students list");
            System.out.println("type 2 to see Trainers' list");
            System.out.println("type 3 to see Assignments' list");
            System.out.println("type 4 to see Courses' list");
            System.out.println("type 5 to see the Students per course");
            System.out.println("type 6 to see the Trainers per course");
            System.out.println("type 7 to see the Assignments per course");
            System.out.println("type 8 to see the Assignments per Student");
            System.out.println("type 9 to put Grades on Students Assignments");
            System.out.println("type 10 to see the list of Students that participating to more than one Courses");
            System.out.println("type 11 to find the Pending Assignments for a particular week, regarding the date you will provide");
            System.out.println("type 0 to exit");
            choice2 = input.nextInt();
            switch (choice2) {
                case 1:
                    printListOfStudent();
                    break;
                case 2:
                    printListOfTrainers();
                    break;
                case 3:
                    printListOfAssignments();
                    break;
                case 4:
                    printListOfCourses();
                    break;
                case 5:
                    printListOfStudentsPerCourse();
                    break;
                case 6:
                    printListOfTrainersPerCourse();
                    break;
                case 7:
                    printListOfAssignmentsPerCourse();
                    break;
                case 8:
                    printListOfAssignmentsPerStudentPerCourse();
                    break;
                case 9:
                    manualGrader(); //either with manual or synthetic data, the user has to choose if he wants to give Mark Scores to the assignments of the Students (default is "0"). There is no such thing as Automatic Grades!!
                    break;
                case 10:
                    printlistOfStudentMoreThanOneCourses();
                    break;
                case 11:
                    PendingAssignmentsDate.dealine();
                    break;
                default:
                    System.out.println("");
                    System.err.println("!!!~~~!!!~~~!!!Invalid Answer, please press one of the above!!!~~~!!!~~~!!!");
                    System.out.println("");
                    break;

                case 0:
                    System.out.println("~~~~~~~~~~~~~~~~~~~The Program has been terminated~~~~~~~~~~~~~~~~~~~");
            }
        } while (choice2 != 0);

        System.out.println("");

    }
}//class
