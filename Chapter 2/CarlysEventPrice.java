import java.util.Scanner;

public class CarlysEventPrice {
   public static void main (String[] args) {
   Scanner c = new Scanner(System.in);
   int Total;
   System.out.print("*************************************" + 
                    "\n* Carly's makes the food that makes *" + 
                    "\n*\t\t\t\t it a party. \t\t\t\t*" + 
                    "\n*************************************");
   System.out.print("\nEnter number of guests: ");
   int Guest = c.nextInt();
   System.out.print("Price per guest: $35 ");
   
   Total = Guest * 35;
   System.out.printf("\nTotal cost: $%d", Total);
       if(Guest >= 50) {
       System.out.print("\nLarge event: True");
       }else {
       System.out.print("\nLarge event: False");
          } 
   }
}
