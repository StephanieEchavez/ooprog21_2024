import java.util.Scanner;

   public class SammysRentalPrice {
      public static void main (String[] args) {
      Scanner c = new Scanner(System.in);
    
      System.out.print("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + "\nS Sammy's makes it fun in the sun. S" + "\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

      System.out.print("\n\nEnter Number of Minutes: ");
      int min = c.nextInt();
      int hr = min / 60;
      System.out.printf("\nNumber of Hour/s:%d", hr);
      System.out.printf("\nNumber of Minutes:%d", min);

      if(min < 60){
             System.out.printf("\nRental Cost:$40");    
      }else {
        int rent = (min / 60 * 40) + ( min % 60);
        System.out.printf("\nTotal Cost:$%d", rent);
      } 
           
     }
   }   
