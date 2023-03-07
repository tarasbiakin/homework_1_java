import java.util.ArrayList;
import java.util.Random;

public class case_2 {

    public class Main {
        
        Random random = new Random();
        int i = random.nextInt(2000);
        
    public static int[] firstBit(int i) {
        int[]values = new int[2];
        
        int n = Integer.toBinaryString(i).length();// это n
        values[0]=i;
        values[1] = n;
        //System.out.println(i);
        return values;}

    
    public static ArrayList<Integer> arrMult (int[] values){
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(values[0] <Short.MAX_VALUE){
            if(values[0]%values[1]==0){
                list.add(values[0]);
            }
            values[0]++;
        }
        return list;
    }

    public static ArrayList<Integer> noarrMult (int[] values){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        while( Short.MIN_VALUE<values[0]){
            if(values[0]%values[1]!=0){
                list1.add(values[0]);
            }
            values[0]--;
        }
        return list1;
    }

    

    public static void printArr(int[] List){
        for(int i =0;i < List.length;i++){
            System.out.println(List[i]);
        }

    }

       
    
    public static void main(String[] args) {

        int[] binarInt = firstBit(2000);
        arrMult ( binarInt );
        noarrMult(binarInt);
        System.out.println(arrMult(binarInt));
        //System.out.println(noarrMult(binarInt));
       

    }
        
        
    }
    
}
