/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RC;

import javax.swing.JOptionPane;

/**
 *
  * @author Jarriath Marais
 */
public class MaraisLearnerTaskTwoPrj {
//Installation
    static Learner objLearner= new Learner();
            
    public static void main(String[] args) {
        
        getStudentInput();
        displayFinalMark();    
    }
    //prompts
    public static void getStudentInput() {
        objLearner.setFullName(JOptionPane.showInputDialog("Please enter your Full Name: "));
         objLearner.setSubject(JOptionPane.showInputDialog("Please enter your Subject Name: "));
            objLearner.setAssignmentMark(Integer.parseInt(JOptionPane.showInputDialog("Please enter your AssignmentMark: ")));
               objLearner.setTestMark(Integer.parseInt(JOptionPane.showInputDialog("Please enter your Test Mark: ")));
               objLearner.setExamMark(Integer.parseInt(JOptionPane.showInputDialog("Please enter your Exam Mark: ")));
    }
    public static void displayFinalMark() {
        double  FinalMark;
        FinalMark = objLearner.CalculateFinalMark();
        JOptionPane.showInputDialog(null, FinalMark + "Your Final Mark is ");
    }   
}
