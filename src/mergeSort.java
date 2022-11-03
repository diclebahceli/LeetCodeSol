import java.util.ArrayList;

public class mergeSort {
   public static void main(String[] args) {
      ArrayList a = new ArrayList<Integer>();
      a.add(5);
      a.add(8);
      a.add(2);
      a.add(88);
      a.add(3);
      a.add(0);

      mergeSort(a,0,a.size());
      System.out.println(a.toString());


   }

   public static void mergeSort(ArrayList<Integer> a,int leftSide,int rightSide) {
      //Using mid point to decide the dividing point of our list
      int mid= (leftSide+rightSide)/2;
      //Until we have only an element we divide our indexes
      if(rightSide-leftSide<=1)
         return;
      //Recursion call for left side of our list
      mergeSort(a,leftSide,mid);
      //Recursion call for our right side of list
      mergeSort(a,mid,rightSide);
      //Calling the merge sort for sorting and merginf the left and the right side of list
      merge(a,leftSide,mid,rightSide);

   }

   public static void merge(ArrayList<Integer> a,int leftSide, int mid,
                                          int rightSide){
      //Creating a temporary lists for the left and the right parts of
      //the original list
      ArrayList<Integer> left=new ArrayList<Integer>();
      ArrayList<Integer> right=new ArrayList<Integer>();

      //Then fill the left and right lists belong the indexes
      for(int i=leftSide;i<mid;i++){
         left.add(a.get(i));
      }
      for(int i=mid;i<rightSide;i++){
         right.add(a.get(i));
      }

      int i=0,j=0;
      //Create a temporary index for original array
      //to not get an exception
      int temp= leftSide;
      //Compare the left and the right lists and sort the original array
      while(i<left.size() && j<right.size()){
         //If left side is smaller than set the left list into the original list firstly
         if(left.get(i)<right.get(j)){
          a.set(temp,left.get(i));
          temp++;
            i++;
         }//If the right side is smaller than set the right side into the original list firstly
         else if(right.get(j)<=left.get(i)){
           a.set(temp,right.get(j));
           temp++;
            j++;
         }


      }
      //We will go on for adding the remaining elements in the lists
      //If the onw of the left and right lists ends then the other one
      //will continue to add
      if(i<leftSide){
         for (int k=i;k<left.size();k++){
            a.set(temp,left.get(k));
            temp++;
         }
      }if(i<rightSide){
         for (int k=j;k<right.size();k++){
            a.set(temp,right.get(k));
            temp++;
         }
      }

   }
}
