public class binarySearch {
   public static void main(String[] args) {
      int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
      System.out.println(binaryS(a, 2, 5));
   }

   public static int binaryS(int[] arr, int mid, int num) {
      if ((arr.length - mid) / 2 >= 1 && mid / 2 >= 1) {
         if (num == arr[mid]) {
            return mid;
         } else if (num > arr[mid]) {
            mid += (arr.length - mid) / 2;
            return binaryS(arr, mid, num);
         } else if (num < arr[mid]) {
            mid -= mid / 2;
            return binaryS(arr, mid, num);
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }
}
