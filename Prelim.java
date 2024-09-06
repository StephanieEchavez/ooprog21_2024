public class Prelim {
   public static void main(String[] args) {
      int first = 0;
      int second = 1;
      
      
      int n = 10;
      System.out.println("Name: Stephanie Echavez");
      System.out.println("PRELIM EXAM OUTPUT: ");
      for(int i = 0; i <= n; i++) {
      
         System.out.println("Fibonacci(" + i + ")--> " + first);
      
         int next = first + second;
         first = second;
         second = next;
         
     }
   }
 }
