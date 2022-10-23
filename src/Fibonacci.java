public class Fibonacci {
   public static void main(String[] args) {
      System.out.println(calculateFibonacci(5));
   }

   public static int calculateFibonacci(int n) {
      return n != 1 && n != 0 ? calculateFibonacci(n - 2) + calculateFibonacci(n - 1) : n;
   }
}
