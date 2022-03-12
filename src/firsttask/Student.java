/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttask;
import java.util.Arrays;

/**
 *
 * @author Fares Emad
 */

public class Student extends Person {
    int numOfCourses = 30;
    String[] courses = new String[numOfCourses];
    int[] grades = new int[numOfCourses];
    
    Student(String name, String address){
        super(name , address);
    }
    
    public void addCourseGrade(String course , int grade){
        for(int i=0 ;i < courses.length ; i++ ){
            if(courses[i] == null){
                courses[i]= course;
                grades[i]= grade;
                break;
            }
        }
    }
    public void printGrades(){
        for(int i=0; i< grades.length; i++){
            System.out.print(courses[i] +" ");
            System.out.println(grades[i]);
        }
    }
    public double getAverageGrade(){
        double sum = 0;
        double average;
        int count =0 ;
        for(int i=0; i< grades.length;i++){
            if(grades[i] != 0){
            count++ ;   
            sum = sum + grades[i];
            }
        }
        
        average = sum/count;
        return average;
    }  
    @Override
    public String toString() {
        return "Stuident { " + "name = " + name + ", address = " + address + "numOfCourses = " + numOfCourses + ", courses = " + Arrays.toString(courses) + ", grades = " + Arrays.toString(grades) + " }";
    }
    
    
}

