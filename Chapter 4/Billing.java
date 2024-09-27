public class Billing {
   
      public static double compBill(double price) {
         double total = price + (price * 0.08);
         return total;
      }
      
      public static double compBill(double price, int quantity) {
         double total = (price * quantity) * ((price * quantity) * 0.08);
         return total;
      }

      public static double compBill(double price, int quantity, int coupon) {
         double disPrice = (price * quantity) - coupon;
         double total = disPrice * (disPrice + 0.08);
         return total;
      }
      
   public static void main(String[] args) {
      System.out.println("The total price for the bill is: " + compBill(23.2));
      System.out.println("The total price for the bill is: " + compBill(24.2, 2));
      System.out.println("The total price for the bill is: " + compBill(38.4518, 2, 6));
   } 
}
