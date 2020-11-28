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
import static CoreMethods.OptionsMenu.loopCheck;
import static CoreMethods.SupportMethods.studentSelection;
import AssistingClasses.StudentAssignment;
import java.time.LocalDate;
import java.util.Scanner;
import static CoreMethods.SupportMethods.valDate;

/**
 *
 * @author eon_A
 */
public class ManualDataMethods {

    static SupportMethods validateDates = new SupportMethods();
    static String date;

    public static void inputCourses() {

        do {
            Scanner input = new Scanner(System.in);

            Course course = new Course();
            SchoolCourse sCourse = new SchoolCourse(course);

            System.out.println("Title:");
            String title = input.nextLine();
            course.setTitle(title);

            System.out.println("Stream:");
            String stream = input.nextLine();
            course.setStream(stream);

            System.out.println("Type (Full Time or Part Time):");
            String answer = input.nextLine();
            course.setType(SupportMethods.valPartFullTime(answer));

            System.out.println("Please insert Start Date (\"yyyy-mm-dd\"):");
            date = input.next();
            valDate();
            LocalDate dateObj = LocalDate.parse(date);
            course.setStart_date(dateObj);

            System.out.println("Please insert End Date (\"yyyy-mm-dd\"):");
            date = input.next();
            valDate();
            LocalDate dateObj2 = LocalDate.parse(date);
            course.setEnd_date(dateObj2);

            listOfCourses.add(course);
            listOfSchoolCourses.add(sCourse);

            System.out.println("Do you want to add another Course? (Y/N)");
            loopCheck = input.next();

        } while (loopCheck.equalsIgnoreCase("Y"));

    }

    public static void inputStudents() {

        do {
            Scanner input = new Scanner(System.in);
            Student student = new Student();
            System.out.println("First name:");
            String firstName = input.nextLine();
            student.setFirstName(firstName);

            System.out.println("Last name:");
            String lastName = input.nextLine();
            student.setLastName(lastName);

            System.out.println("Date of birth (\"yyyy-mm-dd\"):");
            date = input.next();
            valDate();
            LocalDate dateObj = LocalDate.parse(date);
            student.setDateOfBirth(dateObj);

            System.out.println("Tuition Fees:");
            int tuitionFees = input.nextInt();
            student.setTuitionFees(SupportMethods.validatePositive(tuitionFees));

            listOfStudents.add(student);

            String loopCheck2 = "N";
            do {
                System.out.println("Please choose an available Course that the student will join:");
                SupportMethods.schoolCourseSelection().getListOfStudentsPerCourse().add(student);
                System.out.println("Will THIS Student join more Courses? (Y/N)");
                loopCheck2 = input.next();
                if (loopCheck2.equalsIgnoreCase("Y")) {
                    listOfStudentMoreThanOneCourses.add(student);
                }
            } while (loopCheck2.equalsIgnoreCase("Y")); //a loop that adds one student to multiple Courses

            System.out.println("Do you want to add another Student? (Y/N)");
            loopCheck = input.next();

        } while (loopCheck.equalsIgnoreCase("Y"));
    }

    public static void inputTrainers() {

        do {
            Scanner input = new Scanner(System.in);
            Trainer trainer = new Trainer();

            System.out.println("Please insert First name:");
            String firstName = input.nextLine();
            trainer.setFirstName(firstName);

            System.out.println("Please insert Last name:");
            String lastName = input.nextLine();
            trainer.setLastName(lastName);

            System.out.println("Please insert Subject:");
            String subject = input.nextLine();
            trainer.setSubject(subject);

            listOfTrainers.add(trainer);

            System.out.println("Please choose an available Course that the trainer will join:");
            SupportMethods.schoolCourseSelection().getListOfTrainersPerCourse().add(trainer);

            System.out.println("Do you want to add another Trainer? (Y/N)");
            loopCheck = input.next();

        } while (loopCheck.equalsIgnoreCase("Y"));
    }

    public static void inputAssignments() {

        do {
            Scanner input = new Scanner(System.in);
            Assignment assignment = new Assignment();
            StudentAssignment studentAssignment = new StudentAssignment();

            System.out.println("Please insert Title:");
            String title = input.next();
            assignment.setTitle(title);
            studentAssignment.setTitle(title);

            System.out.println("Please insert Description:");
            String description = input.next();
            assignment.setDescription(description);
            studentAssignment.setDescription(description);

            System.out.println("Please insert Sub. Date Time (\"yyyy-mm-dd\"):");
            date = input.next();
            valDate();
            LocalDate dateObj = LocalDate.parse(date);
            assignment.setSubDateTime(dateObj);
            studentAssignment.setSubDateTime(dateObj);

            listOfAssignments.add(assignment);

            System.out.println("Please choose an available Course that will incluede the assignemt:");
            SchoolCourse sCourse = SupportMethods.schoolCourseSelection();
            sCourse.getListOfAssignmentsPerCourse().add(assignment);
            for (int i = 0; i < sCourse.getListOfStudentsPerCourse().size(); i++) {
                StudentAssignment deepCopySA = new StudentAssignment(studentAssignment); //Deep Copy attempt with copy Constructor , in order to run the manualGrader Method to change the grades of the students independantly
                sCourse.getListOfStudentsPerCourse().get(i).getListOfAssignmentsPerStudentPerCourse().add(deepCopySA);
            }

            System.out.println("Do you want to add another Assignment? (Y/N)");
            loopCheck = input.next();

        } while (loopCheck.equalsIgnoreCase("Y"));
    }

    //A Method that grades the Assignments per Student
    public static void manualGrader() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~Select the student to grade his/her Assignments~~~~~~~~~");
        boolean caseCheck = false;
        String mark;
        String flag = "Y";
        do {
            if (flag.equalsIgnoreCase("Y")) {
                Student chosenStudent = studentSelection();
                for (int i = 0; i < chosenStudent.getListOfAssignmentsPerStudentPerCourse().size(); i++) {
                    System.out.println((i + 1) + ") " + chosenStudent.getListOfAssignmentsPerStudentPerCourse().get(i));
                    System.out.print("Oral Mark: ");
                    mark = input.next();
                    chosenStudent.getListOfAssignmentsPerStudentPerCourse().get(i).setOralMark(Integer.parseInt(mark));
                    System.out.print("Total Mark: ");
                    mark = input.next();
                    chosenStudent.getListOfAssignmentsPerStudentPerCourse().get(i).setTotalMark(Integer.parseInt(mark));
                    System.out.println("");
                }
            } else if (flag.equalsIgnoreCase("N")) {
                return;
            } else {

                System.err.println("Invalid Answer, type: Y or N");

            }
            System.out.println("Do you want to grade another Student? (Y / N)");
            flag = input.next();
        } while (caseCheck == false);

    }

}
