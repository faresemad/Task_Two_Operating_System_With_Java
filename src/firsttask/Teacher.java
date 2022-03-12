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

public class Teacher extends Person {
    int numOfCourses = 5;
    String [] courses = new String[numOfCourses];
    
    Teacher(String name , String address){
        super(name , address);
    }    
    
    public boolean addCourse(String course){
        for(int i=0; i<courses.length; i++){
            if(courses[i]==course){
                return false;
            }else if (courses[i]== null){
                courses[i]=course;
                break;
            }
        }
        return false;   
    }
    public boolean removeCourse(String course){
        for(int i=0; i<5; i++){
            if(courses[i]== course){
                courses[i] = " ";
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Teacher { " + "name = " + name + ", address = " + address + ", numOfCourses = " + numOfCourses + ", courses = " + Arrays.toString(courses) + " }";
    }
    
}
