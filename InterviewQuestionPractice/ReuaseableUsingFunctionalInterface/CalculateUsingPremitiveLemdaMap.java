package InterviewQuestionPractice.ReuaseableUsingFunctionalInterface;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;


public class CalculateUsingPremitiveLemdaMap {
    static void CalculateWithMap(int arr[] , IntPredicate condition, IntUnaryOperator logic){
        Arrays.stream(arr)
            .filter(condition)
            .map(logic)
            .forEach(System.out::println);

    }
    
}
