import java.util.PriorityQueue;
import java.util.Random;

public class LeetCode215 {

    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,1));

    }

    public static int findKthLargest(int[] nums, int k) {
        return qSelect(nums,0,nums.length-1,k);
    }

    public static int qSelect(int [] nums, int first,int last, int k){
        int indexOfKthNum = nums.length-k;
        if(first==last)
            return nums[first];
        int pivot = divide(nums,first,last);
        if (indexOfKthNum == pivot)
            return nums[pivot];
        if(pivot>indexOfKthNum)
            return qSelect(nums,first,pivot-1,k);
        else
            return qSelect(nums,pivot+1,nums.length-1,k);

    }
    public static int divide(int [] arr, int first, int last){
        //It will choose a random index as an pivot
        Random rand = new Random();
        int randomIndex = rand.nextInt(first, last);
        int temp0 = arr[last];
        arr[last] = arr[randomIndex];
        arr[randomIndex] = temp0;
        //The remaining part is the Lomuto's Partitioning algorithm
        int returnValue= first-1;
        for(int i =first;i<=last;i++){
            if(arr[i]<=arr[last]){
                returnValue++;
                if(i>returnValue) {
                    int temp = arr[i];
                    arr[i] = arr[returnValue];
                    arr[returnValue] = temp;
                }}}

        return returnValue;
    }

}
