import java.util.ArrayList;
import java.util.List;

public class quickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() ;
        list.add(55);
        list.add(2);
        list.add(12);
        list.add(4);
        list.add(5);

        qSort(list,0,list.size()-1);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }


    public static void qSort(List<Integer> list,int first, int last){
        if(first>=last)
            return;
        int pivot = divide(list,first,last);
        qSort(list,first,pivot-1);
        qSort(list,pivot+1,last);
    }


    public static int divide(List<Integer> list, int first, int last){
        int returnValue= first-1;
        for(int i =first;i<=last;i++){
            if(list.get(i)<=list.get(last)){
                returnValue++;
                if(i>=returnValue) {
                    int temp = list.get(i);
                    list.set(i, list.get(returnValue));
                    list.set(returnValue, temp);
                }}}

        return returnValue;
    }
}
