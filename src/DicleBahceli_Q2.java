import java.util.Random;
//My groupmate is Recep Samet Yigitkalan- 20200808065
public class DicleBahceli_Q2 {
    public static void main(String[] args) {

        //Find the missing element of array
        //and plot the starting and ending time
        int [] arr10k = createArray(10000);
        long start_10k = System.currentTimeMillis();
        quickSort(arr10k,0,arr10k.length-1);
        long end_10k = System.currentTimeMillis();
        System.out.println("10k time " + (end_10k-start_10k));


        int [] arr20k = createArray(20000);
        long start_20k = System.currentTimeMillis();
        quickSort(arr20k,0,arr20k.length-1);
        long end_20k = System.currentTimeMillis();
        System.out.println("20k time " + (end_20k-start_20k));


        int [] arr30k = createArray(30000);
        long start_30k = System.currentTimeMillis();
        quickSort(arr30k,0,arr30k.length-1);
        long end_30k = System.currentTimeMillis();
        System.out.println("30k time " + (end_30k-start_30k));


        int [] arr40k = createArray(40000);
        long start_40k = System.currentTimeMillis();
        quickSort(arr40k,0,arr40k.length-1);
        long end_40k = System.currentTimeMillis();
        System.out.println("40k time " + (end_40k-start_40k));


        int [] arr50k = createArray(50000);
        long start_50k = System.currentTimeMillis();
        quickSort(arr50k,0,arr50k.length-1);
        long end_50k = System.currentTimeMillis();
        System.out.println("50k time " + (end_50k-start_50k));


        int [] arr60k = createArray(60000);
        long start_60k = System.currentTimeMillis();
        quickSort(arr60k,0,arr60k.length-1);
        long end_60k = System.currentTimeMillis();
        System.out.println("60k time " + (end_60k-start_60k));


        int [] arr70k = createArray(70000);
        long start_70k = System.currentTimeMillis();
        quickSort(arr70k,0,arr70k.length-1);
        long end_70k = System.currentTimeMillis();
        System.out.println("70k time " + (end_70k-start_70k));


        int [] arr80k = createArray(80000);
        long start_80k = System.currentTimeMillis();
        quickSort(arr80k,0,arr80k.length-1);
        long end_80k = System.currentTimeMillis();
        System.out.println("80k time " + (end_80k-start_80k));


        int [] arr90k = createArray(90000);
        long start_90k = System.currentTimeMillis();
        quickSort(arr90k,0,arr90k.length-1);
        long end_90k = System.currentTimeMillis();
        System.out.println("90k time " + (end_90k-start_90k));


        int [] arr100k = createArray(100000);
        long start_100k = System.currentTimeMillis();
        quickSort(arr100k,0,arr100k.length-1);
        long end_100k = System.currentTimeMillis();
        System.out.println("100k time " + (end_100k-start_100k));



    }

    //It will shuffle the given array
    public static int [] shuffle(int [] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }
    //Create an array which is ordered and does not have a missing element
    //Then shuffle it and return it
    public static int [] createArray(int size){
        int [] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = i+1;
            }

        return shuffle(arr);
    }
    //This is basic quick sort algorithm
    public static void quickSort(int [] list, int first, int last){
        if(first>=last)
            return;
        int pivot = divide(list,first,last);
        quickSort(list,first,pivot-1);
        quickSort(list,pivot+1,last);
    }
    public static int divide(int [] arr,int pivot,int index) {
        while (pivot != index) {
            //If pivot is smaller than the index
            //and the pivoth element of array smaller than the indexth
            //element it will decrease the index
            if (pivot < index && arr[pivot] < arr[index]) {
                index--;
            }
            //if the pivot is smaller than the index and
            //and the pivoth element of array is bigger than the indexth
            //element than it will swap the values and the indexes also
            else if (pivot < index && arr[pivot]>= arr[index]) {
                int temp = arr[pivot];
                arr[pivot] = arr[index];
                arr[index] = temp;
                temp = index;
                index = pivot;
                pivot = temp;
                index++;
            }
            //If pivot is bigger than the index
            //and the pivoth element of array bigger than the indexth
            //element it will increase the index
            else if (pivot > index && arr[pivot] > arr[index]) {
                index++;
            }
            //if the pivot is bigger than the index and
            //and the pivoth element of array is bigger than the indexth
            //element than it will swap the values and the indexes also
            else if (pivot > index && arr[pivot] <= arr[index]) {
                int temp = arr[pivot];
                arr[pivot] = arr[index];
                arr[index] = temp;
                temp = pivot;
                pivot = index;
                index = temp;
                index--;
            }


        }

        if(pivot <=0 ){
            return 0;
        }
        return pivot;
        }
}
