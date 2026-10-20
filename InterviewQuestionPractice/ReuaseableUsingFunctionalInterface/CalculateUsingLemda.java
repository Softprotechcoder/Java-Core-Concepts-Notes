package InterviewQuestionPractice.ReuaseableUsingFunctionalInterface;

import java.util.Arrays;
import java.util.function.IntPredicate;


public class CalculateUsingLemda {
    void calculate(int[] arr , IntPredicate logic){
        Arrays.stream(arr)
            .filter(logic)
            .forEach(x->System.out.print(x+"\t"));
    }
    
}
