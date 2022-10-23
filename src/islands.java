public class islands {
   public static void main(String[] args) {
      int[][] arr = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
      System.out.println(countIslands(arr));
   }

   public static int countIslands(int[][] arr) {
      int counter = 0;

      for(int i = 0; i < arr.length; ++i) {
         for(int j = 0; j < arr[i].length; ++j) {
            if (arr[i][j] == 1) {
               ++counter;
               lookAround(arr, i, j);
            }
         }
      }

      return counter;
   }

   public static void lookAround(int[][] arr, int i, int j) {
      if (i >= 0 && j >= 0 && i < arr.length && j < arr[i].length && arr[i][j] != 0) {
         arr[i][j] = 0;
         lookAround(arr, i + 1, j);
         lookAround(arr, i - 1, j);
         lookAround(arr, i, j + 1);
         lookAround(arr, i, j - 1);
      }
   }
}
