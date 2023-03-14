import java.util.Random;
//My groupmate is Recep Samet Yigitkalan- 20200808065
public class DicleBahceli_Q1 {
    public static void main(String[] args) {

        //Create an array which has the given amount of size
        //and plot the starting and ending time
        int [] arr10k = createArray(10000);
        long start_10k = System.currentTimeMillis();
        int missingNum = findMissing(arr10k,0,arr10k.length-1);
        long end_10k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum) + ", 10k time " + (end_10k-start_10k));


        int [] arr20k = createArray(20000);
        long start_20k = System.currentTimeMillis();
        int missingNum2 = findMissing(arr20k,0,arr20k.length-1);
        long end_20k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum2) +  ", 20k time " + (end_20k-start_20k));


        int [] arr30k = createArray(30000);
        long start_30k = System.currentTimeMillis();
        int missingNum3 = findMissing(arr30k,0,arr30k.length-1);
        long end_30k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum3) + ", 30k time " + (end_30k-start_30k));


        int [] arr40k = createArray(40000);
        long start_40k = System.currentTimeMillis();
        int missingNum4 = findMissing(arr40k,0,arr40k.length-1);
        long end_40k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum4) + ", 40k time " + (end_40k-start_40k));


        int [] arr50k = createArray(50000);
        long start_50k = System.currentTimeMillis();
        int missingNum5 = findMissing(arr50k,0,arr50k.length-1);
        long end_50k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum5) + ", 50k time " + (end_50k-start_50k));


        int [] arr60k = createArray(60000);
        long start_60k = System.currentTimeMillis();
        int missingNum6 = findMissing(arr60k,0,arr60k.length-1);
        long end_60k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum6) + ", 60k time " + (end_60k-start_60k));


        int [] arr70k = createArray(70000);
        long start_70k = System.currentTimeMillis();
        int missingNum7 = findMissing(arr70k,0,arr70k.length-1);
        long end_70k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum7) + ", 70k time " + (end_70k-start_70k));


        int [] arr80k = createArray(80000);
        long start_80k = System.currentTimeMillis();
        int missingNum8 = findMissing(arr80k,0,arr80k.length-1);
        long end_80k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum8) + ", 80k time " + (end_80k-start_80k));


        int [] arr90k = createArray(90000);
        long start_90k = System.currentTimeMillis();
        int missingNum9 = findMissing(arr90k,0,arr90k.length-1);
        long end_90k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum9) + ", 90k time " + (end_90k-start_90k));


        int [] arr100k = createArray(100000);
        long start_100k = System.currentTimeMillis();
        int missingNum10 = findMissing(arr100k,0,arr100k.length-1);
        long end_100k = System.currentTimeMillis();
        System.out.println("Missing number is: " +(missingNum10) + ", 100k time " + (end_100k-start_100k));
    }

    //Remove a random element from the array
    static int[] removeElement(int[] arr, int index) {
        int[] copy = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                copy[j++] = arr[i];
            }}
        return copy;
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
    //Then remove a random element, shuffle it and return it
    public static int [] createArray(int size){
        int [] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = i+1;
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(0, arr.length);
        arr = removeElement(arr,randomIndex);
        return shuffle(arr);
    }


    public static int findMissing(int [] arr, int first, int last){
        if(first>=last) {
            //The last patient is the exceptional case
            if(last == arr.length-1)
                return last+2;
            return first + 1;
        }
        int pivot = divide(arr,first,last);
        //if the pivot is on the right position
        //it will search for the right side
        //otherwise it will search for the left side
        if(arr[pivot] != pivot+1)
            return findMissing(arr,first,pivot-1);
        else
            return findMissing(arr,pivot+1,last);

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
                if(i>=returnValue) {
                    int temp = arr[i];
                    arr[i] = arr[returnValue];
                    arr[returnValue] = temp;
                }}}

        return returnValue;
    }
}
