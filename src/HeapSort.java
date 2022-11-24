import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 2, 9};
        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //sorting the array decreasing order
    public static void HeapSort(int [] arr){
        BuildMinHehap(arr);
        int lastIndex=arr.length-1;
        //swap first and last index then
        //call the heapify method
        while(lastIndex>=0){
            swap(0,lastIndex,arr);
            lastIndex--;
            minHeapify(arr,0,lastIndex);

        }}
    //Build the array as a heap
    public static void BuildMinHehap(int [] arr){
        int lastIndex = arr.length-1;
        //started from the min child which has a child
        for(int i=lastIndex/2 ; i>=0;i--){
            minHeapify(arr,i,lastIndex);
        }
    }


    //compare the left and right child with the parent then swap them
    public static void minHeapify(int [] arr, int i,int lastIndex){
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;

        if(left<=lastIndex && arr[i]>arr[left] ){
            min = left;
        }
        if( right<=lastIndex &&arr[min]>arr[right]){
            min = right;
        }

        if(min != i){
            swap(min,i,arr);
            minHeapify(arr,min,lastIndex);
        }
    }

    //swap the given numbers
    public static void swap(int i, int k, int [] arr){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k]= temp;
    }

}