/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RC;

/**
 *
 * @author Jarriath Marais
 */
public class Learner {
    
 private String FullName;
    private String Subject;
    private double AssignmentMark;
    private double TestMark;
    private double ExamMark;
    
public Learner () {
    this.FullName= "" ;
    this.Subject= "";
    this.AssignmentMark= 0;
    this.TestMark=0;
    this.ExamMark=0;
}

//Getters
public String getFullName() {
    return this.FullName;
}
public String getSubject() { 
    return this.Subject;
}
public double getAssignmentMark() {
    return this.AssignmentMark;
}
public double getTestMark() {
    return this.TestMark;
}
public double getExamMark() {
    return this.ExamMark;
} 
//Setters
public void setFullName(String FullName){
    this.FullName= FullName;
}    
public void setSubject(String Subject){
    this.Subject= Subject;
}    
public void setAssignmentMark(double AssignmentMark){
   this.AssignmentMark= AssignmentMark;
}
public void setTestMark(double TestMark){
    this.TestMark= TestMark;
}
public void setExamMark(double ExamMark){
    this.ExamMark= ExamMark;
}    
//Average
public double CalculateFinalMark() {
    return (getAssignmentMark() + getTestMark() + getExamMark())/3;
}
}

