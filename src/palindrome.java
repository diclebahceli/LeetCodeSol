public class palindrome {
   public static void main(String[] args) {
      System.out.println(IsPalindromeWord("kayakslkdnv"));
   }

   public static boolean IsPalindromeWord(String word) {
      if (word.length() != 0 && word.length() != 1) {
         return word.charAt(0) == word.charAt(word.length() - 1) ? IsPalindromeWord(word.substring(1, word.length() - 1)) : false;
      } else {
         return true;
      }
   }
}
