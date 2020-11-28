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
public class Assignment {
    private String title;
    private String description;
    private LocalDate subDateTime;
    private final String oralMark = "not graded yet (Max 20)";
    private final String totalMark = "not graded yet (Max 80)";

    public Assignment() {
    }

    public Assignment(String title, String description, LocalDate subDateTime) {
        
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        
        
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

    public String getOralMark() {
        return oralMark;
    }

//    public void setOralMark(int oralMark) {
//        this.oralMark = oralMark;
//    }

    public String getTotalMark() {
        return totalMark;
    }

//    public void setTotalMark(int totalMark) {
//        this.totalMark = totalMark;
//    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + ", totalMark=" + totalMark + '}';
    }
    
    
    
    
}
