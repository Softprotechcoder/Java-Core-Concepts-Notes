package InterviewQuestionPractice.ReArrangeArray;

public class TwoPointerSwaping {
/*
Input:  [*, ?, ?, *, *, ?, ?, *]
Output: [?, ?, ?, ?, *, *, *, *]
*/
    void rearrangeByTwoPointerSwaping(char[] arr){
        int left = 0;
        System.out.println("Using Two Pointer Approach");
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == '?'){
                char temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp; 
                left ++;
            }
            
            // System.out.print(arr[i]);
        }
        for(char arranged : arr)
            System.out.print(arranged);
    }
    
}
