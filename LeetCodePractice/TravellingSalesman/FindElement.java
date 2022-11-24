package TravellingSalesman;

import java.util.ArrayList;

public class FindElement {

    public static ArrayList<Integer> findingelemnet( int k , ArrayList<Integer> arr, int[] input, int i){

        if(i>=input.length){
            return arr;
        }
        if(input[i]==k){
            arr.add(i);
        }

          re  findingelemnet(k,arr,input,i+1);

        return arr;

    }

    public static void main(String[] args) {
        int arr[]={1,3,4,3,5};
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        findingelemnet(3,arrayList,arr,0);
        System.out.println(arrayList);
    }
}
