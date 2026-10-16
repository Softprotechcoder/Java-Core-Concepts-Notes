package InterviewQuestionPractice;

import java.util.Arrays;

public class revSerieseProblem {
    public static void main(String[] args) {
        /*
        Given an integer array arr[] and an integer k, reverse every consecutive group of k elements. 
        If fewer than k elements remain at the end, reverse all of them.
        k=3 
        input  -> 1,2,3,4,5,6,7,8,9 
        output -> 3,2,1,6,5,4,9,8,7 

        */
        int[] arr = {1,2,3,4,5,6,7,8,9} ;
        int k = 3;

        if (arr.length < k || arr.length == k){
            Arrays.sort(arr);
            for(int res = arr.length ; res >= 0; res--){
                System.out.println(arr[res]);
            }
        }
        else{
            for(int i = 0; i < arr.length; i+=k ){
                int left = i;
                int right ;
                if(i+k-1 < arr.length)
                    right = i+k-1;
                else
                    right = arr.length-1;

                while (left < right) {
                    int tmp = arr[left];
                    arr[left] = arr [right];
                    arr[right] = tmp;
                    left++;
                    right--;
                    
                }

            }

        }
        for(int res = 0; res < arr.length; res++){
                System.out.print(arr[res]+" , ");
                
    }   
}
}