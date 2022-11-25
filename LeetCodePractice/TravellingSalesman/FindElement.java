package TravellingSalesman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindElement {


    public static int[] Twosum(int arr[], int target) {



        for(int i=0;i<arr.length;i++){

            int ans= target-arr[i];

          int index2=  Binarysearch(arr,i+1,arr.length-1,ans);
          if(index2!=-1){
              return new int[]{i,index2};
          }

        }


        return new int[]{-1,-1};

    }

    public static int Binarysearch(int arr[],int start,int end, int target){

        while(start<end){
            int mid=(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }

        }

        return -1;
    }


    public static void main(String[] args) {
     int[] arr={1,2,3,4,5};
     int target=3;
     int[] answer=Twosum(arr,target);
        System.out.println(answer);
    }
}
