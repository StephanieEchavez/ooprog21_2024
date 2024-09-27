public class Circle 
{
   double radius, diameter, area; 
 
   public Circle(){
      this.radius = 1.0;
      this.diameter = 2 * radius;
      this.area = 3.14159 * radius * radius;
   }
   public void setRad (double rad){
      this.radius = rad;
      this.diameter = 2 * radius;
      this.area = 3.14159 * radius * radius;
   }
   public double getRad(){
      return this.radius;
   }
   public  double getDia(){
      return this.diameter;
   }
   public  double getArea(){
      return this.area;
   }
}

import java.util.Scanner;
public class TestCircle {
   public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   Circle a = new Circle();
   Circle b = new Circle();
   Circle c = new Circle();
   a.setRadius(3);
   b.setRadius(20);
        System.out.println("Radius of the first circle: " + a.getRads());
        System.out.println("Diameter of the first circle: " + a.getDiam());
        System.out.println("Area of the first circle: " + a.getArea());

        System.out.println("\nRadius of the second circle: " + b.getRad());
        System.out.println("Diameter of the second circle: " + b.getDiam());
        System.out.println("Area of the second circle: " + b.getArea());
        
        System.out.print("\nInput radius for third circle: ");
        double usrInput = s.nextDouble();
        c.setRadius(usrInput);
        System.out.println("\nRadius of the second circle: " + c.getRad());
        System.out.println("Diameter of the second circle: " + c.getDiam());
        System.out.println("Area of the second circle: " + c.getArea());

           }
}
