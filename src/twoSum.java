public class twoSum {
   public static void main(String[] args) {
      int[] a = new int[]{2, 7, 11, 15};
      System.out.println(twoSum(a, 9));
   }

   public static int[] twoSum(int[] numbers, int target) {
      int sum = false;
      int[] result = new int[2];
      int max = numbers.length - 1;

      for(int i = 0; i < numbers.length && i < numbers.length && max >= 0; ++i) {
         int sum = numbers[i] + numbers[max];
         if (sum > target) {
            --max;
            --i;
         } else if (sum >= target) {
            result[0] = i + 1;
            result[1] = max + 1;
            break;
         }
      }

      return result;
   }
}
