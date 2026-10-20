package InterviewQuestionPractice.ReArrangeArray;

public class RearrangeUsingCounting {
  void solvingByCounting(char[] arr ){
    int questionCount = 0 ,starCount = 0;
        for(int i =0; i<arr.length; i++){
            if (arr[i] == '?')
                questionCount++;
            else
            starCount++;
        }

        for (int j = 0; j<arr.length;j++){
            if (j< questionCount){
                arr[j]='?';
            }
            else
            arr[j] = '*';
        }
        System.out.println("No of ? : "+questionCount+"\nand No of * : "+starCount);
       for(char arranged : arr){
        System.out.print(arranged);
       }
  }
    
}
