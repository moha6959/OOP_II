package challenge8;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class ArraySortReverse {
    public static void main(String[] args) {
        String[] pallets={"B14","A11","B12","A13"};
        //Sort the array in ascending order
        System.out.println("Sorted...");
        Arrays.sort(pallets);
        for(String pallet:pallets){
            System.out.println("__"+pallet);
        }
        //Reverse the sorted array
        System.out.println("Reversed...");
        List<String> palleList=Arrays.asList(pallets);
        Collections.reverse(palleList);
        for(String pallet : palleList){
            System.out.println("__"+pallet);
        }
    }
}
