public class worksheet1 {
    public static void outputArrayValues(int[] arrayParameter){
        for (int i : arrayParameter){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        int[] integerArray1 = {2,6,3,4,12,10,7,9,8,1};
        int[] integerArray2 = {20,50,30,70,40};
        outputArrayValues(integerArray1);
        outputArrayValues(integerArray2);
    }
}
