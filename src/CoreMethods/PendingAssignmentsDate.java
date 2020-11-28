/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreMethods;

import static CoreMethods.ManualDataMethods.date;
import static CoreMethods.OptionsMenu.listOfStudents;
import static CoreMethods.SupportMethods.valDate;
import CoreClasses.Student;
import AssistingClasses.StudentAssignment;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author eon_A
 */
public class PendingAssignmentsDate {

    public static void dealine() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a date to see who has pending assignments");
        date = input.next();
        valDate();
        LocalDate inputDate = LocalDate.parse(date);
        for (Student x : listOfStudents) {
            System.out.println("");
            System.out.println(x.getLastName() + " " + x.getFirstName() + ":");
            System.out.println("");
            for (StudentAssignment y : x.getListOfAssignmentsPerStudentPerCourse()) {

                if (inputDate.isBefore(y.getSubDateTime()) == true) {
                    Period period = Period.between(inputDate, y.getSubDateTime());
                    if (period.getDays() <= 7) {
                        System.out.println("Has to submit " + y.getTitle() + " in " + period.getDays() + " days");
                    } else {
                        System.out.println(y.getTitle() + " has more than 7 days till submission");
                    }

                } else if (inputDate.isEqual(y.getSubDateTime()) == true) {

                    System.out.println("Has to submit " + y.getTitle() + " NOW!!!");

                } else {
                    System.out.println("Has failed to submit " + y.getTitle());

                }

            }
        }

    }

}
