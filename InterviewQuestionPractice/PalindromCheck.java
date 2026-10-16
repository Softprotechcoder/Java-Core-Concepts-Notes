package InterviewQuestionPractice;

public class PalindromCheck {
    public static void main(String[] args) {
        int num = 121;
        int orig = num;
        int  rev = 0 ;

        while (num > 0){
           int rem = num %10 ;
           num /= 10;
           rev = rev * 10+rem;

        }
        System.out.println(orig == rev ? "Palindrome": "Not Palindrome");
    }
    
}
