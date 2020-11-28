/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreClasses;

import java.time.LocalDate;

/**
 *
 * @author eon_A
 */
public class StudentAssignment {
    
    private String title;
    private String description;
    private LocalDate subDateTime;
    private int oralMark;
    private int totalMark;

    public StudentAssignment(StudentAssignment that){
     this(that.getTitle(),that.getDescription(),that.getSubDateTime(), that.getOralMark(), that.getTotalMark());

    }
    
    //THESE ODJECTS WILL BE ADDED TO listOfAssignmentsPerStudentPerCourse INSIDE EVERY STUDENT
    public StudentAssignment() {
    }

    
    public StudentAssignment(String title, String description, LocalDate subDateTime, int oralMark, int totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "StudentAssignment{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + ", totalMark=" + totalMark + '}';
    }
    
    
    
}
