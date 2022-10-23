public class Main {
   public static void main(String[] args) {
      int[] arr = new int[]{10, 3, 7, 5};
      printArray(selectionSort(arr));
   }

   public static int[] copyArray(int[] arr) {
      int[] arrCopy = new int[arr.length];
      System.arraycopy(arr, 0, arrCopy, 0, arr.length);
      return arrCopy;
   }

   public static void printArray(int[] arr) {
      int[] var1 = arr;
      int var2 = arr.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int j = var1[var3];
         System.out.println(j);
      }

   }

   public static int[] selectionSort(int[] arr) {
      int[] arrayCopy = copyArray(arr);

      for(int i = 0; i < arr.length; ++i) {
         int min = arrayCopy[i];
         int j = i + 1;

         int index;
         for(index = i; j < arrayCopy.length; ++j) {
            if (arrayCopy[j] < min) {
               min = arrayCopy[j];
               index = j;
            }
         }

         arrayCopy[index] = arrayCopy[i];
         arrayCopy[i] = min;
      }

      return arrayCopy;
   }
}
