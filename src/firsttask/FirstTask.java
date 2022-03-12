/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firsttask;

/**
 *
 * @author Fares Emad
 */
public class FirstTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        =======================================
        Circle circle = new Circle(60,"Yello");
        System.out.println(circle.getArea());
//        =======================================
        Account acc1 = new Account("1000166114","Fares Emad",1024);
        System.out.println(acc1.toString());
        Account acc2 = new Account("1000159753","Just Fares",2048);
        System.out.println(acc2.toString());
        acc1.transferTo(acc2, 1025);
        System.out.println(acc1.toString());
//        =======================================
        Student std1= new Student("Gems_Bond","anyWhere");
        std1.addCourseGrade("CompTIA N+", 75);
        std1.addCourseGrade("DataBase", 64);
        std1.addCourseGrade("Electronics", 73);
        std1.addCourseGrade("Algorithm", 90);
        std1.addCourseGrade("Logic", 86);
        System.out.println(std1.toString());
//        std1.printGrades();
        System.out.println(std1.getAverageGrade());
//        =======================================
        Teacher teacher1 = new Teacher("Nada", "MU");
        teacher1.addCourse("AI");
        teacher1.addCourse("Software Engineering");
        teacher1.addCourse("Android APP");
        teacher1.addCourse("Image Processing");
        teacher1.addCourse("Operating System");
        System.out.println(teacher1.toString());
        teacher1.removeCourse("Android APP");
        System.out.println(teacher1.toString());
//        =======================================
    }
    
}
