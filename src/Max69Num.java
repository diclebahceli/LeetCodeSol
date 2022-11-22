public class Max69Num {
    public static void main(String[] args) {
        int numm = 696;
        System.out.println(maximum69Number(numm));
    }
    public static int maximum69Number(int num) {

        String newNum = Integer.toString(num);
        String lastNum="";
        int j=0;
        for(int i=0; i<newNum.length();i++){
            if(newNum.charAt(i)=='6' && j==0){
                j++;
                lastNum = lastNum + "9";
                continue;
            }
            lastNum = lastNum + newNum.charAt(i);
        }
        return Integer.parseInt(lastNum);
    }
}
