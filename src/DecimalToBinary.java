public class DecimalToBinary {
   public static void main(String[] args) {
      System.out.println(decToBin(14));
   }

   public static String decToBin(int a) {
      if (a <= 0) {
         return "";
      } else {
         String var10000 = decToBin(a / 2);
         return var10000 + Integer.toString(a % 2);
      }
   }
}
