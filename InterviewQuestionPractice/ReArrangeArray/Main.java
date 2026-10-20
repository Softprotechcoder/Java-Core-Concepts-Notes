package InterviewQuestionPractice.ReArrangeArray;
/*
Input:  [*, ?, ?, *, *, ?, ?, *]
Output: [?, ?, ?, ?, *, *, *, *]
*/
public class Main {
    public static void main(String[] args) {
        char[] arr = {'*', '?', '?', '*','*', '?', '?', '*'};
        // RearrangeUsingCounting rearrangeUsingCounting = new RearrangeUsingCounting();
        // rearrangeUsingCounting.solvingByCounting(arr);

        TwoPointerSwaping twoPointerSwaping = new TwoPointerSwaping();
        twoPointerSwaping.rearrangeByTwoPointerSwaping(arr);

    }
    
}
