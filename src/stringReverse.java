public class stringReverse {
   public static void main(String[] args) {
      System.out.println(reverseString("araba"));
   }

   public static String reverseString(String input) {
      if (input.length() == 0) {
         return "";
      } else {
         char var10000 = input.charAt(input.length() - 1);
         return var10000 + reverseString(input.substring(0, input.length() - 1));
      }
   }
}
