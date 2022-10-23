import java.util.Arrays;

public class Search {
   public static void main(String[] args) {
      int[] a = new int[]{1, 2, 3, 4};
      System.out.println(containsDuplicate(a));
   }

   public static boolean containsDuplicate(int[] nums) {
      if (nums.length <= 1) {
         return false;
      } else {
         Arrays.sort(nums);

         for(int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] == nums[i]) {
               return true;
            }
         }

         return false;
      }
   }
}
