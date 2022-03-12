/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttask;

/**
 *
 * @author Fares Emad
 */
public class Circle {
    double radious = 1.0;
    String color = "red";

    //setters and getters
    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //constructors
    public Circle() {
        
    }
    public Circle(double radious ){
        this.radious=radious;
    }
    
    public Circle(double radious , String color){
        this.radious=radious;
        this.color=color;
    }
    public double getArea(){
        double area = (22/7)*radious;
        return area;
    }

    @Override
    public String toString() {
        return "Circle {" + "radious = " + radious + ", color = " + color + "}";
    }
    
}

