package w11;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape
{  
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    public void displayShapeInfo(){
    System.out.println("The area is =" +calculateArea());
    System.out.println("The perimeter is =" +calculatePerimeter());
    }
}